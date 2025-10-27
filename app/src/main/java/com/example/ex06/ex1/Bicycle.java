package com.example.ex06.ex1;

public class Bicycle extends Vehicle
{
    @Override
    public void start()
    {
        System.out.println("whoosh woosh!");
    }
    @Override
    public void stop()
    {
        System.out.println("break");
    }

    @Override
    public void accelerate()
    {
        System.out.println("faster!");

    }
}
