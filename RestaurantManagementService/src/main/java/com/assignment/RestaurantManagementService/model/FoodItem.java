package com.assignment.RestaurantManagementService.model;

import com.assignment.RestaurantManagementService.model.enums.Category;
import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@JsonIdentityInfo(generator= ObjectIdGenerators.PropertyGenerator.class,scope=FoodItem.class,property="foodId")

public class FoodItem {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer foodId;
    private String foodName;
    private String foodDesc;
    private Category foodCategory;
    private Double foodPrice;
    @OneToOne(mappedBy = "foodItem")
    private Order order;


}
