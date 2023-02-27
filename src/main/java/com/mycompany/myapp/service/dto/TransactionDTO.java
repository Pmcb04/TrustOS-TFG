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
    }

    private String name;

    private Long repeat; 

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

    // prettier-ignore
    @Override
    public String toString() {
        return "TransactionDTO{" +
            "name='" + name + '\'' +
            "repeat='" + repeat + '\'' +
            "}";
    }
}
