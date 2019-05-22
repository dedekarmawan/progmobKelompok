package com.example.destinasiwisatabali;

import java.util.ArrayList;

public class BangliData {
    public static String[][] data = new String[][]{
            {"Wisata Dewi Danu",
                    "Songan, Kintamani",
                    "https://i.ytimg.com/vi/Tj0CRlbQV74/maxresdefault.jpg",
                    "Patung Dewi Danu yang dibangun di hulu\n" +
                            "Danau Batur, Desa Songan, Kecamatan\n" +
                            "Kintamani, Bangli, ditetapkan sebagai \n" +
                            "Patung Dewi Danu terbesar dan tertinggi \n" +
                            "di Indonesia oleh Museum Rekor-Dunia\n" +
                            "Indonesia (MURI).",
                    "\t\tLokasi Wisata Dewi Danu\n" +
                            "\t\tterdapat  di Desa Adat Songan Kintamani,\n" +
                            "\t\tKabupaten Bangli, Bali.\n"},

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

            {"Wisata Panglipuran",
                    "Desa Panglipuran, Bali",
                    "https://cdn.rentalmobilbali.net/wp-content/uploads/2017/03/Harga-Tiket-Masuk-Desa-Penglipuran-Bangli-Bali-Featured-Image.jpg",
                    "Desa Penglipuran adalah desa dataran\n" +
                            "tinggi yang indah di Kabupaten Bangli\n" +
                            "di Bali, yang terkenal dengan budaya\n" +
                            "dan tata ruang desa yang terpelihara\n" +
                            "dengan baik. Sementara sebagian besar \n" +
                            "penghuninya telah memeluk modernitas,\n" +
                            "senyawanya masing-masing dipelihara\n" +
                            "dengan baik agar terlihat tradisional\n" +
                            "dengan mempertimbangkan pengunjung, \n" +
                            "dengan taman terawat yang melapisi jalan \n" +
                            "beraspal linear tunggal yang membentang\n" +
                            "melalui pusat desa menuju kuil desa.",
                    "\t\tLokasi Panglipuran terdapat\n" +
                            "\t\tdi Desa Kubu, kabupaten Bangli,\n" +
                            "\t\tBali.\n"},

            {"Air Terjun Kuning",
                    "Taman Bali, Bangli",
                    "http://tempatwisataindonesia.id/wp-content/uploads/2017/03/Air-Terjun-Dusun-Kuning.jpg",
                    "Objek Wisata Air Terjun Dusun Kuning\n" +
                            "di Kawan Bangli Bali adalah salah satu\n" +
                            "tempat wisata yang berada di Desa Kawan, \n" +
                            "Kecamatan Bangli, Kabupaten Bangli, Bali,\n" +
                            "Indonesia. Objek Wisata Air Terjun Dusun\n" +
                            "Kuning di Kawan Bangli Bali adalah tempat \n" +
                            "wisata yang ramai dengan wisatawan pada \n" +
                            "hari biasa maupun hari liburan. Tempat \n" +
                            "ini sangat indah dan bisa memberikan\n" +
                            "sensasi yang berbeda dengan aktivitas \n" +
                            "kita sehari hari. ",
                    "\t\tLokasi Air Terjun Kuning terdapat\n" +
                            "\t\tdi Desa Kawan, Kecamatan Bangli, \n" +
                            "\t\t Kabupaten Bangli, Bali."},
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