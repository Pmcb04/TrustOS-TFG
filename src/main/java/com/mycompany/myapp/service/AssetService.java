package com.mycompany.myapp.service;

import java.util.Map;

import org.springframework.stereotype.Service;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.mycompany.myapp.domain.trustos.Asset;
import com.mycompany.myapp.domain.trustos.LoginTrustos;
import com.mycompany.myapp.domain.trustos.Message;
import com.mycompany.myapp.domain.trustos.Transaction;
import com.mycompany.myapp.service.dto.trustos.AssetDTO;
import com.mycompany.myapp.util.TrustOS;

/**
 * Service class for managing assets.
 */
@Service
public class AssetService {

    private final Gson gson = new GsonBuilder().setPrettyPrinting().serializeNulls().create();

    private final TrustOS trustos = new TrustOS();

    private final String TRACK_URL = "/track";

    /**
     * Login in track module
     *
     * @param auth contain the id ans password of user
     */
    public Message login(LoginTrustos auth) {
        JsonObject body = JsonParser.parseString(gson.toJson(auth, LoginTrustos.class)).getAsJsonObject();
        return new Gson().fromJson(trustos.post(TRACK_URL + "/login", body), Message.class);
    }

    /**
     * Create an asset
     *
     * @param assetDTO assetDTO to create
     * @param token     jwt token to access the TrustOS platform
     */
    public Asset createAsset(AssetDTO assetDTO, String token) {
        JsonObject body = JsonParser.parseString(gson.toJson(assetDTO, AssetDTO.class)).getAsJsonObject();
        return new Gson().fromJson(trustos.post(TRACK_URL + "/asset/create", body, token).get("output"), Asset.class);
    }

    /**
     * Obtain an asset
     *
     * @param assetId   identifier of asset
     * @param isAuthorised obtain authorised assets
     * @param token     jwt token to access the TrustOS platform
     */
    // @Cacheable(cacheNames = "assets", key = "#assetId")
    public Asset getAsset(String assetId, boolean isAuthorised, String token) {
        return new Gson()
            .fromJson(trustos.get(TRACK_URL + "/asset/" + assetId + "?isAuthorised=" + isAuthorised, token).get("output"), Asset.class);
    }

    /**
     * Obtain a list of assets identifiers for a user
     *
     * @param isAuthorised obtain authorised assets
     * @param token     jwt token to access the TrustOS platform
     */
    public String[] getAssets(boolean isAuthorised, String token) {
        return new Gson()
            .fromJson(
                trustos
                    .get(TRACK_URL + "/assets/" + "?isAuthorised=" + isAuthorised, token)
                    .getAsJsonObject("output")
                    .getAsJsonArray("assetId"),
                String[].class
            );
    }

    /**
     * Update an asset
     *
     * @param assetId   identifier of asset
     * @param metadata  information mutable of asset.
     * @param isAuthorised obtain authorised assets
     * @param token     jwt token to access the TrustOS platform
     */
    public Asset updateAsset(String assetId, Map<String, Object> metadata, boolean isAuthorised, String token) {
        // build the request
        JsonObject json = new JsonObject();
        json.add("metadata", JsonParser.parseString(metadata.toString()));

        return new Gson()
            .fromJson(
                trustos.post(TRACK_URL + "/asset/" + assetId + "/update?isAuthorised=" + isAuthorised, json, token).get("output"),
                Asset.class
            );
    }

    /**
     * Obtain a transaction of one asset
     *
     * @param assetId   identifier of asset
     * @param isAuthorised obtain authorised assets
     * @param token     jwt token to access the TrustOS platform
     */
    public Transaction getAssetTransaction(String assetId, boolean isAuthorised, String token) {
        return new Gson()
            .fromJson(
                trustos.get(TRACK_URL + "/asset/" + assetId + "/transactions?isAuthorised=" + isAuthorised, token),
                Transaction.class
            );
    }
}
