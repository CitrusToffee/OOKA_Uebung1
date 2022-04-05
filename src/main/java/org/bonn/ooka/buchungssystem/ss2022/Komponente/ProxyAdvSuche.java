package org.bonn.ooka.buchungssystem.ss2022.Komponente;

import org.bonn.ooka.buchungssystem.ss2022.AdvHotelSuche;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ProxyAdvSuche extends ProxySucheParent implements AdvHotelSuche {



    @Override
    public Hotel[] getHotelByNameAndLoc(String name, String ort) {
        logging("getHotelByNameAndLoc",name,ort);
        return hotelRetrieval.getHotelByNameAndLoc(name,ort);
    }

    private void logging(String method, String key,String ort){
        Date date = new Date();
        System.out.println(date.toString());
        SimpleDateFormat DateFor = new SimpleDateFormat("dd.MM.yyyy hh:mm:ss");
        String stringDate = DateFor.format(date);
        String stringMethod = "Zugriff auf Buchungssystem über Methode "+method+". Suchworte: "+ key +" & "+ ort;
        System.out.println(stringDate+": "+stringMethod);

    }
}
