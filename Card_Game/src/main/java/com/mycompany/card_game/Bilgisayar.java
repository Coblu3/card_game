/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.card_game;

import java.util.Random;

/**
 *
 * @author demir
 */
public class Bilgisayar extends Oyuncu {
     
    public Bilgisayar(){
    
    
    
    }
    
    public Bilgisayar(String oyuncuID, String oyuncuAdi,int Skor){
        super(oyuncuID, oyuncuAdi, Skor);

    }
    
    @Override
    int kartSec(){
        Random rand = new Random();
        int r = rand.nextInt(4);
        return r;
    } 
}
