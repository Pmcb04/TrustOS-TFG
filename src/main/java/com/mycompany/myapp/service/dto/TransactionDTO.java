package com.mycompany.myapp.service.dto;

import com.mycompany.myapp.domain.Transaction;

/**
 * A Transaction DTO
 */

public class TransactionDTO {

    public TransactionDTO() {}

    public TransactionDTO(Transaction transaction) {
        this.name = transaction.getName();
    }

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // prettier-ignore
    @Override
    public String toString() {
        return "TransactionDTO{" +
            "name='" + name + '\'' +
            "}";
    }
}
