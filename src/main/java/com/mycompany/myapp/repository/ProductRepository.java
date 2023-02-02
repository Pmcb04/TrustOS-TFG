package com.mycompany.myapp.repository;

import com.mycompany.myapp.domain.Product;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

/**
 * Spring Data JPA repository for the {@link Product} entity.
 */
public interface ProductRepository extends JpaRepository<Product, Long> {
    @Query(
        value = "SELECT jhi_product.id, jhi_product.name FROM jhi_product" +
        " INNER JOIN jhi_authority_product ON jhi_product.id = jhi_authority_product.product_id" +
        " INNER JOIN jhi_authority ON jhi_authority_product.authority_name = jhi_authority.name" +
        " WHERE jhi_authority_product.authority_name=:rol",
        nativeQuery = true
    )
    List<Product> findAllByRol(@Param("rol") String rol);
}
