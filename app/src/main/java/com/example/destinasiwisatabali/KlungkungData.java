package com.example.destinasiwisatabali;

import java.util.ArrayList;

public class KlungkungData {
    public static String[][] data = new String[][]{
            {"Bukit Belong",
                    "Gunaksa, Klungkung",
                    "https://kintamaniid-a903.kxcdn.com/wp-content/uploads/Bukit-Belong-Gunaksa-3-1024x683.jpg"
                    , "Bukit Belong (Blong) wisata yang menyajikan \n" +
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
            {"Rumah Pohon Molenteng",
                    "Nusa Penida, Klungkung",
                    "http://nusapenida.id/wp-content/uploads/2016/12/rumah-batu-molenteng-penida.jpg"
                    , "Rumah Pohon Batu Molenteng, seperti \n" +
                    "namanya sebuah rumah yang terletak di\n" +
                    "atas pohon, rumah tersebut dibuat dengan \n" +
                    "bahan-bahan dari alam berukuran sekitar \n" +
                    "4x4 meter, memanfaatkan kekokohan sebuah \n" +
                    "pohon besar yang menopangnya, dari rumah\n" +
                    "inilah maka pengunjung bisa menyaksikan \n" +
                    "keindahan alam sekitarnya, keindahan alam \n" +
                    "pantai yang belum terjamah, tampak asri dan\n" +
                    "menawan,sebuah tempat wisata instagramable \n" +
                    "di Nusa Penida Bali.\n",
                    "\t\tLokasi Pura Ulundanu Beratan\n" +
                            "\t\tRumah Pohon Molenteng ini bertempat di \n" +
                            "\t\tPejukutan, Nusapenida, Kabupaten \n" +
                            "\t\tKlungkung, Bali\n"},
            {"Pura Goa Lawah",
                    "Pesinggahan, Klungkung",
                    "https://upload.wikimedia.org/wikipedia/commons/e/ea/Goa_Lawah_Bali53.jpg"
                    , "Pura Goa Lawah merupakan sebuah pura yang\n" +
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
