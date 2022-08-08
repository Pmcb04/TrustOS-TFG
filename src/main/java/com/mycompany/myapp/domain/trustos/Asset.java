package com.mycompany.myapp.domain.trustos;

import java.util.Map;

import javax.persistence.Id;
import javax.validation.constraints.NotNull;

/**
 * A Asset.
 */
public class Asset {

    @NotNull
    @Id
    private String assetID;

    private Map<String, Object> data;

    private Map<String, Object> metadata;

    @NotNull
    private String datatime;

    @NotNull
    private String userOwner;

    @NotNull
    private String hash;

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

    /**
     * @return the datatime
     */
    public String getDatatime() {
        return datatime;
    }

    /**
     * @param datatime the datatime to set
     */
    public void setDatatime(String datatime) {
        this.datatime = datatime;
    }

    /**
     * @return the userOwner
     */
    public String getUserOwner() {
        return userOwner;
    }

    /**
     * @param userOwner the userOwner to set
     */
    public void setUserOwner(String userOwner) {
        this.userOwner = userOwner;
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
     * @see java.lang.Object#hashCode()
     */

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((assetID == null) ? 0 : assetID.hashCode());
        result = prime * result + ((data == null) ? 0 : data.hashCode());
        result = prime * result + ((hash == null) ? 0 : hash.hashCode());
        result = prime * result + ((metadata == null) ? 0 : metadata.hashCode());
        result = prime * result + ((datatime == null) ? 0 : datatime.hashCode());
        result = prime * result + ((userOwner == null) ? 0 : userOwner.hashCode());
        return result;
    }

    /* (non-Javadoc)
     * @see java.lang.Object#equals(java.lang.Object)
     */

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;
        if (getClass() != obj.getClass()) return false;
        Asset other = (Asset) obj;
        if (assetID == null) {
            if (other.assetID != null) return false;
        } else if (!assetID.equals(other.assetID)) return false;
        if (data == null) {
            if (other.data != null) return false;
        } else if (!data.equals(other.data)) return false;
        if (hash == null) {
            if (other.hash != null) return false;
        } else if (!hash.equals(other.hash)) return false;
        if (metadata == null) {
            if (other.metadata != null) return false;
        } else if (!metadata.equals(other.metadata)) return false;
        if (datatime == null) {
            if (other.datatime != null) return false;
        } else if (!datatime.equals(other.datatime)) return false;
        if (userOwner == null) {
            if (other.userOwner != null) return false;
        } else if (!userOwner.equals(other.userOwner)) return false;
        return true;
    }

    /* (non-Javadoc)
     * @see java.lang.Object#toString()
     */

    @Override
    public String toString() {
        return (
            "Asset [assetID=" +
            assetID +
            ", data=" +
            data +
            ", hash=" +
            hash +
            ", metadata=" +
            metadata +
            ", datatime=" +
            datatime +
            ", userOwner=" +
            userOwner +
            "]"
        );
    }
}
