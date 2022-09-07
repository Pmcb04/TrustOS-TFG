package com.mycompany.myapp.service;

import java.util.Map;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.mycompany.myapp.domain.trustos.Asset;
import com.mycompany.myapp.domain.trustos.LoginTrustos;
import com.mycompany.myapp.domain.trustos.Message;
import com.mycompany.myapp.domain.trustos.Transaction;
import com.mycompany.myapp.service.dto.trustos.AssetDTO;
import com.mycompany.myapp.util.TrustOS;
import com.mycompany.myapp.util.TrustOS.CallType;

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
        return new Gson().fromJson(trustos.call(CallType.POST, TRACK_URL + "/login", gson.toJson(auth, LoginTrustos.class)), Message.class);
    }

    /**
     * Create an asset
     *
     * @param assetDTO assetDTO to create
     * @param token     jwt token to access the TrustOS platform
     */
    public Asset createAsset(AssetDTO assetDTO, String token) {
        return new Gson()
            .fromJson(
                trustos.call(CallType.POST, TRACK_URL + "/asset/create", gson.toJson(assetDTO, AssetDTO.class), token).get("output"),
                Asset.class
            );
    }

    /**
     * Obtain an asset
     *
     * @param assetId   identifier of asset
     * @param isAuthorised obtain authorised assets
     * @param token     jwt token to access the TrustOS platform
     */
    @Cacheable(cacheNames = "assets", key = "#assetId")
    public Asset getAsset(String assetId, boolean isAuthorised, String token) {
        return new Gson()
            .fromJson(
                trustos.call(CallType.GET, TRACK_URL + "/asset/" + assetId + "?isAuthorised=" + isAuthorised, null, token).get("output"),
                Asset.class
            );
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
                    .call(CallType.GET, TRACK_URL + "/assets/" + "?isAuthorised=" + isAuthorised, null, token)
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
        return new Gson()
            .fromJson(
                trustos
                    .call(
                        CallType.POST,
                        TRACK_URL + "/asset/" + assetId + "/update?isAuthorised=" + isAuthorised,
                        gson.toJson(metadata),
                        token
                    )
                    .get("output"),
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
                trustos.call(CallType.GET, TRACK_URL + "/asset/" + assetId + "/transactions?isAuthorised=" + isAuthorised, null, token),
                Transaction.class
            );
    }
}
