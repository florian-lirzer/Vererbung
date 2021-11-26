package org.campus02.at.hase;

public class HaseDemoApp
{
    public static void main(String[] args)
    {
        Hase h = new Hase("Hase");
        Weihnachtshase w = new Weihnachtshase("Weihnachtshase");
        Osterhase o = new Osterhase("Osterhase");

        h.schlafen();
        w.schlafen();
        o.schlafen();

        h.fressen();
        w.fressen();
        o.fressen();

        h.verteilen();
        w.verteilen();
        o.verteilen();
    }
}
