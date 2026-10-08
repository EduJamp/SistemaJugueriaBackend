package com.app.changui.domain.service.impl;

import com.app.changui.domain.dto.ProductDTO;
import com.app.changui.domain.mapper.ProductMapper;
import com.app.changui.domain.service.ProductService;
import com.app.changui.persistence.entity.Product;
import com.app.changui.persistence.repository.ProductRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductServiceImpl implements ProductService {
    private final ProductRepository productRepository;
    private final ProductMapper productMapper;

    public ProductServiceImpl(ProductRepository productRepository, ProductMapper productMapper) {
        this.productRepository = productRepository;
        this.productMapper = productMapper;
    }

    @Override
    public ProductDTO createProduct(ProductDTO productDTO) {
        Product product = productMapper.toProduct(productDTO);
        return null;
    }

    @Override
    public List<ProductDTO> getAllProducts() {
        return List.of();
    }

    @Override
    public Optional<ProductDTO> getProductById(int idProduct) {
        return Optional.empty();
    }

    @Override
    public Optional<ProductDTO> updateProduct(int idProduct, ProductDTO productDTO) {
        return Optional.empty();
    }

    @Override
    public boolean deleteProduct(int idProduct) {
        return false;
    }
}
