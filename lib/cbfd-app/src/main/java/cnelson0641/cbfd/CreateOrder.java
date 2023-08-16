package cnelson0641.cbfd;

import cnelson0641.cbfd.Restaurant;

public class CreateOrder
{
    public static void main(String[] args)
    {
        runApp(args);
    }

    public static String runApp(String[] args)
    {
        // Test restaurant
        Restaurant chipotle = new Restaurant("Chipotle");
        System.out.println("Restaurant name is " + chipotle.get_name());

        // Print args
        String api = args[0];
        System.out.println("First arg is " + api);
        // Return
        return("CBFD at your service!");
    }
}

