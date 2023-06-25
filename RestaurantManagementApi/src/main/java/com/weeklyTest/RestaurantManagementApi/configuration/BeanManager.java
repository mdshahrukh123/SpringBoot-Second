package com.weeklyTest.RestaurantManagementApi.configuration;

import com.weeklyTest.RestaurantManagementApi.model.Restaurant;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import static com.weeklyTest.RestaurantManagementApi.model.Speciality.NON_VEG;

@Configuration
public class BeanManager {
    @Bean
    public List<Restaurant> getList(){
        Restaurant restaurant = new Restaurant(0,"Food As Mood","minakshi Chowk Meerut","9097978996",NON_VEG,20, LocalDate.of(2008,05,01));
       List<Restaurant> defaultList = new ArrayList<>();
       defaultList.add(restaurant);
        return defaultList;
    }
}
