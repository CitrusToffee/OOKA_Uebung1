package org.bonn.ooka.buchungssystem.ss2022;

import org.bonn.ooka.buchungssystem.ss2022.Komponente.Hotel;
import org.bonn.ooka.buchungssystem.ss2022.Komponente.ProxySuche;

public class Main {
    public static void main(String[] args) {
        org.bonn.ooka.buchungssystem.ss2022.Komponente.ProxySuche suche = new ProxySuche();

        suche.openSession();
        org.bonn.ooka.buchungssystem.ss2022.Komponente.Hotel[] hotels = suche.getHotelByName("Vier Jahreszeiten");
        for (Hotel hotel : hotels) {
            System.out.println("Hotel:");
            System.out.println(hotel);
        }
        suche.closeSession();
    }

}
