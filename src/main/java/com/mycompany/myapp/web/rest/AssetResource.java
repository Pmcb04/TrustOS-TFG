package com.mycompany.myapp.web.rest;

import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.mycompany.myapp.domain.trustos.Asset;
import com.mycompany.myapp.domain.trustos.LoginTrustos;
import com.mycompany.myapp.domain.trustos.Message;
import com.mycompany.myapp.domain.trustos.Transaction;
import com.mycompany.myapp.service.AssetService;
import com.mycompany.myapp.service.dto.trustos.AssetDTO;

/**
 * REST controller for managing the current user's account.
 */
@RestController
@RequestMapping("/trustos")
public class AssetResource {

    private final Logger log = LoggerFactory.getLogger(AccountResource.class);

    private final AssetService assetService;

    /**
     * @param assetService
     */
    public AssetResource(AssetService assetService) {
        this.assetService = assetService;
    }

    /**
     * {@code POST  /login} : login in the platform
     *
     * @param auth id and password
     */
    @PostMapping("/login")
    public ResponseEntity<Message> login(@RequestBody LoginTrustos auth) {
        System.out.println("LOGIN TRUSTOS");
        return ResponseEntity.ok(assetService.login(auth));
    }

    /**
     * {@code POST  /assets} : create an asset
     *
     * @param assetDTO assetDTO to create
     * @param token token authorization to track module
     */
    @PostMapping("/assets")
    public ResponseEntity<Asset> createAsset(@RequestBody AssetDTO assetDTO, @RequestHeader(HttpHeaders.AUTHORIZATION) String token) {
        return ResponseEntity.ok(assetService.createAsset(assetDTO, token));
    }

    /**
     * {@code GET  /assets} : obtains all assets for a user
     *
     * @param isAuthorised flag to obtain authorised assets or not
     * @param token token authorization to track module
     */
    @GetMapping("/assets")
    public ResponseEntity<String[]> getAssets(@RequestParam boolean isAuthorised, @RequestHeader(HttpHeaders.AUTHORIZATION) String token) {
        return ResponseEntity.ok(assetService.getAssets(isAuthorised, token));
    }

    /**
     * {@code GET  /assets/{assetId}} : obtains the asset with assetId
     *
     * @param assetId identifier of asset to obtain
     * @param isAuthorised flag to obtain authorised assets or not
     * @param token token authorization to track module
     */
    @GetMapping("/assets/{assetId}")
    public ResponseEntity<Asset> getAsset(
        @PathVariable String assetId,
        @RequestParam Boolean isAuthorised,
        @RequestHeader(HttpHeaders.AUTHORIZATION) String token
    ) {
        return ResponseEntity.ok(assetService.getAsset(assetId, isAuthorised, token));
    }

    /**
     * {@code POST  /assets/update/{assetId}} : update the asset with assetId
     *
     * @param assetId identifier of asset to obtain
     * @param isAuthorised flag to obtain authorised assets or not
     * @param metadata data to update the asset
     * @param token token authorization to track module
     */
    @PostMapping("/assets/update/{assetId}")
    public ResponseEntity<Asset> updateAsset(
        @PathVariable String assetId,
        @RequestParam Boolean isAuthorised,
        @RequestBody Map<String, Object> metadata,
        @RequestHeader(HttpHeaders.AUTHORIZATION) String token
    ) {
        return ResponseEntity.ok(assetService.updateAsset(assetId, metadata, isAuthorised, token));
    }

    /**
     * {@code GET  /assets/transactions/{assetId}} : obtains the transactions of a one asset
     *
     * @param assetId identifier of asset to obtain the transactions
     * @param isAuthorised flag to obtain authorised assets or not
     * @param token token authorization to track module
     */
    @GetMapping("/assets/transactions/{assetId}")
    public ResponseEntity<Transaction> getTransactionAsset(
        @PathVariable String assetId,
        @RequestParam Boolean isAuthorised,
        @RequestHeader(HttpHeaders.AUTHORIZATION) String token
    ) {
        return ResponseEntity.ok(assetService.getAssetTransaction(assetId, isAuthorised, token));
    }
}
