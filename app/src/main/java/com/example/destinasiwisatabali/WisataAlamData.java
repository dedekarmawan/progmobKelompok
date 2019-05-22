package com.example.destinasiwisatabali;

import java.util.ArrayList;

public class WisataAlamData {
    public static String[][] data = new String[][]{
            {"Bukit Belong",
                    "Gunaksa, Klungkung",
                    "https://kintamaniid-a903.kxcdn.com/wp-content/uploads/Bukit-Belong-Gunaksa-3-1024x683.jpg"},
            {"Broken Beach",
                    "Nusa Penida, Klungkung",
                    "https://media-cdn.tripadvisor.com/media/photo-s/13/cc/15/78/pasih-uug-atau-lebih.jpg"},
            {"Taman Nasional Bali Barat",
                    "Melaya,Gilimanuk",
                    "https://cdn.idntimes.com/content-images/post/20180315/cats-1d6d5a724e43ec38ded712dd343a4932_600x400.jpg"},
            {"Monkey Forest",
                    "Ubud, Gianyar",
                    "https://www.1001wisata.com/wp-content/uploads/2014/12/hutan-ubud-bali.jpg"},

    };

    public static ArrayList<WisataAlam> getListData(){
        WisataAlam wisataAlam = null;
        ArrayList<WisataAlam> list = new ArrayList<>();
        for (String[] aData : data) {
            wisataAlam = new WisataAlam();
            wisataAlam.setName(aData[0]);
            wisataAlam.setRemarks(aData[1]);
            wisataAlam.setPhoto(aData[2]);

            list.add(wisataAlam);
        }

        return list;
    }
}
