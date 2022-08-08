package com.mycompany.myapp.service;

import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.mycompany.myapp.domain.trustos.Asset;
import com.mycompany.myapp.domain.trustos.LoginTrustos;
import com.mycompany.myapp.domain.trustos.Message;
import com.mycompany.myapp.service.dto.AssetDTO;
import com.mycompany.myapp.util.TrustOS;
import com.mycompany.myapp.util.TrustOS.CallType;

/**
 * Service class for managing assets.
 */
@Service
public class AssetService {

    private final Logger log = LoggerFactory.getLogger(AssetService.class);

    private final Gson gson = new GsonBuilder().setPrettyPrinting().serializeNulls().create();

    private final TrustOS trustos = new TrustOS();

    private final String TRUCK_URL = "/truck";

    public Message login(LoginTrustos auth) {
        return new Gson().fromJson(trustos.call(CallType.POST, TRUCK_URL + "/login", gson.toJson(auth, LoginTrustos.class)), Message.class);
    }

    /**
     * Create an asset
     *
     * @param assetDTO assetDTO to create
     */
    public Asset createAsset(AssetDTO assetDTO, String token) {
        return new Gson()
            .fromJson(trustos.call(CallType.POST, TRUCK_URL + "/create", gson.toJson(assetDTO, AssetDTO.class), token), Asset.class);
    }

    /**
     * Obtain an asset
     *
     * @param assetID   identifier of asset
     * @param isAuthorised obtain authorised assets
     */
    public void getAsset(String assetID, boolean isAuthorised) {}

    /**
     * Update an asset
     *
     * @param assetID   identifier of asset
     * @param isAuthorised obtain authorised assets
     * @param metadata  information mutable of asset.
     */
    public void updateAsset(String assetID, Map<String, Object> metadata, boolean isAuthorised) {}

    /**
     * Obtain a transaction of one asset
     *
     * @param assetID   identifier of asset
     * @param isAuthorised obtain authorised assets
     */
    public void getAssetTransaction(String assetID, boolean isAuthorised) {}
}
