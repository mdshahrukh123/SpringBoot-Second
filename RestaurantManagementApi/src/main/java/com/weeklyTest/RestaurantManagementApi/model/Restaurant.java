package com.weeklyTest.RestaurantManagementApi.model;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Restaurant {

    private Integer restaurantId;

    @NotEmpty(message = "Restaurant name Should not be Empty")
    private String restaurantName;
    private String restaurantAddress;

    @Pattern(regexp = "\\d{10}")
    private String restaurantPhoneNumber;
    private Speciality speciality;
    private Integer totalStaff;
    private LocalDate openingDate;
}
