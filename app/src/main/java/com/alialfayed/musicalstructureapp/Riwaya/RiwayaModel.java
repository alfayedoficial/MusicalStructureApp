package com.alialfayed.musicalstructureapp.Riwaya;

import com.alialfayed.musicalstructureapp.QuranPlayer.Quran;
import com.alialfayed.musicalstructureapp.SheikhActivity.SheikhModel;

import java.io.Serializable;
import java.util.ArrayList;

/**
 * Created by ( Eng Ali Al Fayed)
 * Class do :
 * Date 5/7/2020 - 10:05 PM
 */
public class RiwayaModel implements Serializable, Comparable<RiwayaModel> {

    private String title;
    private int year;
    private SheikhModel sheikhModel;
    private ArrayList<Quran> quran;
    private int img;

    public RiwayaModel(String title, int year, SheikhModel sheikhModel, int img) {
        this.title = title;
        this.year = year;
        this.sheikhModel = sheikhModel;
        this.quran = new ArrayList<>();
        this.img = img;

        sheikhModel.setRiwaya(this);
    }

    public String getTitle() {
        return title;
    }

    int getYear() {
        return year;
    }

    public SheikhModel getSheikhModel() {
        return sheikhModel;
    }

    public ArrayList<Quran> getQuran() {
        return quran;
    }

    public int getImg() {
        return img;
    }

    public void setQuran(Quran quran) {
        if (!this.quran.contains(quran))
            this.quran.add(quran);
    }

    @Override
    public int compareTo(RiwayaModel riwayaModel) {
        if (!this.title.equals(riwayaModel.getTitle()))
            return 1;
        if (this.year != riwayaModel.getYear())
            return 1;
        return this.sheikhModel.compareTo(riwayaModel.getSheikhModel());
    }
}
