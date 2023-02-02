package com.mycompany.myapp.domain.trustos;

import java.io.Serializable;
import java.util.Map;

/**
 * A Asset.
 */
public class Asset implements Serializable {

    private String assetId;

    private Map<String, Object> data;

    private Map<String, Object> metadata;

    private int datetime;

    private int timestamp;

    private String hfTxId;

    private String userOwner;

    private String hash;

    /**
     * Empty constructor
     */
    public Asset() {}

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

    /**
     * @return the datetime
     */
    public int getDatetime() {
        return datetime;
    }

    /**
     * @param datetime the datetime to set
     */
    public void setDatetime(int datetime) {
        this.datetime = datetime;
    }

    /**
     * @return the timestamp
     */
    public int getTimestamp() {
        return timestamp;
    }

    /**
     * @param timestamp the timestamp to set
     */
    public void setTimestamp(int timestamp) {
        this.timestamp = timestamp;
    }

    /**
     * @return the hfTxId
     */
    public String getHfTxId() {
        return hfTxId;
    }

    /**
     * @param hfTxId the hfTxId to set
     */
    public void setHfTxId(String hfTxId) {
        this.hfTxId = hfTxId;
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
        result = prime * result + ((assetId == null) ? 0 : assetId.hashCode());
        result = prime * result + ((data == null) ? 0 : data.hashCode());
        result = prime * result + datetime;
        result = prime * result + ((hash == null) ? 0 : hash.hashCode());
        result = prime * result + ((hfTxId == null) ? 0 : hfTxId.hashCode());
        result = prime * result + ((metadata == null) ? 0 : metadata.hashCode());
        result = prime * result + timestamp;
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
        if (assetId == null) {
            if (other.assetId != null) return false;
        } else if (!assetId.equals(other.assetId)) return false;
        if (data == null) {
            if (other.data != null) return false;
        } else if (!data.equals(other.data)) return false;
        if (datetime != other.datetime) return false;
        if (hash == null) {
            if (other.hash != null) return false;
        } else if (!hash.equals(other.hash)) return false;
        if (hfTxId == null) {
            if (other.hfTxId != null) return false;
        } else if (!hfTxId.equals(other.hfTxId)) return false;
        if (metadata == null) {
            if (other.metadata != null) return false;
        } else if (!metadata.equals(other.metadata)) return false;
        if (timestamp != other.timestamp) return false;
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
            "Asset [assetId=" +
            assetId +
            ", data=" +
            data +
            ", datetime=" +
            datetime +
            ", hash=" +
            hash +
            ", hfTxId=" +
            hfTxId +
            ", metadata=" +
            metadata +
            ", timestamp=" +
            timestamp +
            ", userOwner=" +
            userOwner +
            "]"
        );
    }
}
