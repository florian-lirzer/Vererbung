package org.campus02.at.animal;

public class DemoDogApp
{
    public static void main(String[] args)
    {
        Beagle charlie = new Beagle();

        charlie.eyeColor = "blue";
        charlie.weight = 25;

        System.out.println(charlie.toString());
    }
}
