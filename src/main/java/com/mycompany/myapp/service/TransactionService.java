package com.mycompany.myapp.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.mycompany.myapp.repository.TransactionRepository;
import com.mycompany.myapp.service.dto.TransactionDTO;
import com.mycompany.myapp.service.mapper.TransactionMapper;

import java.util.*;
import java.util.stream.*;

/**
 * Service class for managing products.
 */
@Service
@Transactional
public class TransactionService {

    private final TransactionRepository transactionRepository;

    private final TransactionMapper transactionMapper;

    public TransactionService(TransactionRepository transactionRepository, TransactionMapper transactionMapper) {
        this.transactionRepository = transactionRepository;
        this.transactionMapper = transactionMapper;
    }

    public List<TransactionDTO> findAllByProductRol(String productName, String rol) {
        return transactionMapper.transactionsToTransactionsDTOs(transactionRepository.findAllByAssetRol(productName, rol));
    }

    public Set<TransactionDTO> findAllByProduct(String productName) {
        return new HashSet<TransactionDTO>(transactionMapper.transactionsToTransactionsDTOs(transactionRepository.findAllByAsset(productName)));
    }
}
