package org.campus02.at.hase;

public class Hase
{
    private String name;

    public Hase(String name)
    {
        this.name = name;
    }

    public String getName()
    {
        return name;
    }

    public void schlafen()
    {
        System.out.println(name + " schläft");
    }
    public void hoppeln()
    {
        System.out.println(name + " hoppelt");
    }
    public void fressen()
    {
        System.out.println(name + " frisst");
    }

    public void verteilen()
    {
        System.out.println(name + " ist eine Hase und verteilt nichts");
    }
}
