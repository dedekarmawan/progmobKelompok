package com.example.destinasiwisatabali;

import java.util.ArrayList;

public class HiburanData {
    public static String[][] data = new String[][]{
            {"Bajra Sandi",
                    "Jalan Puputan, Denpasar",
                    "http://www.pergiberwisata.com/wp-content/uploads/2016/08/monumen-bajra-sandhi.jpg"},
            {"Krisna Fantastic Land",
                    "Seririt, Buleleng",
                    "http://www.krisnafuntasticland.com/wp-content/uploads/2016/11/singaraja-flyer.jpg"},
            {"Bali Chocolate Factory",
                    "Bali Chocolate Desa Jasri, Karangasem",
                    "http://travelthisearth.com/wp-content/uploads/2011/12/Chocolate-Factory-1-of-1.jpg"},
            {"Rumah Pohon Molenteng",
                    "Nusa Penida, Klungkung",
                    "http://nusapenida.id/wp-content/uploads/2016/12/rumah-batu-molenteng-penida.jpg"},
            {"Garuda Wisnu Kencana",
                    "Jalan Raya, Uluwatu Ungasan, Badung ",
                    "https://cdn.moneysmart.id/wp-content/uploads/2018/11/12110256/Garuda-Wisnu-Kencana-bakal-bisa-dinikmati-wisatawan-tahun-depan-700x497.jpg"},

    };

    public static ArrayList<Hiburan> getListData(){
        Hiburan hiburan = null;
        ArrayList<Hiburan> list = new ArrayList<>();
        for (String[] aData : data) {
            hiburan = new Hiburan();
            hiburan.setName(aData[0]);
            hiburan.setRemarks(aData[1]);
            hiburan.setPhoto(aData[2]);

            list.add(hiburan);
        }

        return list;
    }
}
