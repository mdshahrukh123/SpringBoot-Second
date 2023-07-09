package com.test.EcommerceAPI.controller;

import com.test.EcommerceAPI.Service.ProductService;
import com.test.EcommerceAPI.model.Category;
import com.test.EcommerceAPI.model.Product;
import jakarta.websocket.server.PathParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class ProductController {
    @Autowired
    ProductService productService;

    @PostMapping("product")
    public String createProduct(@RequestBody Product product){
        return productService.addProduct(product);
    }

    @GetMapping("products")
    public Iterable<Product> getAllProducts(){
        return productService.getProducts();
    }

    @GetMapping("products/category/{category}")
    public Iterable<Product> getAllProductsByCategory(@PathVariable Category category){
        return productService.getProductsByCategory(category);
    }

    @DeleteMapping("product/id/{id}")
    public String removeProductById(@PathVariable Integer id){
        return productService.removeProduct(id);
    }

    @PutMapping("product/percent/{percent}")
    public String updateProductPriceForDiscountByCategory(@RequestParam Category category, @PathVariable Integer percent){
        return productService.updatePriceProduct(category,percent);
    }
}
