package org.bonn.ooka.buchungssystem.ss2022;

import org.bonn.ooka.buchungssystem.ss2022.Komponente.Hotel;

public interface AdvHotelSuche extends Suche{
    public Hotel[] getHotelByNameAndLoc(String name, String ort);
}
