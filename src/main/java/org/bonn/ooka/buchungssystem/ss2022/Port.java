package org.bonn.ooka.buchungssystem.ss2022;

public interface Port {
    public String[] getInterfaces();
    public Suche getInterface(String interfaceString);
}
