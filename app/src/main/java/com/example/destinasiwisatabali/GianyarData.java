package com.example.destinasiwisatabali;

import java.util.ArrayList;

public class GianyarData {
    public static String[][] data = new String[][]{
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

            {"Bukit Campuhan",
                    "Payangan, Gianyar",
                    "https://www.nativeindonesia.com/wp-content/uploads/2018/09/bukit-campuhan-ubud-bali.jpg",
                    "Bukit Campuhan menyuguhkan\n" +
                            "pemandangan cantik dan perbukitan \n" +
                            "hijau yang dipenuhi pepohonan\n" +
                            "tropis lengkap dengan lembah\n" +
                            "serta areal pesawahannya.\n" +
                            "Begitu eksotis dan romantisnya\n" +
                            "tempat wisata yang mempunyai\n" +
                            "nama lain Bukit Gunung Lebah ini,\n" +
                            "juga populer dengan julukan\n" +
                            "Bukit Cinta Campuhan. Sementara\n" +
                            "bagi wisatawan asal luar negeri,\n" +
                            "menyebut tempat wisata Bukit\n" +
                            "Campuhan Ubud Bali ini dengan\n" +
                            "sebutan Campuhan Ridge Walk.",
                    "\t\tLokasi Bukit Campuhan terdapat\n" +
                            "\t\tdi Jalan Bangkiang Sidem, Kelusa,\n" +
                            "\t\tPayangan, Ubud, Kelusa, Payangan,\n" +
                            "\t\tKabupaten Gianyar, Bali \n"},

            {"Puri Agung Ubud",
                    "Ubud, Gianyar",
                    "https://cdn.raftingbali.net/wp-content/uploads/2017/05/Ubud-Royal-Palace-Bali-Facebook.jpg",
                    "Tempat tinggal dari raja Ubud\n" +
                            "(Tjokorde Gede Agung Sukawati) inilah\n" +
                            "yang bernama Puri Saren Agung atau\n" +
                            "lebih dikenal dengan nama puri Ubud.\n" +
                            "Lokasi dari puri Ubud berada di\n" +
                            "tengah-tengah Ubud. Saat ini puri Ubud\n" +
                            "telah menjadi salah satu objek\n" +
                            "wisata di Bali. Hampir setiap\n" +
                            "malam di puri Ubud diadakan pentas\n" +
                            "kesenian tari, seperti tari Barong Ubud.\n" +
                            "Di seberang puri Ubud ada tempat \n" +
                            "makan khas kuliner Bali, namanya\n" +
                            "warung Babi Guling Ibu Oka.",
                    "\t\tLokasi Bukit Campuhan terdapat\n" +
                            "\t\tdi tengah-tengah Ubud,"},

            {"Ceking Terrace",
                    "Tegalalang, Ubud",
                    "https://i0.wp.com/baligreentour.com/wp-content/uploads/2015/09/Tegalalang-Rice-Terrace-Bali-Green-Tour.jpg?resize=620%2C261",
                    "Ceking Terrace adalah daerah\n" +
                            "yang menggunakan sistim pertanian \n" +
                            "terasering atau bentuk area persawahan\n" +
                            "yang berundak-undak pada daerah miring\n" +
                            "atau lereng bukit. Ceking Terrace ini \n" +
                            "terletak di Desa Ceking, Tegalalang,\n" +
                            "Kabupaten Gianyar.",
                    "\t\tLokasi Bukit Campuhan terdapat\n" +
                            "\t\tdi Desa Ceking, Kecamatan Tegalalang,\n" +
                            "\t\tKabupaten Gianyar, Bali"},
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