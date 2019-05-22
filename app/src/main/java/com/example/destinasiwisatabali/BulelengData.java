package com.example.destinasiwisatabali;

import java.util.ArrayList;

public class BulelengData {
    public static String[][] data = new String[][]{
            {"Pura Pulaki",
                    "Gerokgak, Buleleng",
                    "https://kintamaniid-a903.kxcdn.com/wp-content/uploads/Pura-Agung-Pulaki-Buleleng-3.png"
                    , "\n" +
                    "Pura Pulaki adalah Pura Hindu Bali atau pura\n" +
                    "yang terletak di sebelah barat Singaraja, \n" +
                    "Bali, Indonesia. Pura diatur di tanah datar \n" +
                    "dengan singkapan berbatu sebagai latar \n" +
                    "belakang. Pura Pulaki adalah pura segara atau \n" +
                    "pura laut Bali, yang mengelilingi pulau untuk\n" +
                    "membentuk rantai kuil yang melindungi pulau.\"",
                    "\t\tLokasi Pura Pura Pulaki terdapat di \n" +
                            "\t\tJl. Singaraja-Gilimanuk, Banyupoh, Gerokgak, \n" +
                            "\t\tKabupaten Buleleng, Bali 81155\""},
            {"Krisna Fantastic Land",
                    "Seririt, Buleleng",
                    "http://www.krisnafuntasticland.com/wp-content/uploads/2016/11/singaraja-flyer.jpg"
                    , "Krisna Funtastic Land merupakan taman\n" +
                    "bermain keluarga terbaru yang ada di \n" +
                    "Buleleng Bali. Taman bermain ini menawarkan \n" +
                    "sejuta pengalaman berfantasi dengan berbagai \n" +
                    "macam wahananya. Pengunjung yang akan bermain \n" +
                    "di sini pasti akan merasakan sensasi bermain \n" +
                    "yang berbeda di Bali.Taman ini menawarkan 16\n" +
                    "wahana hiburan dengan berbagai tingkat \n" +
                    "kegembiraan dan pasti akan menjadi salah satu\n" +
                    "daya tarik perjalanan anak Anda ke Bali.",
                    "\t\tTaman hiburan Krisna Funtastic Land terletak\n" +
                            "\t\tdi pantai utara Bali di dekat Pantai Lovina \n" +
                            "\t\tyang terkenal, sekitar 12 km barat kota \n" +
                            "\t\tSingaraja.tepatnya di Temukus, Banjar,Buleleng"},
            {"Banyumala Waterfall",
                    "Sukasada, Singaraja",
                    "https://static1.squarespace.com/static/596b2969d2b85786e6892853/t/5ae94af370a6ad102db647a6/1525238592269/Banyumala+Waterfall?format=750w"
                    , "\n" +
                    "Air Terjun Kembar Banyumala adalah salah\n" +
                    "satutujuan langka yang tetap berada di luar\n" +
                    "jaringan dari keramaian, menawarkan oasis \n" +
                    "hutan yang tenang bagi mereka yang ingin \n" +
                    "melarikan diri dari Bali Selatan yang \n" +
                    "ramai dan ramai.",
                    "\t\tBanyumala Waterfall terdapat\n" +
                            "\t\tdi Jalan Raya Candi Kuning,\n " +
                            "\t\tBedugul,Desa Candikuning,\n" +
                            "\t\tKecamatan Baturiti,\n" +
                            "\t\tKabupaten Tabanan, Bali\n"},
            {"Pantai Lovina",
                    "Desa Kalibukbuk, Buleleng",
                    "https://piknikasik.com/wp-content/uploads/2016/08/lumba-lumba-liar-pantai-lovina-bali3.jpg"
                    , "Pantai Lovina atau Lovina terletak sekitar \n" +
                    "9 Km sebelah barat kota Singaraja, ini \n" +
                    "merupakan salah satu objek wisata yang ada \n" +
                    "di Bali Utara. Wisatawan baik asing maupun \n" +
                    "lokal banyak yang berkunjung ke sana, selain \n" +
                    "untuk melihat pantainya yang masih alami, \n" +
                    "juga untuk melihat ikan lumba-lumba yang \n" +
                    "banyak terdapat di pantai ini. Dengan \n" +
                    "menyewa perahu nelayan setempat, kita dapat \n" +
                    "mendekati lumba-lumba. Berbagai penginapan \n" +
                    "mulai dari Inn hingga Cottages tersedia \n" +
                    "dengan harga yang sangat terjangkau. ",
                    "\t\tLokasi air terjun Banyumala yang tersembunyi \n" +
                            "\t\tnan indah ini beralamat lengkap di Desa ,\n" +
                            "\t\tWanagiri Sukasada, Buleleng, Bali.Dijuluki \n" +
                            "\t\tsebagai air terjun terindah di Bali, air \n" +
                            "\t\tterjun ini layak masuk dalam itinerary Anda. \n" +
                            "\t\tPerjalanan menuju ke lokasi mungkin akan \n" +
                            "\t\tmemakan waktu sekitar 2.5 jam lamanya dari\n" +
                            "\t\t Bandara Internasional Ngurah Rai.\n"},

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
