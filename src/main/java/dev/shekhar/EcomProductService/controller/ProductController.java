package dev.shekhar.EcomProductService.controller;

import dev.shekhar.EcomProductService.dto.FakeStoreProductResponseDTO;
import dev.shekhar.EcomProductService.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProductController {
    @Autowired
    ProductService productService;

    @GetMapping("/product")
    public ResponseEntity getAllProducts() {
        List<FakeStoreProductResponseDTO> allProducts = productService.getAllProducts();
        return ResponseEntity.ok(allProducts);
    }
}
