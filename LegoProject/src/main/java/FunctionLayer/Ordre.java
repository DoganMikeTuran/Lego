/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FunctionLayer;

import java.util.ArrayList;

/**
 *
 * @author dmt1
 */
public class Ordre {
    int ordreNummer;
    String status;
    Stykliste stykliste;
    int længde;
    int bredde;
    int højde;

    public Ordre(int ordreNummer, String status, Stykliste stykliste, int længde, int bredde, int højde) {
        this.ordreNummer = ordreNummer;
        this.status = status;
        this.stykliste = stykliste;
        this.længde = længde;
        this.bredde = bredde;
        this.højde = højde;
    }


        public int getOrdreNummer() {
        return ordreNummer;
    }

    public void setOrdreNummer(int ordreNummer) {
        this.ordreNummer = ordreNummer;
    }


    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Stykliste getStykliste() {
        return stykliste;
    }
    
    public void setStykliste(Stykliste stykliste) {
        this.stykliste = stykliste;
    }

    public int getLængde() {
        return længde;
    }

    public void setLængde(int længde) {
        this.længde = længde;
    }

    public int getBredde() {
        return bredde;
    }

    public void setBredde(int bredde) {
        this.bredde = bredde;
    }

    public int getHøjde() {
        return højde;
    }

    public void setHøjde(int højde) {
        this.højde = højde;
    }
    
    
    
}
