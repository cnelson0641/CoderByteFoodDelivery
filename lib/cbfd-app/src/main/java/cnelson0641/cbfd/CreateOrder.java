package cnelson0641.cbfd;

import java.util.*;
import cnelson0641.cbfd.Restaurant;

public class CreateOrder
{

    // Call runApp(), so that we can run directly, or in the future
    // overload the runApp() method with a request handler
    // for integration with AWS Lambda.
    public static void main(String[] args)
    {
        runApp(args);
    }

    // Example input: "chipotle visaxxxx burrito,bowl,chips,guac
    public static void runApp(String[] args)
    {
        // Intro
        System.out.println("CBFD at your service!");

        // Get restaurant, card_info, and food items
        System.out.println("Gathering parameters");
        String restaurant = args[0];
        String card_info = args[1];
        String food_items_str = args[2];

		// Create Order object
        System.out.println("Creating your order");
		Order order = new Order(restaurant, card_info, food_items_str);

        // Outro
        System.out.println("Order Details:");
        System.out.println("  Restaurant: " + order.getRestaurantName());
        System.out.println("  Payment Info: " + card_info);
        System.out.println("  Food Items: " + order.getFoodItemsStr());
        System.out.println("  Cost: " + order.getCost());
        System.out.println("Thanks for using CBFD!");

        // Return
        return;
    }
}
