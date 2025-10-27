package com.example.ex06.ex2;

public class Dog extends Animal implements Runnable
{
    @Override
    public void makeSound()
    {
        System.out.println("Woof! Woof!");

    }

    @Override
    public void eat() {
        System.out.println("The dog is eating bones");

    }

    @Override
    public void run()
    {
        System.out.println("The dog run fast");
    }
}
