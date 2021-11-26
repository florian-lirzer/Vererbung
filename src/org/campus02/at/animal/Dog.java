package org.campus02.at.animal;

public class Dog
{
    public String eyeColor;
    public int weight;

    public void doSomething()
    {
        System.out.println("This is a dog!");
    }

    @Override
    public String toString()
    {
        return "Dog{" +
                "eyeColor='" + eyeColor + '\'' +
                ", weight=" + weight +
                '}';
    }
}
