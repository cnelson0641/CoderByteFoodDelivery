package cnelson0641.cbfd;

import java.util.*;
import cnelson0641.cbfd.Restaurant;
import cnelson0641.cbfd.Payment;

public class Order
{

    private Restaurant restaurant;
    private Payment payment;
    private String[] food_items;
    private Integer cost = 0;


    public Order(String restaurant_str, String card_info, String food_items_str)
    {
        // Set instance variables
        setRestaurantFromStr(restaurant_str);
        payment = new Payment();
        food_items = food_items_str.split(",");

        // Calculate cost
        for (String item : food_items)
        {
            cost += restaurant.getFoodItems().get(item);
        }

        // Run payment
        payment.makePayment(restaurant.getBankInfo(), card_info, cost);

        // Send order to the restaurant
        restaurant.sendOrder(food_items, cost);
    }

    private void setRestaurantFromStr(String restaurant_str)
    {
        Restaurant rest = null;
        if (restaurant_str.equals("chipotle"))
        {
            rest = new Chipotle();
        }

        //TODO add error checking
        restaurant = rest;
    }

    public String getFoodItemsStr()
    {
        return String.join(", ", food_items);
    }

    public Integer getCost()
    {
        return cost;
    }

    public String getRestaurantName()
    {
        return restaurant.getName();
    }
}
