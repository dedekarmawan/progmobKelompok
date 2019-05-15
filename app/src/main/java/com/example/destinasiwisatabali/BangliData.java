package com.example.destinasiwisatabali;

import java.util.ArrayList;

public class BangliData {
    public static String[][] data = new String[][]{
            {"Wisata Dewi Danu",
                    "Songan, Kintamani",
                    "https://i.ytimg.com/vi/Tj0CRlbQV74/maxresdefault.jpg"},
            {"Pura Batur",
                    "Batur, Kintamani",
                    "http://inputbali.com/wp-content/uploads/2016/04/PuraBatur2.jpg"},
            {"Panglipuran",
                    "Desa Panglipuran, Bali",
                    "https://cdn.rentalmobilbali.net/wp-content/uploads/2017/03/Harga-Tiket-Masuk-Desa-Penglipuran-Bangli-Bali-Featured-Image.jpg"},
            {"Air Terjun Kuning",
                    "Taman Bali, Bangli",
                    "http://tempatwisataindonesia.id/wp-content/uploads/2017/03/Air-Terjun-Dusun-Kuning.jpg"},

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