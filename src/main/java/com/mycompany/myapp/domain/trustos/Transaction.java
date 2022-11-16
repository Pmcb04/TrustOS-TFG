package com.mycompany.myapp.domain.trustos;

import java.util.List;
import java.util.Map;

public class Transaction {

    private String assetId;

    private Map<String, Object> data;

    private List<Asset> transactions;

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
     * @return the transactions
     */
    public List<Asset> getTransactions() {
        return transactions;
    }

    /**
     * @param transactions the transactions to set
     */
    public void setTransactions(List<Asset> transactions) {
        this.transactions = transactions;
    }
}
