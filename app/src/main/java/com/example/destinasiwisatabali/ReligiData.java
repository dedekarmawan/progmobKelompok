package com.example.destinasiwisatabali;

import java.util.ArrayList;

public class ReligiData {
    public static String[][] data = new String[][]{
            {"Pura Rambut Siwi",
                    "Jalan Raya Denpasar, Gilimanuk",
                    "https://panbelog.files.wordpress.com/2014/11/112214_0029_purarambuts1.jpg?w=660",
                    "Pura Rambut Siwi adalah salah satu\n" +
                    "pura Dang Kahyangan jagat yang terletak\n" +
                    "di Kabupaten Jembrana Bali. Pura Dang\n" +
                    "Kahyangan sendiri merupakan tempat suci\n" +
                    "yang diperuntukkan untuk menghormati\n" +
                    "guru-guru suci seperti pandeta, Maha \n" +
                    "Rsi dan para Empu.",
                            "\t\tLokasi Pura Rambut Siwi terdapat\n" +
                            "\t\tdi Jalan Denpasar - Gilimanuk,\n" +
                            "\t\tDesa Yehembang, Kec. Mendoyo\n" +
                            "\t\tKab. Jembrana, Bali\n"},

            {"Pura Goa Lawah",
                    "Pesinggahan, Klungkung",
                    "https://upload.wikimedia.org/wikipedia/commons/e/ea/Goa_Lawah_Bali53.jpg",
                    "Pura Goa Lawah merupakan sebuah pura yang\n" +
                    "terletak diDesa Pasinggahan, Kecamatan \n" +
                    "Dawan, Kabupaten Klungkung, Bali, yang \n" +
                    "berjarak sekitar 40 km dari ibukota Bali, \n" +
                    "Denpasar. Pura Goa Lawah dikenal masyarakat\n" +
                    "karena adanya sebuah goa pada bagian utama \n" +
                    "pura ini, yang didalamnya terdapat \n" +
                    "sekumpulan kelelawar.",
                            "\t\tLokasi Pura Ulundanu Beratan\n" +
                            "\t\tPura Goa Lawah bertempat di Jl. \n" +
                            "\t\tRaya Goa Lawah, Pesinggahan, Dawan, \n" +
                            "\t\tKabupaten Klungkung, Bali\n"},

            {"Pura Ulun Danu Batur",
                    "Batur, Kintamani",
                    "http://inputbali.com/wp-content/uploads/2016/04/PuraBatur2.jpg",
                    "Pura Ulun Danu Batur adalah candi Hindu\n" +
                    "Bali yang terletak di pulau Bali.\n" +
                    "Sebagai salah satu Pura Kahyangan Jagat,\n" +
                    "Pura Ulun Danu Batur adalah salah satu\n" +
                    "candi paling penting di Bali yang\n" +
                    "bertindak sebagai pemelihara\n" +
                    "harmoni dan stabilitas seluruh pulau.",
                            "\t\tLokasi Pura Ulun Danu Batur\n" +
                            "\t\tterdapat  di Desa Kalanganyar,\n" +
                            "\t\tKecamatan Kintamani, Bangli, Bali"},

            {"Pura Tanah Lot",
                    "Kediri, Tabanan",
                    "https://www.indonesia.travel/content/dam/indtravelrevamp/en/destinations/bali-nusa-tenggara/bali/tanah-lot/thumb/page_thumb.jpg/_jcr_content/renditions/cq5dam.web.1280.1280.jpeg",
                    "Pura Tanah Lot adalah sebuah objek\n" +
                    "wisata di Bali, Indonesia. Di sini\n" +
                    "ada dua pura yang terletak di atas\n" +
                    "batu besar. Satu terletak di atas\n" +
                    "bongkahan batu dan satunya terletak\n" +
                    "di atas tebing mirip dengan Pura Uluwatu.\n" +
                    "Pura Tanah Lot ini merupakan bagian dari\n" +
                    "pura Dang Kahyangan. Pura Tanah Lot\n" +
                    "merupakan pura laut tempat pemujaan\n" +
                    "dewa-dewa penjaga laut. Tanah Lot\n" +
                    "terkenal sebagai tempat yang indah\n" +
                    "untuk melihat matahari terbenam.",
                            "\t\tLokasi Pura Tanah Lot terdapat \n" +
                            "\t\tdi Jalan Tanah-Lot, Desa Beraban,\n" +
                            "\t\tKecamatan Kediri, Kabupaten Tabanan\n"},

    };

    public static ArrayList<Religi> getListData(){
        Religi religi = null;
        ArrayList<Religi> list = new ArrayList<>();
        for (String[] aData : data) {
            religi = new Religi();
            religi.setName(aData[0]);
            religi.setRemarks(aData[1]);
            religi.setPhoto(aData[2]);
            religi.setDetail(aData[3]);
            religi.setLokasi(aData[4]);

            list.add(religi);
        }

        return list;
    }
}
