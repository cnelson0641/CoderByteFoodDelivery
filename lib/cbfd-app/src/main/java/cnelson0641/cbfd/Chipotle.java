package cnelson0641.cbfd;

import java.util.*;

public class Chipotle extends Restaurant
{

    public Chipotle()
    {
        HashMap<String,Integer> food_map = new HashMap<String,Integer>();
        food_map.put("burrito", 8);
        food_map.put("chips", 3);
        food_map.put("guac", 3);
        food_map.put("soda", 2);
        food_map.put("queso", 3);

        setName("Chipotle");
        setBankInfo("boaxxxx");
        setFoodItems(food_map);
    }
}
