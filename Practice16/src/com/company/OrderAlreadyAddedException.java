package com.company;

public class OrderAlreadyAddedException extends Exception
{
    public OrderAlreadyAddedException(String message)
    {
        super(message);
    }
}
