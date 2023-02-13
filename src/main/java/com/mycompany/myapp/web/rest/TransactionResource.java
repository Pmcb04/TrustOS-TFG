package com.mycompany.myapp.web.rest;

import com.mycompany.myapp.service.TransactionService;
import com.mycompany.myapp.service.dto.TransactionDTO;
import java.util.List;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class TransactionResource {

    private final TransactionService transactionService;

    public TransactionResource(TransactionService transactionService) {
        this.transactionService = transactionService;
    }

    /**
     * {@code GET api/products/transaction/{productId}/{rol}} : get all products can be create a rol
     *
     * @param productId id of product to get the transactions
     * @param rol rol of user to identify what transactions can be do
     * @return the {@link ResponseEntity} with status {@code 200 (OK)} and with body all product can be create a rol.
     */
    @GetMapping("/products/transaction/{productId}/{rol}")
    public ResponseEntity<List<TransactionDTO>> getAllProductsByRol(@PathVariable String productId, @PathVariable String rol) {
        return new ResponseEntity<>(transactionService.findAllByProductRol(productId, rol), HttpStatus.OK);
    }
}
