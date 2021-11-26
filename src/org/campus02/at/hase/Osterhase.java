package org.campus02.at.hase;

public class Osterhase extends Hase
{
    public Osterhase(String name)
    {
        super(name);
    }

    @Override
    public void verteilen()
    {
        System.out.println(getName() + " versteckt Geschenke und Ostereier");
    }
}
