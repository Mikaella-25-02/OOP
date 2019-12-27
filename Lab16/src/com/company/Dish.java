package com.company;

public final class Dish implements Itemable
{
    private final int cost;
    private final String title;
    private final String description;
    public Dish(String title, String description)
    {
        this(0, title, description);
    }
    public Dish(int cost,String title, String description)
    {
        String message = "";
        if(cost < 0)
        {
            message += "Стоимость блюда не может быть меньше 0";
        }
        if(title == "")
        {
            if(message.length() > 0)
            {
                message += ", ";
            }
            message += "Название блюда не может быть пустым";
        }
        if(message.length() > 0)
        {
            throw new IllegalArgumentException(message);
        }
        this.cost = cost;
        this.title = title;
        this.description = description;
    }

    public int getCost()
    {
        return cost;
    }

    public String getTitle()
    {
        return title;
    }

    public String getDescription()
    {
        return description;
    }
}
