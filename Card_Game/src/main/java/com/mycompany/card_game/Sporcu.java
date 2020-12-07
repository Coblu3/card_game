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
public class Sporcu {

    String sporcuIsim, sporcuTakim;
    int a[] = new int[3];

    public Sporcu(String sporcuIsim, String sporcuTakim) {
        this.sporcuIsim = sporcuIsim;
        this.sporcuTakim = sporcuTakim;

    }

    public Sporcu() {

    }

    public String getSporcuIsim() {
        return sporcuIsim;
    }

    public void setSporcuIsim(String sporcuIsim) {
        this.sporcuIsim = sporcuIsim;
    }

    public String getSporcuTakim() {
        return sporcuTakim;
    }

    public void setSporcuTakim(String sporcuTakim) {
        this.sporcuTakim = sporcuTakim;
    }

    public int[] getA() {
        return a;
    }

    public void setA(int[] a) {
        this.a = a;
    }

    int[] sporcuPuaniGoster() {
        return a;
    }

}
