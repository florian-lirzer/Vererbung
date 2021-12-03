package org.campus02.at.hase;

public class Weihnachtshase extends Hase
{
    public Weihnachtshase(String name)
    {
        super(name);
    }

    @Override
    public void verteilen()
    {
        System.out.println(getName() + " verteilt Geschenke unter dem Christbaum");
    }
}
