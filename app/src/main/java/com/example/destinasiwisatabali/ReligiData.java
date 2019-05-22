package com.example.destinasiwisatabali;

import java.util.ArrayList;

public class ReligiData {
    public static String[][] data = new String[][]{
            {"Pura Rambut Siwi",
                    "Jalan Raya Denpasar, Gilimanuk",
                    "https://panbelog.files.wordpress.com/2014/11/112214_0029_purarambuts1.jpg?w=660"},
            {"Pura Goa Lawah",
                    "Pesinggahan, Klungkung",
                    "https://upload.wikimedia.org/wikipedia/commons/e/ea/Goa_Lawah_Bali53.jpg"},
            {"Pura Ulundanu Batur",
                    "Danau Beratan, Baturiti Tabanan",
                    "http://1.bp.blogspot.com/-vCzKxKC6t0I/VAkTl9d57ZI/AAAAAAAAAW8/HoZjjyEGNMs/s1600/timthumb.jpg"},
            {"Tanah Lot",
                    "Kediri, Tabanan",
                    "https://www.indonesia.travel/content/dam/indtravelrevamp/en/destinations/bali-nusa-tenggara/bali/tanah-lot/thumb/page_thumb.jpg/_jcr_content/renditions/cq5dam.web.1280.1280.jpeg"},

    };

    public static ArrayList<Religi> getListData(){
        Religi religi = null;
        ArrayList<Religi> list = new ArrayList<>();
        for (String[] aData : data) {
            religi = new Religi();
            religi.setName(aData[0]);
            religi.setRemarks(aData[1]);
            religi.setPhoto(aData[2]);

            list.add(religi);
        }

        return list;
    }
}
