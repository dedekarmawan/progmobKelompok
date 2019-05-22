package com.example.destinasiwisatabali;

import java.util.ArrayList;

public class JembranaData {
    public static String[][] data = new String[][]{
            {"Bunut Bolong",
                    "Manggisari, Pekutatan, Jembrana",
                    "http://2.bp.blogspot.com/-N-R4Iz-GLfo/TgL3wdC6K5I/AAAAAAAAAIY/KKdMdi4Bg7M/s1600/banut+bolong2.JPG",
                    "Bunut Bolong yang terletak di desa\n" +
                            "Manggisari, Pekutatan, Jembrana.\n" +
                            "Pohon Bunut raksasa ini sudah berumur\n" +
                            "ratusan tahun, pada bagian bawah pohon\n" +
                            "yaitu pada akar-akarnya terdapat\n" +
                            "sebuah lubang besar serta terdapat\n" +
                            "jalan yang bisa dilintasi oleh mobil\n" +
                            "bahkan truk dan bus berbadan besar\n" +
                            "sekalipun.",
                    "\t\tLokasi Bunut Bolong terdapat\n" +
                            "\t\tdi Desa Manggissari, Kecamatan Pekutatan,\n" +
                            "\t\tKabupaten Jembrana, Bali\n"},

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
