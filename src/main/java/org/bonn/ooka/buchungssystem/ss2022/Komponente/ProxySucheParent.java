package org.bonn.ooka.buchungssystem.ss2022.Komponente;

import org.bonn.ooka.buchungssystem.ss2022.AdvHotelSuche;
import org.bonn.ooka.buchungssystem.ss2022.Caching;
import org.bonn.ooka.buchungssystem.ss2022.Hotelsuche;
import org.bonn.ooka.buchungssystem.ss2022.Suche;

import java.util.ArrayList;
import java.util.List;

public class ProxySucheParent implements Suche {

    protected HotelRetrieval hotelRetrieval = new HotelRetrieval();

    @Override
    public void openSession() {
        hotelRetrieval.openSession();

    }

    @Override
    public void closeSession() {
        hotelRetrieval.closeSession();
    }

    protected class HotelRetrieval implements Hotelsuche, Caching, AdvHotelSuche {

        org.bonn.ooka.buchungssystem.ss2022.Komponente.DBAccess access = new org.bonn.ooka.buchungssystem.ss2022.Komponente.DBAccess();
        org.bonn.ooka.buchungssystem.ss2022.Komponente.ProxyCache pCache = new ProxyCache();
        int Zustand = 0;

        @Override
        public Hotel[] getHotelByName(String name) {
            if (Zustand != 1) {
                throw new RuntimeException("Die Session ist nicht offen!");
            }
            List<String> result =access.getObjects(DBAccess.HOTEL,name);
            return parseHotels(result);
        }

        @Override
        public Hotel[] getHotelByNameAndLoc(String name, String ort) {
            Hotel[] hotels = getHotelByName(name);
            List<Hotel> liste = new ArrayList<>();
            for (Hotel hotel: hotels) {
                if(hotel.getOrt().contains(ort)){
                    liste.add(hotel);
                }
            }

            return liste.toArray(new Hotel[liste.size()]);
        }

        @Override
        public void openSession() {
            if (Zustand != 0) {
                throw new RuntimeException("Die Session ist bereits offen!");
            }
            access.openConnection();
            Zustand = 1;
        }

        @Override
        public void closeSession() {
            if (Zustand != 1) {
                throw new RuntimeException("Die Session ist nicht offen!");
            }
            access.closeConnection();
            Zustand = 0;
        }

        protected Hotel[] parseHotels(List<String> liste){
            Hotel[] hotels = new Hotel[liste.size()/3];
            int h = 0;
            for(int i = 0; i<liste.size(); i=i+3){
                hotels[h] = new Hotel(Integer.parseInt(liste.get(i)), liste.get(i+1), liste.get(i+2));
            }
            return hotels;
        }

        public void cacheResult(String key, List<Object> value){
            pCache.cacheResult(key,value);
        }

        public List<Object> getResult(String key){
            return pCache.getResult(key);
        }


    }

}
