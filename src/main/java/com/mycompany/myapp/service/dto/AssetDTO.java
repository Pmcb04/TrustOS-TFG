package com.mycompany.myapp.service.dto;

import com.mycompany.myapp.domain.Asset;

public class AssetDTO {

    private String assetID;

    private String hash;

    /**
     * @param asset
     */
    public AssetDTO(Asset asset) {
        this.assetID = asset.getAssetID();
        this.hash = asset.getHash();
    }

    /**
     * @return the assetID
     */
    public String getAssetID() {
        return assetID;
    }

    /**
     * @param assetID the assetID to set
     */
    public void setAssetID(String assetID) {
        this.assetID = assetID;
    }

    /**
     * @return the hash
     */
    public String getHash() {
        return hash;
    }

    /**
     * @param hash the hash to set
     */
    public void setHash(String hash) {
        this.hash = hash;
    }

    /* (non-Javadoc)
     * @see java.lang.Object#toString()
     */

    @Override
    public String toString() {
        return "AssetDTO [assetID=" + assetID + ", hash=" + hash + "]";
    }
}
