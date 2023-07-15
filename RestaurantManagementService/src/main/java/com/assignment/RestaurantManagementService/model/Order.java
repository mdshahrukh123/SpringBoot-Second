package com.assignment.RestaurantManagementService.model;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.Cascade;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "Order_Table")
@JsonIdentityInfo(generator= ObjectIdGenerators.PropertyGenerator.class,scope=Order.class,property="orderId")
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long orderId;
    private String orderQuantity;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "fk_food_Id")
    FoodItem foodItem;

    @ManyToOne
    @JoinColumn(name = "fk_user_id")
    private User user;
}
