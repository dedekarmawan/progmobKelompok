package com.example.destinasiwisatabali;

import java.util.ArrayList;

public class TabananData {
    public static String[][] data = new String[][]{
            {"Pura Ulundanu Beratan",
                    "Danau Beratan, Baturiti Tabanan",
                    "http://1.bp.blogspot.com/-vCzKxKC6t0I/VAkTl9d57ZI/AAAAAAAAAW8/HoZjjyEGNMs/s1600/timthumb.jpg",
                    "Pura Ulun Danu Beratan adalah sebuah tempat \n" +
                            "suci umat Hindu yang terletak di ujung danau \n" +
                            "Beratan, yang berada di kawasan wisata \n" +
                            "Bedugul, desa Candikuning, kecamatan \n" +
                            "Baturiti,kabupaten Tabanan, Bali. Dengan \n" +
                            "jarak tempuh kira-kira 56 km dari kota \n" +
                            "Denpasar dengan melewati jalan raya\n" +
                            "Denpasar - Singaraja.",
                    "\t\tLokasi Pura Ulundanu Beratan\n" +
                            "\t\tterdapat  di Jalan Raya Candi\n" +
                            "\t\tKuning – Bedugul, Desa Candikuning, \n" +
                            "\t\tKecamatan Baturiti, Kabupaten \n" +
                            "\t\tTabanan, Bali\n"},

            {"Jatiluwih",
                    "Penebel, Tabanan",
                    "https://balicitizen.com/wp-content/uploads/2019/03/sawah1-750x430.jpeg",
                    "Desa Jatiluwih Tabanan Bali Indonesia,\n" +
                            "terletak di daerah Penebel, Kabupaten\n" +
                            "Tabanan, Bali. Berada pada ketinggian\n" +
                            "700 meter diatas permukaan air laut,\n" +
                            "merupakan daerah yang berdekatan dengan\n" +
                            "Gunung Batu Karu yang terkenal dengan\n" +
                            "panorama sawah terasering. Anda akan\n" +
                            "selalu menikmati udara sejuk sambil\n" +
                            "menikmati pemandangan alam yang indah.",
                    "\t\tLokasi Jatiluwih terdapat \n" +
                            "\t\tdi Desa Jatiluwih,\n" +
                            "\t\tKabupaten Tabanan, Bali\n"},
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

            { "Kebun Raya Bedugul",
                    "Baturiti, Tabanan",
                    "http://www.sugibalitours.com/wp-content/uploads/2017/07/sugibalitours162.jpg",
                    "Kebun Raya Bali merupakan tempat\n" +
                            "yang unik di pulau Bali yang memadukan\n" +
                            "penelitian botani, pelestarian\n" +
                            "tumbuhan, pendidikan dan rekreasi.\n" +
                            "Disini anda dapat bersantai sambil\n" +
                            "menikmati keindahan dan kedamaian\n" +
                            "sambil mempelajari manfaat tumbuhan\n" +
                            "bagi kehidupan masyarakat. Di kebun\n" +
                            "raya pun anda dapat melihat tumbuhan\n" +
                            "hutan hujan tropik dan kehidupan\n" +
                            "burungnya. Kebun Raya ini terletak\n" +
                            "di ketinggian 1250-1450 dpl, dengan\n" +
                            "luas 157,5 hektar. Suhu disiang hari\n" +
                            "antara 17º - 25º C dan malam hari\n" +
                            "10º - 15º C, dengan kelembaban \n" +
                            "suhu 70 - 90%.",
                    "\t\tLokasi Kebun Raya Bedugul terdapat \n" +
                            "\t\tdi Kecamatan Baturiti,\n" +
                            "\t\tKabupaten Tabanan Bali\n" },

    };

    public static ArrayList<Wisata> getListData(){
        Wisata wisata = null;
        ArrayList<Wisata> list3 = new ArrayList<>();
        for (String[] aData : data) {
            wisata = new Wisata();
            wisata.setNama(aData[0]);
            wisata.setDeskripsi(aData[1]);
            wisata.setPhoto(aData[2]);
            wisata.setDetail(aData[3]);
            wisata.setLocation(aData[4]);
            list3.add(wisata);
        }

        return list3;
    }
}
