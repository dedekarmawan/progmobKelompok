package com.example.destinasiwisatabali;

import java.util.ArrayList;

public class TabananData {
    public static String[][] data = new String[][]{
            {"Pura Ulundanu Batur",
                    "Danau Beratan, Baturiti Tabanan",
                    "http://1.bp.blogspot.com/-vCzKxKC6t0I/VAkTl9d57ZI/AAAAAAAAAW8/HoZjjyEGNMs/s1600/timthumb.jpg"},
            {"Jatiluwih",
                    "Penebel, Tabanan",
                    "https://balicitizen.com/wp-content/uploads/2019/03/sawah1-750x430.jpeg"},
            {"Tanah Lot",
                    "Kediri, Tabanan",
                    "https://www.indonesia.travel/content/dam/indtravelrevamp/en/destinations/bali-nusa-tenggara/bali/tanah-lot/thumb/page_thumb.jpg/_jcr_content/renditions/cq5dam.web.1280.1280.jpeg"},
            {"Kebun Raya Bedugul",
                    "Baturiti, Tabanan",
                    "http://www.sugibalitours.com/wp-content/uploads/2017/07/sugibalitours162.jpg"},

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
