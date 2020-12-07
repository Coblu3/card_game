/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.card_game;

import java.util.ArrayList;

/**
 *
 * @author demir
 */
public class Oyuncu {

    String oyuncuID, oyuncuAdi;
    int Skor;
    ArrayList<Futbolcu> futbolcuList =new ArrayList<Futbolcu>();
    ArrayList<Basketbolcu> basketobolcuList =new ArrayList<Basketbolcu>();
    
    public Oyuncu() {
    }

    public ArrayList<Basketbolcu> getBasketobolcuList() {
        return basketobolcuList;
    }

    public void setBasketobolcuList(ArrayList<Basketbolcu> basketobolcuList) {
        this.basketobolcuList = basketobolcuList;
    }

    public Oyuncu(String oyuncuID, String oyuncuAdi, int Skor) {
        this.Skor = Skor;
        this.oyuncuID = oyuncuID;
        this.oyuncuAdi = oyuncuAdi;
    }
    
    int SkorGoster(){
        return Skor;
    }

    public String getOyuncuID() {
        return oyuncuID;
    }

    public void setOyuncuID(String oyuncuID) {
        this.oyuncuID = oyuncuID;
    }

    public String getOyuncuAdi() {
        return oyuncuAdi;
    }

    public void setOyuncuAdi(String oyuncuAdi) {
        this.oyuncuAdi = oyuncuAdi;
    }

    public int getSkor() {
        return Skor;
    }

    public void setSkor(int Skor) {
        this.Skor = Skor;
    }

    public ArrayList<Futbolcu> getFutbolcuList() {
        return futbolcuList;
    }

    public void setFutbolcuList(ArrayList<Futbolcu> futbolcuList) {
        this.futbolcuList = futbolcuList;
    }




    
    Futbolcu kartSec(int pos){
        return null;
    } 
    int kartSec(){
        return 0;
    } 
}
