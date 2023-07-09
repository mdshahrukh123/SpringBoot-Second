package com.test.EcommerceAPI.repository;

import com.test.EcommerceAPI.model.Category;
import com.test.EcommerceAPI.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IProductRepo extends JpaRepository<Product,Integer> {
    Iterable<Product> findAllByCategory(Category category);

}
