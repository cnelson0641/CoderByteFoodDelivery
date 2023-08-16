package cnelson0641.cbfd;

import java.util.*;

abstract class Restaurant
{

    private String name;
    private HashMap<String,Integer> food_items;
    private String bank_info;


    public Restaurant()
    {
    }

    public void sendOrder(String[] food_ordered, Integer cost)
    {
        //TODO stubbed out.  Ideally send an email, or push a msg to AWS SNS
    }

    public String getBankInfo()
    {
        return bank_info;
    }

    public void setBankInfo(String bank_info)
    {
        this.bank_info = bank_info;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public HashMap<String,Integer> getFoodItems()
    {
        return food_items;
    }

    public void setFoodItems(HashMap<String,Integer> food_items)
    {
        this.food_items = food_items;
    }
}
