package org.bonn.ooka.buchungssystem.ss2022;

import org.bonn.ooka.buchungssystem.ss2022.Komponente.ProxyAdvSuche;
import org.bonn.ooka.buchungssystem.ss2022.Komponente.ProxySuche;

public class PortImpl implements Port{
    public String[] getInterfaces(){
        return new String[]{"Hotelsuche","AdvHotelSuche"};
    }
    public Suche getInterface(String interfaceString){
        if (interfaceString.equals("Hotelsuche")){
            return new ProxySuche();
        }else if (interfaceString.equals("AdvHotelSuche")){
            return new ProxyAdvSuche();
        }
        return null;
    }
}
