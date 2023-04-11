package com.mycompany.myapp.service.trustos;

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
import com.mycompany.myapp.service.dto.TransactionDTO;
import com.mycompany.myapp.service.TransactionService;
import com.mycompany.myapp.util.TrustOS;
import java.util.*;
import java.util.stream.*; 

/**
 * Service class for managing assets.
 */
@Service
public class AssetService {

    private final Gson gson = new GsonBuilder().setPrettyPrinting().serializeNulls().create();

    private final TrustOS trustos = new TrustOS();

    private final TransactionService transactionService;

    private final String TRACK_URL = "/track";

    public AssetService(TransactionService transactionService) {
        this.transactionService = transactionService;
    }

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
        Set<TransactionDTO> transactions = transactionService.findAllByProduct(assetDTO.getData().get("type") + "");
        Map<String, Object> newMetadata = assetDTO.getMetadata();

        JsonObject transactionJson = new JsonObject();
        for (TransactionDTO transaction : transactions) {
            transactionJson.addProperty(transaction.getName().toString().trim().replace(" ", "_"), 0 );
        }
        newMetadata.put("actions", transactionJson);
        assetDTO.setMetadata(newMetadata);

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
        JsonObject body = new JsonObject(); 
        body.add("metadata", JsonParser.parseString(gson.toJson(metadata)).getAsJsonObject());

        return new Gson()
            .fromJson(
                trustos.post(TRACK_URL + "/asset/" + assetId + "/update?isAuthorised=" + isAuthorised, body, token).get("output"),
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
                trustos.get(TRACK_URL + "/asset/" + assetId + "/transactions?isAuthorised=" + isAuthorised, token).get("output"),
                Transaction.class
            );
    }

    /**
     * Obtain a transaction of one asset in a defined range
     *
     * @param assetId   identifier of asset
     * @param isAuthorised obtain authorised assets
     * @param token     jwt token to access the TrustOS platform
     */
    public Transaction getAssetRangeTransaction(String assetId, boolean isAuthorised, Map<String, Object> request, String token) {
        // build the request
        JsonObject body = new JsonObject();
        body.addProperty("init", request.get("init").toString());
        body.addProperty("end", request.get("end").toString());

        return new Gson()
            .fromJson(
                trustos
                    .post(TRACK_URL + "/asset/" + assetId + "/transactions/range?isAuthorised=" + isAuthorised, body, token)
                    .get("output"),
                Transaction.class
            );
    }
}
