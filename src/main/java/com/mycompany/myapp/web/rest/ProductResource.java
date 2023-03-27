package com.mycompany.myapp.web.rest;

import com.mycompany.myapp.service.ProductService;
import com.mycompany.myapp.service.dto.ProductDTO;
import java.util.List;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
     * @param rol rol of user to identify what product can be create
     * @return the {@link ResponseEntity} with status {@code 200 (OK)} and with body all product can be create a rol.
     */
    @GetMapping("/products/create/{rol}")
    public ResponseEntity<List<ProductDTO>> getAllProductsCanCreateByRol(@PathVariable String rol) {
        return new ResponseEntity<>(productService.findAllCanCreateByRol(rol), HttpStatus.OK);
    }

    /**
     * {@code GET /api/products/view} : get all products can be view a rol
     *
     * @param rol rol of user to identify what product can be view
     * @return the {@link ResponseEntity} with status {@code 200 (OK)} and with body all product can be view a rol.
     */
    @GetMapping("/products/view/{rol}")
    public ResponseEntity<List<ProductDTO>> getAllProductsCanViewByRol(@PathVariable String rol) {
        return new ResponseEntity<>(productService.findAllByRol(rol), HttpStatus.OK);
    }
}
