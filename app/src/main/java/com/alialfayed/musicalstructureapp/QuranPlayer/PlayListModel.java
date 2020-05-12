package com.alialfayed.musicalstructureapp.QuranPlayer;

import java.io.Serializable;
import java.util.ArrayList;

/**
 * Created by ( Eng Ali Al Fayed)
 * Class do :
 * Date 5/10/2020 - 1:48 AM
 */
public class PlayListModel implements Serializable {
    private ArrayList<Quran> qurans;
    private Parent parent;

    public PlayListModel(Parent parent) {
        this.parent = parent;
        this.qurans = new ArrayList<>();
    }

    ArrayList<Quran> getQurans() {
        return qurans;
    }

    public void setQurans(ArrayList<Quran> quran) {
        this.qurans.addAll(quran);
    }

    public Parent getParent() {
        return parent;
    }
}
