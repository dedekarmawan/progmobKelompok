package com.example.destinasiwisatabali;

import java.util.ArrayList;

public class JembranaData {
    public static String[][] data = new String[][]{
            {"Bunut Bolong",
                    "Manggisari, Pekutatan, Jembrana",
                    "http://2.bp.blogspot.com/-N-R4Iz-GLfo/TgL3wdC6K5I/AAAAAAAAAIY/KKdMdi4Bg7M/s1600/banut+bolong2.JPG"},
            {"Pura Rambut Siwi",
                    "Jalan Raya Denpasar, Gilimanuk",
                    "https://panbelog.files.wordpress.com/2014/11/112214_0029_purarambuts1.jpg?w=660"},
            {"Taman Nasional Bali Barat",
                    "Melaya,Gilimanuk",
                    "https://cdn.idntimes.com/content-images/post/20180315/cats-1d6d5a724e43ec38ded712dd343a4932_600x400.jpg"},

    };

    public static ArrayList<Wisata> getListData(){
        Wisata wisata = null;
        ArrayList<Wisata> list3 = new ArrayList<>();
        for (String[] aData : data) {
            wisata = new Wisata();
            wisata.setNama(aData[0]);
            wisata.setDeskripsi(aData[1]);
            wisata.setPhoto(aData[2]);
            list3.add(wisata);
        }

        return list3;
    }
}
