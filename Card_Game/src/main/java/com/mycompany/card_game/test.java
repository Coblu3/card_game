/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.card_game;

import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author demir
 */
//        arr[0]="KaleciKarsiKarsiya";
//        arr[1]="Penalti";
//        arr[2]="SerbestAtis";
public class test {

    ArrayList<Futbolcu> futbolcuList = new ArrayList<Futbolcu>();
    ArrayList<Basketbolcu> basketbolcuList = new ArrayList<Basketbolcu>();
    Futbolcu messi, ronaldoN, cronaldo, ronaldinho, shevchenko, pirlo, maradona, lewo;
    Basketbolcu curry, lebron, jordan, kareem, magic, bird, nowitzki, pippen;

    test() {
        //futbolcu array listi oluşturuyoruz

        //her bir futbolcuyu oluşturup özelliklerini atadıktan sonra listeye ekliyoruz
        ronaldoN = new Futbolcu("Ronaldo Nazario", "İnter");
        ronaldoN.setKaleciKarsiKarsiya(98);
        ronaldoN.setPenalti(89);
        ronaldoN.setSerbestAtis(78);
        futbolcuList.add(0, ronaldoN);

        cronaldo = new Futbolcu("Cristiano Ronaldo", "Real Madrid");
        cronaldo.setKaleciKarsiKarsiya(97);
        cronaldo.setPenalti(95);
        cronaldo.setSerbestAtis(81);
        futbolcuList.add(1, cronaldo);

        messi = new Futbolcu("Lionel Messi", "Barcelona");
        messi.setKaleciKarsiKarsiya(98);
        messi.setPenalti(95);
        messi.setSerbestAtis(95);
        futbolcuList.add(2, messi);

        pirlo = new Futbolcu("Andrea Pirlo", "Milan");
        pirlo.setKaleciKarsiKarsiya(78);
        pirlo.setPenalti(99);
        pirlo.setSerbestAtis(96);
        futbolcuList.add(3, pirlo);

        shevchenko = new Futbolcu("Andriy Shevchenko", "Milan");
        shevchenko.setKaleciKarsiKarsiya(96);
        shevchenko.setPenalti(87);
        shevchenko.setSerbestAtis(78);
        futbolcuList.add(4, shevchenko);

        maradona = new Futbolcu("Maradona", "Napoli");
        maradona.setKaleciKarsiKarsiya(97);
        maradona.setPenalti(95);
        maradona.setSerbestAtis(96);
        futbolcuList.add(5, maradona);

        lewo = new Futbolcu("Lewandowski", "Bayern Münih");
        lewo.setKaleciKarsiKarsiya(96);
        lewo.setPenalti(87);
        lewo.setSerbestAtis(70);
        futbolcuList.add(6, lewo);

        ronaldinho = new Futbolcu("Ronaldinho", "Barcelona");
        ronaldinho.setKaleciKarsiKarsiya(88);
        ronaldinho.setPenalti(89);
        ronaldinho.setSerbestAtis(89);
        futbolcuList.add(7, ronaldinho);

        //Basketbolcu array listi
        lebron = new Basketbolcu("Lebron James", "Lakers");
        lebron.setIkilik(98);
        lebron.setUcluk(90);
        lebron.setSerbestAtis(90);
        basketbolcuList.add(0, lebron);

        curry = new Basketbolcu("Curry", "Golden State");
        curry.setIkilik(90);
        curry.setUcluk(95);
        curry.setSerbestAtis(90);
        basketbolcuList.add(1, curry);

        jordan = new Basketbolcu("Michael Jordan", "Bulls");
        jordan.setIkilik(99);
        jordan.setUcluk(95);
        jordan.setSerbestAtis(99);
        basketbolcuList.add(2, jordan);

        kareem = new Basketbolcu("Kareem Jabbar", "Lakers");
        kareem.setIkilik(99);
        kareem.setUcluk(90);
        kareem.setSerbestAtis(90);
        basketbolcuList.add(3, kareem);

        magic = new Basketbolcu("Magic", "Lakers");
        magic.setIkilik(95);
        magic.setUcluk(88);
        magic.setSerbestAtis(93);
        basketbolcuList.add(4, magic);

        bird = new Basketbolcu("Larry Bird", "Celtics");
        bird.setIkilik(92);
        bird.setUcluk(93);
        bird.setSerbestAtis(94);
        basketbolcuList.add(5, bird);

        nowitzki = new Basketbolcu("Dirk Nowitzki", "Mavericks");
        nowitzki.setIkilik(92);
        nowitzki.setUcluk(89);
        nowitzki.setSerbestAtis(91);
        basketbolcuList.add(6, nowitzki);

        pippen = new Basketbolcu("Pippen", "Bulls");
        pippen.setIkilik(91);
        pippen.setUcluk(90);
        pippen.setSerbestAtis(92);
        basketbolcuList.add(7, pippen);

    }

    public String rastgeleFutbol() {
        Random rand = new Random();
        int a = rand.nextInt(3);
        String liste[] = new String[3];
        liste[0] = "KaleciKarsiKarsiya";
        liste[1] = "Penalti";
        liste[2] = "SerbestAtis";

        return liste[a];

    }

    public String rastgeleBasket() {
        Random rand = new Random();
        int a = rand.nextInt(2);
        String liste[] = new String[3];
        liste[0] = "Ikilik";
        liste[1] = "Ucluk";
        liste[2] = "SerbestAtis";

        return liste[a];

    }

    public static void main(String[] args) {

        AnaMenu anamenu = new AnaMenu();
        anamenu.setVisible(true);

    }

}
