package com.mycompany.myapp.domain.trustos;

import java.util.List;

public class AssetList {

    private List<String> assetId;

    /**
     * @return the assetId
     */
    public List<String> getAssetId() {
        return assetId;
    }

    /**
     * @param assetId the assetId to set
     */
    public void setAssetId(List<String> assetId) {
        this.assetId = assetId;
    }

    /* (non-Javadoc)
     * @see java.lang.Object#toString()
     */

    @Override
    public String toString() {
        return "AssetList [assetId=" + assetId + "]";
    }
}
