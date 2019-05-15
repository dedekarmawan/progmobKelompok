package com.example.destinasiwisatabali;

import java.util.ArrayList;

public class KlungkungData {
    public static String[][] data = new String[][]{
            {"Bukit Belong",
                    "Gunaksa, Klungkung",
                    "https://kintamaniid-a903.kxcdn.com/wp-content/uploads/Bukit-Belong-Gunaksa-3-1024x683.jpg"},
            {"Broken Beach",
                    "Nusa Penida, Klungkung",
                    "https://media-cdn.tripadvisor.com/media/photo-s/13/cc/15/78/pasih-uug-atau-lebih.jpg"},
            {"Rumah Pohon Molenteng",
                    "Nusa Penida, Klungkung",
                    "http://nusapenida.id/wp-content/uploads/2016/12/rumah-batu-molenteng-penida.jpg"},
            {"Pura Goa Lawah",
                    "Pesinggahan, Klungkung",
                    "https://upload.wikimedia.org/wikipedia/commons/e/ea/Goa_Lawah_Bali53.jpg"},

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
