package com.example.destinasiwisatabali;

import java.util.ArrayList;

public class Karangasem {
    public static String[][] data = new String[][]{
            {"Pura Besakih",
                    "Pura Besakih, Desa Besakih Karangasem",
                    "https://cdn.staticaly.com/img/2.bp.blogspot.com/--TFdOP8CbGY/Vj7cq-9uAzI/AAAAAAAAA1U/UPTjUSUL_EA/s640/pura%2Bbesakih.jpg"},
            {"Taman Ujung",
                    "Taman Ujung Desa Tumbu Karangasem ",
                    "https://cdn.shortpixel.ai/client/to_webp,q_glossy,ret_img,w_1400/https://www.infobali.id/wp-content/uploads/2019/05/taman-ujung-bali-tour.jpg"},
            {"Bukit Asah",
                    "Bukit Asah, Desa Bugbug Karangasem",
                    "https://aristonkupangoptima.files.wordpress.com/2012/08/bukit-asah-karangasem-bali.jpg"},
            {"Bali Chocolate Factory",
                    "Bali Chocolate Desa Jasri, Karangasem",
                    "http://travelthisearth.com/wp-content/uploads/2011/12/Chocolate-Factory-1-of-1.jpg"},
            {"Pura Lempuyang",
                    "Desa Lempuyang, Karangasem",
                    "https://live.staticflickr.com/4319/35184114673_5b6de2cb78_b.jpg"},

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
