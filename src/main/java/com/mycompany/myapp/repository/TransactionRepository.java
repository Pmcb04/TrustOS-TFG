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
        value = "SELECT jhi_transaction.id, jhi_transaction.name, jhi_transaction.repeat, jhi_transaction.final_transaction" +  
                " FROM jhi_product_transaction" + 
                " INNER JOIN jhi_transaction ON jhi_product_transaction.transaction_id = jhi_transaction.id" +
                " WHERE jhi_product_transaction.product_id = (SELECT jhi_product.id from jhi_product WHERE jhi_product.name = :productName)" +
                " AND jhi_product_transaction.authority_name= :rol",
        nativeQuery = true
    )
    List<Transaction> findAllByAssetRol(@Param("productName") String productName, @Param("rol") String rol);

    @Query(
        value = "SELECT jhi_transaction.id, jhi_transaction.name, jhi_transaction.repeat, jhi_transaction.final_transaction" +  
                " FROM jhi_product_transaction" + 
                " INNER JOIN jhi_transaction ON jhi_product_transaction.transaction_id = jhi_transaction.id" +
                " WHERE jhi_product_transaction.product_id = (SELECT jhi_product.id from jhi_product WHERE jhi_product.name = :productName)",
        nativeQuery = true
    )
    List<Transaction> findAllByAsset(@Param("productName") String productName);

}
