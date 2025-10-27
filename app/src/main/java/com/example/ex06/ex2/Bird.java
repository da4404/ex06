package com.example.ex06.ex2;

public class Bird extends Animal implements Flyable
{

    @Override
    public void makeSound()
    {
        System.out.println("Chirp chirp!");
    }

    @Override
    public void eat()
    {
        System.out.println("The bird is eating seeds");
    }

    @Override
    public void fly()
    {
        System.out.println("The bird fly voooshhhhhhhhhhhhhshsh");
    }
}
