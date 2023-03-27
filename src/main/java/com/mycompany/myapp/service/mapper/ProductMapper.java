package com.mycompany.myapp.service.mapper;

import com.mycompany.myapp.domain.Product;
import com.mycompany.myapp.service.dto.ProductDTO;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;
import org.springframework.stereotype.Service;

/**
 * Mapper for the entity {@link Product} and its DTO called {@link ProductDTO}.
 *
 * Normal mappers are generated using MapStruct, this one is hand-coded as MapStruct
 * support is still in beta, and requires a manual step with an IDE.
 */
@Service
public class ProductMapper {

    public List<ProductDTO> productsToProductsDTOs(List<Product> products) {
        return products.stream().filter(Objects::nonNull).map(this::productToProductDTO).collect(Collectors.toList());
    }

    public Product productDtoTOProduct(ProductDTO productDTO) {
        if (productDTO == null) {
            return null;
        } else {
            Product product = new Product();
            product.setId(null);
            product.setName(productDTO.getName());
            return product;
        }
    }

    public ProductDTO productToProductDTO(Product product) {
        return new ProductDTO(product);
    }

    public List<Product> productDtosToProducts(List<ProductDTO> productDTOs) {
        return productDTOs.stream().filter(Objects::nonNull).map(this::productDtoTOProduct).collect(Collectors.toList());
    }
}
