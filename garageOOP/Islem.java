package com.garageOOP;

import static com.garageOOP.IslemInterface.putItems;

public class Islem {
    public static String islemSec(IslemInterface iI, String islem, Garaj grj, int tip){
        putItems();

        return iI.islemSec(islem, grj, tip);
    }
}
