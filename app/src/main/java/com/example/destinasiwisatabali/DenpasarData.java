package com.example.destinasiwisatabali;

import java.util.ArrayList;

public class DenpasarData {
    public static String[][] data = new String[][]{
            {"Bajra Sandi",
                    "Jalan Puputan, Denpasar",
                    "http://www.pergiberwisata.com/wp-content/uploads/2016/08/monumen-bajra-sandhi.jpg"},
            {"Pantai Mertasari",
                    "Sanur, Denpasar",
                    "https://kintamaniid-a903.kxcdn.com/wp-content/uploads/Pantai-Mertasari-Sanur-saat-matahari-terbenam-1024x683.jpg"},
            {"Tukad Badung",
                    "Jalan Tukad Badung, Denpasar",
                    "https://finroll.com/wp-content/uploads/2018/09/mantap.jpg"},
            {"Museum Bali",
                    "Dangin Puri, Denpasar",
                    "http://2.bp.blogspot.com/_lA2ppl08oK8/S7iIup_hjYI/AAAAAAAAAPc/VZYN4nnUgaQ/s1600/bali-museum-1.gif"},

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
