package com.mycompany.myapp.service.mapper;

import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.mycompany.myapp.domain.Transaction;
import com.mycompany.myapp.service.dto.TransactionDTO;

/**
 * Mapper for the entity {@link Transaction} and its DTO called {@link TransactionDTO}.
 *
 * Normal mappers are generated using MapStruct, this one is hand-coded as MapStruct
 * support is still in beta, and requires a manual step with an IDE.
 */
@Service
public class TransactionMapper {

    public List<TransactionDTO> transactionsToTransactionsDTOs(List<Transaction> transactions) {
        return transactions.stream().filter(Objects::nonNull).map(this::transactionToTransactionDTO).collect(Collectors.toList());
    }

    public Transaction transactionDtoTOTransaction(TransactionDTO transactionDTO) {
        if (transactionDTO == null) {
            return null;
        } else {
            Transaction transaction = new Transaction();
            transaction.setId(null);
            transaction.setName(transactionDTO.getName());
            transaction.setRepeat(transactionDTO.getRepeat());
            return transaction;
        }
    }

    public TransactionDTO transactionToTransactionDTO(Transaction transaction) {
        return new TransactionDTO(transaction);
    }

    public List<Transaction> transactionDtosToTransactions(List<TransactionDTO> transactionDTOs) {
        return transactionDTOs.stream().filter(Objects::nonNull).map(this::transactionDtoTOTransaction).collect(Collectors.toList());
    }
}
