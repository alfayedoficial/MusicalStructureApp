package com.alialfayed.musicalstructureapp.QuranPlayer;

import com.alialfayed.musicalstructureapp.Riwaya.RiwayaModel;

import java.io.Serializable;

/**
 * Created by ( Eng Ali Al Fayed)
 * Class do :
 * Date 5/7/2020 - 10:52 PM
 */
public class Quran implements Serializable, Comparable<Quran> {
    private String title;
    private RiwayaModel riwayaModel;
    private int sound;

    public Quran(String title, RiwayaModel riwayaModel,int sound) {
        this.title = title;
        this.riwayaModel = riwayaModel;
        this.sound = sound;

        riwayaModel.setQuran(this);
    }

    public String getTitle() {
        return title;
    }

    int getSound() {
        return sound;
    }

    RiwayaModel getRiwayaModel() {
        return riwayaModel;
    }

    @Override
    public int compareTo(Quran quran) {
        if (!this.title.equals(quran.title))
            return 1;
        return this.riwayaModel.compareTo(quran.getRiwayaModel());
    }
}
