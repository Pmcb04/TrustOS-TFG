package com.mycompany.myapp.domain.trustos;

import java.util.List;

public class Transaction {

    private List<Asset> output;

    /**
     * @return the output
     */
    public List<Asset> getOutput() {
        return output;
    }

    /**
     * @param output the output to set
     */
    public void setOutput(List<Asset> output) {
        this.output = output;
    }
}
