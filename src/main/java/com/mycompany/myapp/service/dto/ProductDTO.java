package com.mycompany.myapp.service.dto;

import com.mycompany.myapp.domain.Product;

/**
 * A Product DTO
 */

public class ProductDTO {

    public ProductDTO() {}

    public ProductDTO(Product product) {
        this.name = product.getName();
    }

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // prettier-ignore
    @Override
    public String toString() {
        return "ProductDTO{" +
            "name='" + name + '\'' +
            "}";
    }
}
