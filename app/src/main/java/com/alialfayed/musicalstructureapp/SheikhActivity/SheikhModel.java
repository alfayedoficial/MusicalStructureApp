package com.alialfayed.musicalstructureapp.SheikhActivity;

import com.alialfayed.musicalstructureapp.Riwaya.RiwayaModel;

import java.io.Serializable;
import java.util.ArrayList;

/**
 * Created by ( Eng Ali Al Fayed)
 * Class do :
 * Date 5/7/2020 - 10:00 PM
 */
public class SheikhModel implements Serializable, Comparable<SheikhModel> {

    private String title;
    private ArrayList<RiwayaModel> riwayaModel;
    private int img;

    SheikhModel(String title, int img) {
        this.title = title;
        this.riwayaModel = new ArrayList<>();
        this.img = img;
    }

    public String getTitle() {
        return title;
    }

    public ArrayList<RiwayaModel> getRiwayaModel() {
        return riwayaModel;
    }

    int getImg() {
        return img;
    }

    public void setRiwaya(RiwayaModel riwayaModel) {
        this.riwayaModel.add(riwayaModel);
    }

    @Override
    public int compareTo(SheikhModel sheikhModel) {
        if (!this.title.equals(sheikhModel.getTitle()))
            return 1;
        return 0;
    }
}
