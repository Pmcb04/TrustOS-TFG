package com.mycompany.myapp.service.dto;

import com.mycompany.myapp.domain.Transaction;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof TransactionDTO)) {
            return false;
        }
        return Objects.equals(name, ((TransactionDTO) o).name);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(name);
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
