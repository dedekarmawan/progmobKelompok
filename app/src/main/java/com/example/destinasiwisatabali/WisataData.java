package com.example.destinasiwisatabali;

import java.util.ArrayList;

public class WisataData {
    public static String[][] data = new String[][]{
            {"Pura Uluwatu",
                    "Pecatu, Kuta Selatan, Badung",
                    "https://www.nativeindonesia.com/wp-content/uploads/2018/08/pura-uluwatu-bali.jpg"},
            {"Garuda Wisnu Kencana",
                    "Jalan Raya, Uluwatu Ungasan, Badung ",
                    "https://cdn.moneysmart.id/wp-content/uploads/2018/11/12110256/Garuda-Wisnu-Kencana-bakal-bisa-dinikmati-wisatawan-tahun-depan-700x497.jpg"},
            {"Sangeh",
                    "Abiansemal , Badung",
                    "https://www.balimagictour.com/data2/photos/sangeh-monkey-forest-balimagictour.jpg"},
            {"Pantai Kuta",
                    "Kuta Selatan, Badung",
                    "https://wisataria.com/wp-content/uploads/2018/06/Pantai-Kuta-Bali.jpg"},
            {"Taman Ayun",
                    "Mengwi, Badung",
                    "http://static.news.lewatmana.com/080480100_1452650443-1.jpg"},

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
