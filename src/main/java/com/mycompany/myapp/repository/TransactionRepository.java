package com.mycompany.myapp.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.mycompany.myapp.domain.Transaction;

/**
 * Spring Data JPA repository for the {@link Transaction} entity.
 */
public interface TransactionRepository extends JpaRepository<Transaction, Long> {
    @Query(
        value = "SELECT jhi_transaction.id, jhi_transaction.name FROM jhi_transaction" +
        " INNER JOIN jhi_product_transaction ON jhi_product_transaction.product_id = :productId" +
        " INNER JOIN jhi_authority ON jhi_authority.name = :rol" +
        " WHERE jhi_authority_product.authority_name=:rol",
        nativeQuery = true
    )
    List<Transaction> findAllByAssetRol(@Param("productId") String productId, @Param("rol") String rol);
}
