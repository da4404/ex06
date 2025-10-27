package com.example.ex06.ex2;

public class Cat extends Animal implements Runnable
{
    @Override
    public void makeSound() {
        System.out.println("Meow!");
    }

    @Override
    public void eat() {
        System.out.println("The cat is eating fish");
    }

    @Override
    public void run()
    {
        System.out.println("The cat is not fast");
    }
}

