package com.example.destinasiwisatabali;

import java.util.ArrayList;

public class GianyarData {
    public static String[][] data = new String[][]{
            {"Monkey Forest",
                    "Ubud, Gianyar",
                    "https://www.1001wisata.com/wp-content/uploads/2014/12/hutan-ubud-bali.jpg"},
            {"Bukit Campuhan",
                    "Payangan, Gianyar",
                    "https://www.nativeindonesia.com/wp-content/uploads/2018/09/bukit-campuhan-ubud-bali.jpg"},
            {"Puri Agung Ubud",
                    "Ubud, Gianyar",
                    "https://cdn.raftingbali.net/wp-content/uploads/2017/05/Ubud-Royal-Palace-Bali-Facebook.jpg"},
            {"Ceking Terrace",
                    "Tegalalang, Ubud",
                    "https://i0.wp.com/baligreentour.com/wp-content/uploads/2015/09/Tegalalang-Rice-Terrace-Bali-Green-Tour.jpg?resize=620%2C261"},

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
