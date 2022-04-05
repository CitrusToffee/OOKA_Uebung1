package org.bonn.ooka.buchungssystem.ss2022.Komponente;

import org.bonn.ooka.buchungssystem.ss2022.Hotelsuche;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ProxySuche extends ProxySucheParent implements Hotelsuche {

    @Override
    public Hotel[] getHotelByName(String name) {
        logging("getHotelByName",name);
        return hotelRetrieval.getHotelByName(name);
    }

    private void logging(String method, String key){
        Date date = new Date();
        System.out.println(date.toString());
        SimpleDateFormat DateFor = new SimpleDateFormat("dd.MM.yyyy hh:mm:ss");
        String stringDate = DateFor.format(date);
        String stringMethod = "Zugriff auf Buchungssystem über Methode "+method+". Suchwort: "+ key;
        System.out.println(stringDate+": "+stringMethod);

    }

}
