package com.test.EcommerceAPI.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer addId;
    private String landMark;
    private String city;
    private String state;
    private String zipCode;



//    @OneToOne(cascade = CascadeType.ALL)
//    @JoinColumn(name = "fk_order_id")
//    private Order order;
}
