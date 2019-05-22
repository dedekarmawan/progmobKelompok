package com.example.destinasiwisatabali;

import java.util.ArrayList;

public class DenpasarData {
    public static String[][] data = new String[][]{
            {"Monumen Bajra Sandi",
                    "Jalan Puputan, Denpasar",
                    "http://www.pergiberwisata.com/wp-content/uploads/2016/08/monumen-bajra-sandhi.jpg",
                    "Museum Bajra Sandi merupakan Monumen\n" +
                            "Perjuangan Rakyat Bali yang terletak\n" +
                            "di areal lapangan Niti Mandala Denpasar,\n" +
                            "Jl. Raya Puputan. Museum ini dibangun\n" +
                            "dengan meniru mentuk bajra yang sering\n" +
                            "digunakan oleh pemangku/sulinggih.\n" +
                            "Museum ini dibangun di atas tanah\n" +
                            "seluas 13,8 hektar dengan luas gedung\n" +
                            "70 x 70 meter. Museum ini diresmikan\n" +
                            "oleh Presiden Megawati Soekarno Putri\n" +
                            "pada tanggal 14 Juni 2003.",
                    "\t\tLokasi Monumen Bajra Sandi\n" +
                            "\t\tterdapat di Jalan Raya Pututan No.142,\n" +
                            "\t\tPanjer, Denpasar Selatan, Bali" },

            {"Pantai Mertasari",
                    "Sanur, Denpasar",
                    "https://kintamaniid-a903.kxcdn.com/wp-content/uploads/Pantai-Mertasari-Sanur-saat-matahari-terbenam-1024x683.jpg",
                    "Pantai Mertasari merupakan salah satu\n" +
                            "pantai di dalam kawasan wisata Pantai\n" +
                            "Sanur Bali. Keberadaan pantai ini jarang\n" +
                            "didengar oleh wisatawan nusantara karena\n" +
                            "tidak dimasukkan dalam paket wisata.\n" +
                            "Keramaian pantai ini terlihat ketika\n" +
                            "menjadi tempat penyelenggaraan event\n" +
                            "salah satunya adalah Festival\n" +
                            "Layang-Layang Bali.\n",
                    "\t\tLokasi Pantai Mertasari terdapat \n" +
                            "\t\tdi Jalan Tirta Empul, Desa Intaran,\n" +
                            "\t\tKelurahan Sanur, Kecamatan Denpasar Selatan,\n" +
                            "\t\tDenpasar, Bali.\n"},

            {"Tukad Badung",
                    "Jalan Tukad Badung, Denpasar",
                    "https://finroll.com/wp-content/uploads/2018/09/mantap.jpg",
                    "Dulunya mana ada yang pengen ke\n" +
                            "Tukad Badung, tapi sekarang beda lagi nih.\n" +
                            "Berkat Pemerintah Kota Denpasar dan para\n" +
                            "dukungan masyarakat Denpasar, akhirnya\n" +
                            "Kota Denpasar bisa menciptakan tempat\n" +
                            "wisata baru yang cocok banget sebagai\n" +
                            "tempat rekreasi bareng keluarga.\n" +
                            "Bagi yang belum sempat kesini,\n" +
                            "cobain aja menikmati suasana baru\n" +
                            "Tukad Badung bareng teman atau gebetan\n" +
                            "kamu juga bisa. Tempat ini gratis\n" +
                            "gak dipungut biaya masuk, karena\n" +
                            "Pemerintah Kota Denpasar ingin terus\n" +
                            "menambah ruang publik agar nantinya\n" +
                            "kedepan dapat dimanfaatkan oleh\n" +
                            "generasi muda untuk berkreativitas.",
                    "\t\tLokasi Wisata Tukad Badung terdapat \n" +
                            "\t\tdi Jalan Gajah Mada, Denpasar, Bali\n"},

            {"Museum Bali",
                    "Dangin Puri, Denpasar",
                    "http://2.bp.blogspot.com/_lA2ppl08oK8/S7iIup_hjYI/AAAAAAAAAPc/VZYN4nnUgaQ/s1600/bali-museum-1.gif",
                    "Museum Bali Denpasar, juga disebut\n" +
                            "dengan nama museum negeri propinsi\n" +
                            "Bali Denpasar, artinya museum ini\n" +
                            "dikelola oleh pemprov provinsi Bali.\n" +
                            "Museum Bali Denpasar, menyimpan banyak\n" +
                            "sekali pengetahuan yang menyangkut\n" +
                            "peradaban manusia dari zaman ke zaman,\n" +
                            "khususnya pada masyarakat Bali.\"",
                    "\t\tLokasi Museum Bali terdapat \n" +
                            "\t\tdi  Jalan Mayor Wisnu Denpasar Bali \n"},

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
