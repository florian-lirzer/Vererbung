package org.campus02.at.lirzer;

public class VererbungDemoApp
{
    public static void main(String[] args)
    {
        Customer one = new Customer(1, "Florian", "Lirzer");
        Customer two = new Customer(2, "Susi", "Sorglos");

        Address addressOne = new Address("Hoffeld 1", "8063", "Eggersdorf", "Austria");
        Address addressTwo = new Address("Hoffeld 8", "8063", "Eggersdorf", "Austria");

        one.add(addressOne);
        System.out.println(one.toString());
    }
}
