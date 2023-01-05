package com.mycompany.myapp.web.rest;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mycompany.myapp.service.ProductService;
import com.mycompany.myapp.service.dto.ProductDTO;

@RestController
@RequestMapping("/api")
public class ProductResource {

    private final ProductService productService;

    public ProductResource(ProductService productService) {
        this.productService = productService;
    }

    /**
     * {@code GET /api/products/create} : get all products can be create a rol
     *
     * @return the {@link ResponseEntity} with status {@code 200 (OK)} and with body all product can be create a rol.
     */
    @GetMapping("/products/create/{rol}")
    public ResponseEntity<List<ProductDTO>> getAllProductsByRol(@PathVariable String rol) {
        return new ResponseEntity<>(productService.findAllByRol(rol), HttpStatus.OK);
    }
}
