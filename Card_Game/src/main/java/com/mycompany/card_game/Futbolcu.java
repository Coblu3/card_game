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
public class Futbolcu extends Sporcu {

    int penalti, serbestAtis, kaleciKarsiKarsiya;
    String futbolcuAdi, futbolcuTakim;
    boolean kartKullanildiMi = false;

    public Futbolcu(String sporcuIsim, String sporcuTakim) {

        super(sporcuIsim, sporcuTakim);
        this.futbolcuAdi = sporcuIsim;
        this.futbolcuTakim = sporcuTakim;

    }

    public Futbolcu() {
    }

    public int getPenalti() {
        return penalti;
    }

    public void setPenalti(int penalti) {
        this.penalti = penalti;
    }

    public int getSerbestAtis() {
        return serbestAtis;
    }

    public void setSerbestAtis(int serbestAtis) {
        this.serbestAtis = serbestAtis;
    }

    public int getKaleciKarsiKarsiya() {
        return kaleciKarsiKarsiya;
    }

    public void setKaleciKarsiKarsiya(int kaleciKarsiKarsiya) {
        this.kaleciKarsiKarsiya = kaleciKarsiKarsiya;
    }

    public String getFutbolcuAdi() {
        return futbolcuAdi;
    }

    public void setFutbolcuAdi(String futbolcuAdi) {
        this.futbolcuAdi = futbolcuAdi;
    }

    public String getFutbolcuTakim() {
        return futbolcuTakim;
    }

    public void setFutbolcuTakim(String futbolcuTakim) {
        this.futbolcuTakim = futbolcuTakim;
    }

    public boolean isKartKullanildiMi() {
        return kartKullanildiMi;
    }

    public void setKartKullanildiMi(boolean kartKullanildiMi) {
        this.kartKullanildiMi = kartKullanildiMi;
    }

    @Override
    int[] sporcuPuaniGoster() {
        int a[] = new int[3];
        a[0] = penalti;
        a[1] = serbestAtis;
        a[2] = kaleciKarsiKarsiya;
        return a;

    }

}
