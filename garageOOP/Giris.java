package com.garageOOP;

public class Giris implements IslemInterface {

    @Override
    public String islemSec(String islem, Garaj grj, int tip) {

        if (aracAlan.get(tip) <= grj.getYer()) {

            grj.getAracList().add(new Araclar(tip, aracIsim.get(tip), aracAlan.get(tip)));
            grj.setYer(grj.getYer() - aracAlan.get(tip));

            Haberci hbrAl = new Haberci();
            grj.ekle(hbrAl);

            grj.setAracList(grj.getAracList());
            grj.getAracListBefore().add(new Araclar(tip, aracIsim.get(tip), aracAlan.get(tip)));

            return ("---------- Liste: " + grj.getAracList());
        }
        else
            return ("---------- Otoparkta Yer Yok Önce Çıkış Yapılmalı ");
    }
}
