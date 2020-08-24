package kr.co.jeonji0628.jeonjiPjt.interfaces;

import kr.co.jeonji0628.jeonjiPjt.application.RestaurantService;
import kr.co.jeonji0628.jeonjiPjt.domain.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class RestaurantController {


    @Autowired
    private RestaurantService restaurantService;

    @GetMapping("/restaurant")
    public List<Restaurant> list(){
        List<Restaurant> restaurants  = restaurantService.getRestaurants();


        return restaurants;
    }

    @GetMapping("/restaurants/{id}")
    public Restaurant detail(@PathVariable("id") Long id ){

        Restaurant restaurant = restaurantService.getRestaurant(id);


      return restaurant;
    }





}
