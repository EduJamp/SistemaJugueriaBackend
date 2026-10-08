package com.app.changui.domain.service;

import com.app.changui.domain.dto.ProductDTO;

import java.util.List;
import java.util.Optional;

public interface ProductService {
    ProductDTO createProduct(ProductDTO productDTO);
    List<ProductDTO> getAllProducts();
    Optional<ProductDTO> getProductById(int idProduct);
    Optional<ProductDTO> updateProduct(int idProduct,  ProductDTO productDTO);
    boolean deleteProduct(int idProduct);
}
