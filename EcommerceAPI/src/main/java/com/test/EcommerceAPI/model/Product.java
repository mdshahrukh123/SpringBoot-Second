package com.test.EcommerceAPI.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Product {
    @Id
    private Integer productId;
    private String name;
    private Integer price;
    private String description;
    private Category category;
    private String brand;


//    @ManyToOne(cascade = CascadeType.ALL)
//    @JoinColumn(name= "fk_order_id")
//    private Order order;

}
