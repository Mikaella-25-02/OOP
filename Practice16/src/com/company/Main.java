package com.company;

public class Main {

    public static void main(String[] args)
    {
        /*Drink drink = new Drink(120, "ice cream with milk", "good cost");
        System.out.println(drink.getTitle() + ", " + drink.getDescription());*/

        /*TablesOrderManager tablesOrderManager = new TablesOrderManager();
        int id1 = tablesOrderManager.addOrder(new Dish(100, "cup", ""), new Drink("cocktail1",""));
        tablesOrderManager.addOrder(new Drink("cocktail2",""));
        System.out.println(tablesOrderManager);
        tablesOrderManager.removeOrder(id1);
        System.out.println(tablesOrderManager);
        tablesOrderManager.addOrder(new Drink("cocktail3333","33333"));
        System.out.println(tablesOrderManager);*/

        /*InternetOrder order = new InternetOrder(new Dish(100, "cup", ""), new Drink("cocktail1",""),
                new Dish(120, "soup", ""),new Dish(110, "meat", ""));
        System.out.println("Количество блюд в заказе " + order.getCountInOrder());
        System.out.println("Количество блюд в заказе с названием cup  " + order.getCountInOrders("cup"));
        var mas1 = order.getTitles();

        for(int i = 0; i < mas1.length; i++)
        {
            System.out.println(mas1[i]);
        }

        Itemable[] mas2 = order.getOrdersInSortCost();
        for(int i = 0 ; i < mas2.length; i++)
        {
            System.out.println(mas2[i].getCost());
        }*/

        /*RestaurantOrder order = new RestaurantOrder(new Dish(100, "cup", ""), new Drink("cocktail1",""),
                new Dish(120, "soup", ""),new Dish(110, "meat", ""));
        System.out.println("Количество блюд в заказе " + order.getCountInOrder());
        System.out.println("Количество блюд в заказе с названием cup  " + order.getCountInOrders("cup"));
        var mas1 = order.getTitles();

        for(int i = 0; i < mas1.length; i++)
        {
            System.out.println(mas1[i]);
        }

        Itemable[] mas2 = order.getOrdersInSortCost();
        for(int i = 0 ; i < mas2.length; i++)
        {
            System.out.println(mas2[i].getCost());
        }*/

        OrderManager manager = new OrderManager();
        try
        {
            RestaurantOrder order = new RestaurantOrder(new Dish(100, "cup", ""), new Drink("cocktail1",""),
                    new Dish(120, "soup", ""),new Dish(110, "meat", ""));
            InternetOrder order2 = new InternetOrder(new Dish(100, "cup", ""), new Drink("cocktail1",""),
                    new Dish(120, "soup", ""),new Dish(110, "meat", ""));
            manager.add("order1", order);
            manager.add("order2", order2);
        }
        catch (OrderAlreadyAddedException ex)
        {
            System.out.println(ex.getMessage());
        }
        catch (IllegalArgumentException ex)
        {
            System.out.println(ex.getMessage());
        }
        System.out.println("Количество интернет заказов " + manager.getCountInIntOrders());
        System.out.println("Количество интернет-заказов с meat " + manager.getCountTitleInIntOrders("meat"));

        var mas = manager.getAllIntOrders();
        for(int i = 0; i < mas.length; i++)
        {
            System.out.println("Количество предметов в интернет-заказе равно " + mas[i].getCountInOrder());
        }
    }
}
