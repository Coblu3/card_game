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
public class Basketbolcu extends Sporcu {

    int ikilik, serbestAtis, ucluk;
    String basketbolcuAdi, basketbolcuTakim;
    boolean kartKullanildiMi = false;

    public Basketbolcu(String sporcuIsim, String sporcuTakim) {
        super(sporcuIsim, sporcuTakim);
        basketbolcuAdi = sporcuIsim;
        basketbolcuTakim = sporcuTakim;
    }

    public int getIkilik() {
        return ikilik;
    }

    public void setIkilik(int ikilik) {
        this.ikilik = ikilik;
    }

    public int getSerbestAtis() {
        return serbestAtis;
    }

    public void setSerbestAtis(int serbestAtis) {
        this.serbestAtis = serbestAtis;
    }

    public int getUcluk() {
        return ucluk;
    }

    public void setUcluk(int ucluk) {
        this.ucluk = ucluk;
    }

    public String getBasketbolcuAdi() {
        return basketbolcuAdi;
    }

    public void setBasketbolcuAdi(String basketbolcuAdi) {
        this.basketbolcuAdi = basketbolcuAdi;
    }

    public String getBasketbolcuTakim() {
        return basketbolcuTakim;
    }

    public void setBasketbolcuTakim(String basketbolcuTakim) {
        this.basketbolcuTakim = basketbolcuTakim;
    }

    public boolean isKartKullanildiMi() {
        return kartKullanildiMi;
    }

    public void setKartKullanildiMi(boolean kartKullanildiMi) {
        this.kartKullanildiMi = kartKullanildiMi;
    }

    public Basketbolcu() {
    }

    @Override
    int[] sporcuPuaniGoster() {
        int a[] = new int[3];
        a[0] = ikilik;
        a[1] = serbestAtis;
        a[2] = ucluk;
        return a;

    }

}
