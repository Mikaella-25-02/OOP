package com.company;

public interface Orderable
{
    void add(Itemable item);
    boolean remove(String title);
    int removeSeveral(String title);
    int getCountInOrder();
    Itemable[] getMas();
    int totalSum();
    int getCountInOrders(String title);
    String[] getTitles();
    Itemable[] getOrdersInSortCost();
}
