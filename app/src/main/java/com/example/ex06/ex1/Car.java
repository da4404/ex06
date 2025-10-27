package com.example.ex06.ex1;

public class Car extends Vehicle

{
    @Override
    public void start()
    {
        System.out.println("gas");
    }
    @Override
    public void stop()
    {
        System.out.println("balam");
    }

    @Override
    public void accelerate()
    {
        System.out.println("voommmm!");

    }
}


