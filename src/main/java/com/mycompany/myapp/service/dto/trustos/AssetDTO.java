package com.mycompany.myapp.service.dto.trustos;

import java.util.Map;

public class AssetDTO {

    private String assetId;

    private Map<String, Object> data;

    private Map<String, Object> metadata;

    /**
     * Empty constructor
     */
    public AssetDTO() {}

    /**
     * @param assetId
     * @param data
     * @param metadata
     */
    public AssetDTO(String assetId, Map<String, Object> data, Map<String, Object> metadata) {
        this.assetId = assetId;
        this.data = data;
        this.metadata = metadata;
    }

    /**
     * @return the assetId
     */
    public String getAssetId() {
        return assetId;
    }

    /**
     * @param assetId the assetId to set
     */
    public void setAssetId(String assetId) {
        this.assetId = assetId;
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
        return "AssetDTO [assetId=" + assetId + ", data=" + data + ", metadata=" + metadata + "]";
    }
}
