/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.card_game;



/**
 *
 * @author demir
 */
public class Kullanici extends Oyuncu {
    
    public Kullanici(){
    
    }
    
    public Kullanici(String oyuncuID, String oyuncuAdi,int Skor){
        super(oyuncuID, oyuncuAdi, Skor);
    }
    
    @Override
    Futbolcu kartSec(int pos){
        
        return futbolcuList.get(pos);
    }
}
