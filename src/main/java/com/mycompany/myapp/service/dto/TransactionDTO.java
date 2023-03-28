package com.mycompany.myapp.service.dto;

import com.mycompany.myapp.domain.Transaction;

/**
 * A Transaction DTO
 */

public class TransactionDTO {

    public TransactionDTO() {}

    public TransactionDTO(Transaction transaction) {
        this.name = transaction.getName();
        this.repeat = transaction.getRepeat();
        this.finalTransaction = transaction.getFinalTransaction();
    }

    private String name;

    private Long repeat;

    private boolean finalTransaction; 

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getRepeat() {
        return repeat;
    }

    public void setRepeat(Long repeat) {
        this.repeat = repeat;
    }

    public boolean getFinalTransaction() {
        return this.finalTransaction;
    }

    public void setFinalTransaction(boolean finalTransaction) {
        this.finalTransaction = finalTransaction;
    }

    // prettier-ignore
    @Override
    public String toString() {
        return "TransactionDTO{" +
            "name='" + name + '\'' +
            "repeat='" + repeat + '\'' +
            "finalTransaction='" + finalTransaction + '\'' +
            "}";
    }
}
