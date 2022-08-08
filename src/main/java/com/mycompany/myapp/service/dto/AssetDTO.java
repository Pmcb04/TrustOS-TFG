package com.mycompany.myapp.service.dto;

import java.util.Map;

import javax.persistence.Id;
import javax.validation.constraints.NotNull;

import com.mycompany.myapp.domain.trustos.Asset;

public class AssetDTO {

    @NotNull
    @Id
    private String assetID;

    private Map<String, Object> data;

    private Map<String, Object> metadata;

    /**
     * @param asset
     */
    public AssetDTO(Asset asset) {
        this.assetID = asset.getAssetID();
        this.data = asset.getData();
        this.metadata = asset.getMetadata();
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
     * @return the data
     */
    public Map<String, Object> getData() {
        return data;
    }

    /**
     * @param data the data to set
     */
    public void setData(Map<String, Object> data) {
        this.data = data;
    }

    /**
     * @return the metadata
     */
    public Map<String, Object> getMetadata() {
        return metadata;
    }

    /**
     * @param metadata the metadata to set
     */
    public void setMetadata(Map<String, Object> metadata) {
        this.metadata = metadata;
    }

    /* (non-Javadoc)
     * @see java.lang.Object#toString()
     */

    @Override
    public String toString() {
        return "AssetDTO [assetID=" + assetID + ", data=" + data + ", metadata=" + metadata + "]";
    }
}
