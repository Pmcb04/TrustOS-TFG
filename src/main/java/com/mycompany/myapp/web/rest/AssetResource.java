package com.mycompany.myapp.web.rest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mycompany.myapp.domain.trustos.Asset;
import com.mycompany.myapp.domain.trustos.LoginTrustos;
import com.mycompany.myapp.domain.trustos.Message;
import com.mycompany.myapp.service.AssetService;
import com.mycompany.myapp.service.dto.AssetDTO;

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
     * {@code POST  /assets} : create an asset
     *
     * @param assetDTO assetDTO to create
     */
    @PostMapping("/assets")
    public ResponseEntity<Asset> createAsset(@RequestBody AssetDTO asset, @RequestHeader(HttpHeaders.AUTHORIZATION) String token) {
        return ResponseEntity.ok(assetService.createAsset(asset, token));
    }

    /**
     * {@code POST  /login} : login in the platform
     *
     * @param auth id and password
     */
    @PostMapping("/login")
    public ResponseEntity<Message> login(@RequestBody LoginTrustos auth) {
        return ResponseEntity.ok(assetService.login(auth));
    }

    public void getAsset() {}

    public void updateAsset() {}

    public void getTransactionAsset() {}
}
