package org.bonn.ooka.buchungssystem.ss2022.Komponente;

public class Hotel {
    private int ID;
    private String Name;
    private String Ort;

    protected Hotel(int ID, String Name, String Ort) {
        setID(ID);
        setName(Name);
        setOrt(Ort);
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public void setOrt(String Ort) {
        this.Ort = Ort;
    }

    public int getID() {
        return ID;
    }

    public String getName() {
        return Name;
    }

    public String getOrt() {
        return Ort;
    }

    public String toString() {
        return "ID: " + ID + ", Name: " + Name + ", Ort: " + Ort;
    }
}
