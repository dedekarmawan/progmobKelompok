package com.example.destinasiwisatabali;

import java.util.ArrayList;

public class BulelengData {
    public static String[][] data = new String[][]{
            {"Pura Pulaki",
                    "Gerokgak, Buleleng",
                    "https://kintamaniid-a903.kxcdn.com/wp-content/uploads/Pura-Agung-Pulaki-Buleleng-3.png"},
            {"Krisna Fantastic Land",
                    "Seririt, Buleleng",
                    "http://www.krisnafuntasticland.com/wp-content/uploads/2016/11/singaraja-flyer.jpg"},
            {"Banyumala Waterfall",
                    "Sukasada, Singaraja",
                    "https://static1.squarespace.com/static/596b2969d2b85786e6892853/t/5ae94af370a6ad102db647a6/1525238592269/Banyumala+Waterfall?format=750w"},
            {"Pantai Lovina",
                    "Desa Kalibukbuk, Buleleng",
                    "https://piknikasik.com/wp-content/uploads/2016/08/lumba-lumba-liar-pantai-lovina-bali3.jpg"},

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
