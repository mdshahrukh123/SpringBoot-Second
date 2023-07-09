package com.test.EcommerceAPI.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "order_table")
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer orderId;
    private Integer productQuantity;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "fk_address_id")
    private Address address;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "fk_product_id")
    private Product product;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "fk_User_id")
    private User user;

//    @ManyToMany(cascade = CascadeType.ALL)
//    @JoinTable(name = "fk_Order_Address",joinColumns = @JoinColumn(name = "fk_order_Id"),
//            inverseJoinColumns = @JoinColumn(name="fk_Address_id"))
//     private List<Address> address;


}
