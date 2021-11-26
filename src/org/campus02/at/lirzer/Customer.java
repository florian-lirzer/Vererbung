package org.campus02.at.lirzer;

import java.util.ArrayList;

public class Customer extends Person
{
    private int customerNumber;
    private ArrayList<Address> adresses = new ArrayList();

    public Customer(int customerNumber, String firstName, String lastName)
    {
        super(firstName, lastName);
        this.customerNumber = customerNumber;
    }

    public void add(Address a)
    {
        adresses.add(a);
    }

    @Override
    public String toString()
    {
        return "Customer{" +
                "customerNumber=" + customerNumber +
                ", adresses=" + adresses +
                ", firstName='" + getFirstName() + '\'' +
                ", lastName='" + getLastName() + '\'' +
                '}';
    }
}
