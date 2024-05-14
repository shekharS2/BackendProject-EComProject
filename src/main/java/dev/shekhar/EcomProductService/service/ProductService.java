package dev.shekhar.EcomProductService.service;

import dev.shekhar.EcomProductService.dto.FakeStoreProductResponseDTO;
import dev.shekhar.EcomProductService.entity.Product;

import java.util.List;

public interface ProductService {
    List<FakeStoreProductResponseDTO> getAllProducts();
    Product getProduct(int productId );
    Product createProduct(Product product);
    Product  updateProduct(Product updatedProduct, int productId);
    Product  deleteProduct(int productId);
}
