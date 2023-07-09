package com.test.EcommerceAPI.Service;

import com.test.EcommerceAPI.model.Category;
import com.test.EcommerceAPI.model.Product;
import com.test.EcommerceAPI.repository.IProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductService {
    @Autowired
    IProductRepo productRepo;

    public String addProduct(Product product) {
        return "Added Successfully......"+productRepo.save(product);
    }

    public Iterable<Product> getProducts() {
        return productRepo.findAll();
    }

    public Iterable<Product> getProductsByCategory(Category category) {
        return productRepo.findAllByCategory(category);
    }

    public String removeProduct(Integer id) {
         productRepo.deleteById(id);
        return "Deleted Successfully....!!!!!";
    }

    public String updatePriceProduct(Category category,Integer percent) {
        Iterable<Product> productList = productRepo.findAllByCategory(category);
        List<Product> finalProductList = new ArrayList<>();
        for(Product product: productList){
            product.setPrice( product.getPrice()*(1- percent/100));
            finalProductList.add(product);
        }
        productRepo.saveAll(finalProductList);
        return "Updated SuccessFully....!!!!!";
    }
}
