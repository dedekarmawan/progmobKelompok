package com.example.destinasiwisatabali;

import java.util.ArrayList;

public class KabupatenData {
    public static int[][] data = new int[][]{
            {R.drawable.karangasem},
            {R.drawable.badung},
            {R.drawable.tabanan},
            {R.drawable.denpasar},
            {R.drawable.jembrana},
            {R.drawable.gianyar},
            {R.drawable.bangli},
            {R.drawable.buleleng},
            {R.drawable.klungkung}
    };

    public static ArrayList<Kabupaten> getListData(){
        Kabupaten kabupaten = null;
        ArrayList<Kabupaten> list = new ArrayList<>();
        for (int[] aData : data) {
            kabupaten = new Kabupaten();
//
            kabupaten.setPhoto(aData[0]);
//            kabupaten.setRemarks(aData[1]);

            list.add(kabupaten);
        }

        return list;
    }
}
