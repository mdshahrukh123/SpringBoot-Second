package com.assignment.RestaurantManagementService.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Generated;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Visitor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer visitorId;
    private String  visitorName;
    private String visitorMobile;
}
