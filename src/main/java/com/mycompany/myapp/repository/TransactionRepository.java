package com.mycompany.myapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mycompany.myapp.domain.Transaction;

/**
 * Spring Data JPA repository for the {@link Transaction} entity.
 */
public interface TransactionRepository extends JpaRepository<Transaction, Long> {}
