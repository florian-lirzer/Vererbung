package org.campus02.at.hase;

public class HaseDemoApp
{
    public static void main(String[] args)
    {
        Hase h = new Hase("Hase");
        Weihnachtshase w = new Weihnachtshase("Weihnachtshase", 999);
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

        Hase wh = w;
        Hase wh2 = new Weihnachtshase("Christkind", 10);

        wh2.verteilen();
        wh.verteilen();

        Hase oh = new Osterhase("Osterhase");

        Osterhase osterHase = (Osterhase) oh; //Ich übernehme die Verantwortung
        osterHase.bemalen();

        //Osterhase wh2AlsOsterhase = (Osterhase) wh2;
        //wh2AlsOsterhase.bemalen();                    //Probleme beim Casten weil Weihnachtshase != Osterhase


    }
}
