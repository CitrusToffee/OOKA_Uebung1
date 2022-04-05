package org.bonn.ooka.buchungssystem.ss2022;

import org.bonn.ooka.buchungssystem.ss2022.Komponente.Hotel;

public interface Hotelsuche extends Suche {
    public Hotel[] getHotelByName(String name);

}
