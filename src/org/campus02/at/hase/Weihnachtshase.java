package org.campus02.at.hase;

public class Weihnachtshase extends Hase
{
    private int countGifts = 0;

    public Weihnachtshase(String name, int gifts)
    {
        super(name);
        this.countGifts = gifts;
    }

    @Override
    public void verteilen()
    {
        System.out.println(getName() + " verteilt Geschenke unter dem Christbaum" + " Anzahl Geschenke: " + countGifts);
        countGifts -= 1;
    }
}
