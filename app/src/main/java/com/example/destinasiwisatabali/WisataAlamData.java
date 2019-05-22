package com.example.destinasiwisatabali;

import java.util.ArrayList;

public class WisataAlamData {
    public static String[][] data = new String[][]{
            {"Bukit Belong",
                    "Gunaksa, Klungkung",
                    "https://kintamaniid-a903.kxcdn.com/wp-content/uploads/Bukit-Belong-Gunaksa-3-1024x683.jpg",
                    "Bukit Belong (Blong) wisata yang menyajikan \n" +
                    "panorama pamandangan alam yang mampu\n" +
                    "membuat kita betah untuk berlama-lama.Dari\n" +
                    "atas bukit, kita bisa melihat hamparan sawah\n" +
                    "yang sangat hijau yang berada di bawah nukit.\n" +
                    "Di selatan, kita bisa melihat pemandangan \n" +
                    "pantai di selatan Pulau Bali. Di sebelah \n" +
                    "utara dan timur lautnya berupa berbukitan.\n" +
                    "Dan sebelah baratnya kita akan melihat \n" +
                    "pemandangan pemukiman penduduk yang \n" +
                    "di Desa Gunaksa\n",
                            "\t\tBukit Belong ini bertempat di \n" +
                            "\t\tJl. Raya Gunaksa, Gunaksa, Dawan,\n" +
                            "\t\tKabupaten Klungkung, Bali \n"},

            {"Broken Beach",
                    "Nusa Penida, Klungkung",
                    "https://media-cdn.tripadvisor.com/media/photo-s/13/cc/15/78/pasih-uug-atau-lebih.jpg"
                    , "Broken Beach atau yang lebih dikenal\n" +
                    "sebagai Pasih Uug oleh warga lokal setempat,\n" +
                    "merupakan tebing karang setinggi 200 meter \n" +
                    "yang menjorok ke lautan. Tebing ini terkena\n" +
                    "abrasi air laut selama berabad-abad, \n" +
                    "sehingga lubang mirip gua raksasa terbentuk\n" +
                    "di bagian tengah secara alami.",
                    "\t\tBroken Beach bertempat di Jl.Bunga Mekar,\n" +
                            "\t\tNusapenida, Kabupaten Klungkung, Bali\n"},

            {"Taman Nasional Bali Barat",
                    "Melaya,Gilimanuk",
                    "https://cdn.idntimes.com/content-images/post/20180315/cats-1d6d5a724e43ec38ded712dd343a4932_600x400.jpg",
                    "Taman Nasional Bali Barat terletak\n" +
                            "di bagian barat dari pulau Bali\n" +
                            "di Indonesia. Taman nasional ini\n" +
                            "mempunyai luas 77,000 hektar,\n" +
                            "yang kira-kira meliputi 10% dari\n" +
                            "luas daratan pulau Bali.Taman\n" +
                            "Nasional Bali Barat terdiri\n" +
                            "dari berbagai habitat hutan dan\n" +
                            "sabana. Di tengah-tengah taman\n" +
                            "ini didominasi oleh sisa-sisa\n" +
                            "empat gunung berapi dari zaman\n" +
                            "Pleistocene, dengan gunung Patas\n" +
                            "sebagai titik tertinggi tempat ini.",
                    "\t\tLokasi Taman Nasional Bali Barat\n" +
                            "\t\tterdapat wilayah administrasi\n" +
                            "\t\tKecamatan Gerokgak, Kabupaten\n" +
                            "\t\tBuleleng dan Kecamatan Melaya,\n" +
                            "\t\tKabupaten Jembarana, Provinsi Bali."},

            {"Monkey Forest Ubud",
                    "Ubud, Gianyar",
                    "https://www.1001wisata.com/wp-content/uploads/2014/12/hutan-ubud-bali.jpg",
                    "Monkey Forest Ubud masuk dalam\n" +
                            "salah satu tempat wisata di Ubud\n" +
                            "yang wajib dikunjungi, karena sangat\n" +
                            "ikonik dan mewakili kesan akan objek\n" +
                            "wisata Ubud secara keseluruhan. Objek\n" +
                            "wisata monkey forest Ubud merupakan\n" +
                            "kawasan hutan lindung dan di dalam\n" +
                            "hutan ini, terdapat pura sakral umat\n" +
                            "Hindu Bali, bernama Pura Dalem Agung\n" +
                            "Padangtegal. Nama asli objek wisata\n" +
                            "monkey forest Ubud adalah Mandala\n" +
                            "Wisata Wenara Wana, tapi lebih\n" +
                            "dikenal dengan nama Sacred Monkey\n" +
                            "Forest Sanctuary.",
                    "\t\tLokasi Monkey Forest Ubud terdapat\n" +
                            "\t\tdi Jalan Monkey Forest Ubud,\n" +
                            "\t\tkabupaten Gianyar – Bali \n"},

    };

    public static ArrayList<WisataAlam> getListData(){
        WisataAlam wisataAlam = null;
        ArrayList<WisataAlam> list = new ArrayList<>();
        for (String[] aData : data) {
            wisataAlam = new WisataAlam();
            wisataAlam.setName(aData[0]);
            wisataAlam.setRemarks(aData[1]);
            wisataAlam.setPhoto(aData[2]);
            wisataAlam.setDetail(aData[3]);
            wisataAlam.setLokasi(aData[4]);

            list.add(wisataAlam);
        }

        return list;
    }
}
