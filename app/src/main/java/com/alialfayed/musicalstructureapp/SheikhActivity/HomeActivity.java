package com.alialfayed.musicalstructureapp.SheikhActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.alialfayed.musicalstructureapp.QuranPlayer.Parent;
import com.alialfayed.musicalstructureapp.QuranPlayer.PlayListModel;
import com.alialfayed.musicalstructureapp.QuranPlayer.PlayListQuranActivity;
import com.alialfayed.musicalstructureapp.QuranPlayer.Quran;
import com.alialfayed.musicalstructureapp.R;
import com.alialfayed.musicalstructureapp.Riwaya.RiwayaActivity;
import com.alialfayed.musicalstructureapp.Riwaya.RiwayaModel;

import java.util.ArrayList;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import butterknife.ButterKnife;

public class HomeActivity extends AppCompatActivity implements OnItemClickListener {

    @BindView(R.id.btn_PlayAll_SheikhActivity)
    Button btnPlayApp;
    @BindView(R.id.recyclerView_Sheikh)
    RecyclerView recyclerView_Sheikh;
    private ArrayList<SheikhModel> sheikhModels;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        ButterKnife.bind(this);

        setQuran();

        SheikhAdapter adapter = new SheikhAdapter(this, sheikhModels);
        recyclerView_Sheikh.setAdapter(adapter);
        GridLayoutManager manager = new GridLayoutManager(getApplicationContext(), 2);
        recyclerView_Sheikh.setLayoutManager(manager);

        btnPlayApp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                PlayListModel playListModel = getQuransList();

                // start PlaylistActivity
                Intent intent = new Intent(HomeActivity.this, PlayListQuranActivity.class);
                intent.putExtra(getString(R.string.playlist), playListModel);
                startActivity(intent);
            }
        });

    }

    private void setQuran() {
        sheikhModels = new ArrayList<>();
        addNewQuran("Abdul Rahman Al-Sudais", R.drawable.sheikh1, "Hafs narration from Asim", R.drawable.quran, 2019, "Al-Fatihah", R.raw.loqman);
        addNewQuran("Abdul Rahman Al-Sudais", R.drawable.sheikh1, "Hafs narration from Asim", R.drawable.quran, 2019, "Al-Baqarah", R.raw.loqman);
        addNewQuran("Abdul Rahman Al-Sudais", R.drawable.sheikh1, "Hafs narration from Asim", R.drawable.quran, 2019, "Ali 'Imran", R.raw.loqman);
        addNewQuran("Abdul Rahman Al-Sudais", R.drawable.sheikh1, "Hafs narration from Asim", R.drawable.quran, 2019, "An-Nisa", R.raw.loqman);
        addNewQuran("Abdul Rahman Al-Sudais", R.drawable.sheikh1, "Hafs narration from Asim", R.drawable.quran, 2019, "Al-Ma'idah", R.raw.loqman);
        addNewQuran("Abdul Rahman Al-Sudais", R.drawable.sheikh1, "Hafs narration from Asim", R.drawable.quran, 2019, "Al-An'am", R.raw.loqman);
        addNewQuran("Abdul Rahman Al-Sudais", R.drawable.sheikh1, "Hafs narration from Asim", R.drawable.quran, 2019, "Al-A'raf", R.raw.loqman);
        addNewQuran("Abdul Rahman Al-Sudais", R.drawable.sheikh1, "Hafs narration from Asim", R.drawable.quran, 2019, "Al-Anfal", R.raw.loqman);
        addNewQuran("Abdul Rahman Al-Sudais", R.drawable.sheikh1, "Hafs narration from Asim", R.drawable.quran, 2019, "At-Tawbah", R.raw.loqman);
        addNewQuran("Abdul Rahman Al-Sudais", R.drawable.sheikh1, "Hafs narration from Asim", R.drawable.quran, 2019, "Yunus", R.raw.loqman);
        addNewQuran("Abdul Rahman Al-Sudais", R.drawable.sheikh1, "Hafs narration from Asim", R.drawable.quran, 2019, "Hud", R.raw.loqman);
        addNewQuran("Abdul Rahman Al-Sudais", R.drawable.sheikh1, "Hafs narration from Asim", R.drawable.quran, 2019, "Yusuf", R.raw.loqman);
        addNewQuran("Abdul Rahman Al-Sudais", R.drawable.sheikh1, "Hafs narration from Asim", R.drawable.quran, 2019, "Ar-Ra'd", R.raw.loqman);
        addNewQuran("Abdul Rahman Al-Sudais", R.drawable.sheikh1, "Hafs narration from Asim", R.drawable.quran, 2019, "Ibrahim", R.raw.loqman);
        addNewQuran("Abdul Rahman Al-Sudais", R.drawable.sheikh1, "Hafs narration from Asim", R.drawable.quran, 2019, "Al-Hijr", R.raw.loqman);
        addNewQuran("Abdul Rahman Al-Sudais", R.drawable.sheikh1, "Hafs narration from Asim", R.drawable.quran, 2019, "An-Nahl", R.raw.loqman);

        addNewQuran("Abdul Rahman Al-Sudais", R.drawable.sheikh1, "Royce on Jacob Hadrami", R.drawable.quran, 2019, "Al-Fatihah", R.raw.loqman);
        addNewQuran("Abdul Rahman Al-Sudais", R.drawable.sheikh1, "Royce on Jacob Hadrami", R.drawable.quran, 2019, "Al-Baqarah", R.raw.loqman);
        addNewQuran("Abdul Rahman Al-Sudais", R.drawable.sheikh1, "Royce on Jacob Hadrami", R.drawable.quran, 2019, "Ali 'Imran", R.raw.loqman);
        addNewQuran("Abdul Rahman Al-Sudais", R.drawable.sheikh1, "Royce on Jacob Hadrami", R.drawable.quran, 2019, "An-Nisa", R.raw.loqman);
        addNewQuran("Abdul Rahman Al-Sudais", R.drawable.sheikh1, "Royce on Jacob Hadrami", R.drawable.quran, 2019, "Al-Ma'idah", R.raw.loqman);
        addNewQuran("Abdul Rahman Al-Sudais", R.drawable.sheikh1, "Royce on Jacob Hadrami", R.drawable.quran, 2019, "Al-An'am", R.raw.loqman);
        addNewQuran("Abdul Rahman Al-Sudais", R.drawable.sheikh1, "Royce on Jacob Hadrami", R.drawable.quran, 2019, "Al-A'raf", R.raw.loqman);
        addNewQuran("Abdul Rahman Al-Sudais", R.drawable.sheikh1, "Royce on Jacob Hadrami", R.drawable.quran, 2019, "Al-Anfal", R.raw.loqman);
        addNewQuran("Abdul Rahman Al-Sudais", R.drawable.sheikh1, "Royce on Jacob Hadrami", R.drawable.quran, 2019, "At-Tawbah", R.raw.loqman);
        addNewQuran("Abdul Rahman Al-Sudais", R.drawable.sheikh1, "Royce on Jacob Hadrami", R.drawable.quran, 2019, "Yunus", R.raw.loqman);
        addNewQuran("Abdul Rahman Al-Sudais", R.drawable.sheikh1, "Royce on Jacob Hadrami", R.drawable.quran, 2019, "Hud", R.raw.loqman);
        addNewQuran("Abdul Rahman Al-Sudais", R.drawable.sheikh1, "Royce on Jacob Hadrami", R.drawable.quran, 2019, "Yusuf", R.raw.loqman);
        addNewQuran("Abdul Rahman Al-Sudais", R.drawable.sheikh1, "Royce on Jacob Hadrami", R.drawable.quran, 2019, "Ar-Ra'd", R.raw.loqman);
        addNewQuran("Abdul Rahman Al-Sudais", R.drawable.sheikh1, "Royce on Jacob Hadrami", R.drawable.quran, 2019, "Ibrahim", R.raw.loqman);
        addNewQuran("Abdul Rahman Al-Sudais", R.drawable.sheikh1, "Royce on Jacob Hadrami", R.drawable.quran, 2019, "Al-Hijr", R.raw.loqman);
        addNewQuran("Abdul Rahman Al-Sudais", R.drawable.sheikh1, "Royce on Jacob Hadrami", R.drawable.quran, 2019, "An-Nahl", R.raw.loqman);

        addNewQuran("El Sheikh Islam Sobhy", R.drawable.sheikh2, "Hafs narration from Asim", R.drawable.quran, 2019, "Al-Fatihah", R.raw.loqman);
        addNewQuran("El Sheikh Islam Sobhy", R.drawable.sheikh2, "Hafs narration from Asim", R.drawable.quran, 2019, "Al-Baqarah", R.raw.loqman);
        addNewQuran("El Sheikh Islam Sobhy", R.drawable.sheikh2, "Hafs narration from Asim", R.drawable.quran, 2019, "Ali 'Imran", R.raw.loqman);
        addNewQuran("El Sheikh Islam Sobhy", R.drawable.sheikh2, "Hafs narration from Asim", R.drawable.quran, 2019, "An-Nisa", R.raw.loqman);
        addNewQuran("El Sheikh Islam Sobhy", R.drawable.sheikh2, "Hafs narration from Asim", R.drawable.quran, 2019, "Al-Ma'idah", R.raw.loqman);
        addNewQuran("El Sheikh Islam Sobhy", R.drawable.sheikh2, "Hafs narration from Asim", R.drawable.quran, 2019, "Al-An'am", R.raw.loqman);
        addNewQuran("El Sheikh Islam Sobhy", R.drawable.sheikh2, "Hafs narration from Asim", R.drawable.quran, 2019, "Al-A'raf", R.raw.loqman);
        addNewQuran("El Sheikh Islam Sobhy", R.drawable.sheikh2, "Hafs narration from Asim", R.drawable.quran, 2019, "Al-Anfal", R.raw.loqman);
        addNewQuran("El Sheikh Islam Sobhy", R.drawable.sheikh2, "Hafs narration from Asim", R.drawable.quran, 2019, "At-Tawbah", R.raw.loqman);
        addNewQuran("El Sheikh Islam Sobhy", R.drawable.sheikh2, "Hafs narration from Asim", R.drawable.quran, 2019, "Yunus", R.raw.loqman);
        addNewQuran("El Sheikh Islam Sobhy", R.drawable.sheikh2, "Hafs narration from Asim", R.drawable.quran, 2019, "Hud", R.raw.loqman);
        addNewQuran("El Sheikh Islam Sobhy", R.drawable.sheikh2, "Hafs narration from Asim", R.drawable.quran, 2019, "Yusuf", R.raw.loqman);
        addNewQuran("El Sheikh Islam Sobhy", R.drawable.sheikh2, "Hafs narration from Asim", R.drawable.quran, 2019, "Ar-Ra'd", R.raw.loqman);
        addNewQuran("El Sheikh Islam Sobhy", R.drawable.sheikh2, "Hafs narration from Asim", R.drawable.quran, 2019, "Ibrahim", R.raw.loqman);
        addNewQuran("El Sheikh Islam Sobhy", R.drawable.sheikh2, "Hafs narration from Asim", R.drawable.quran, 2019, "Al-Hijr", R.raw.loqman);
        addNewQuran("El Sheikh Islam Sobhy", R.drawable.sheikh2, "Hafs narration from Asim", R.drawable.quran, 2019, "An-Nahl", R.raw.loqman);

        addNewQuran("El Sheikh Islam Sobhy", R.drawable.sheikh2, "Royce on Jacob Hadrami", R.drawable.quran, 2019, "Al-Fatihah", R.raw.loqman);
        addNewQuran("El Sheikh Islam Sobhy", R.drawable.sheikh2, "Royce on Jacob Hadrami", R.drawable.quran, 2019, "Al-Baqarah", R.raw.loqman);
        addNewQuran("El Sheikh Islam Sobhy", R.drawable.sheikh2, "Royce on Jacob Hadrami", R.drawable.quran, 2019, "Ali 'Imran", R.raw.loqman);
        addNewQuran("El Sheikh Islam Sobhy", R.drawable.sheikh2, "Royce on Jacob Hadrami", R.drawable.quran, 2019, "An-Nisa", R.raw.loqman);
        addNewQuran("El Sheikh Islam Sobhy", R.drawable.sheikh2, "Royce on Jacob Hadrami", R.drawable.quran, 2019, "Al-Ma'idah", R.raw.loqman);
        addNewQuran("El Sheikh Islam Sobhy", R.drawable.sheikh2, "Royce on Jacob Hadrami", R.drawable.quran, 2019, "Al-An'am", R.raw.loqman);
        addNewQuran("El Sheikh Islam Sobhy", R.drawable.sheikh2, "Royce on Jacob Hadrami", R.drawable.quran, 2019, "Al-A'raf", R.raw.loqman);
        addNewQuran("El Sheikh Islam Sobhy", R.drawable.sheikh2, "Royce on Jacob Hadrami", R.drawable.quran, 2019, "Al-Anfal", R.raw.loqman);
        addNewQuran("El Sheikh Islam Sobhy", R.drawable.sheikh2, "Royce on Jacob Hadrami", R.drawable.quran, 2019, "At-Tawbah", R.raw.loqman);
        addNewQuran("El Sheikh Islam Sobhy", R.drawable.sheikh2, "Royce on Jacob Hadrami", R.drawable.quran, 2019, "Yunus", R.raw.loqman);
        addNewQuran("El Sheikh Islam Sobhy", R.drawable.sheikh2, "Royce on Jacob Hadrami", R.drawable.quran, 2019, "Hud", R.raw.loqman);
        addNewQuran("El Sheikh Islam Sobhy", R.drawable.sheikh2, "Royce on Jacob Hadrami", R.drawable.quran, 2019, "Yusuf", R.raw.loqman);
        addNewQuran("El Sheikh Islam Sobhy", R.drawable.sheikh2, "Royce on Jacob Hadrami", R.drawable.quran, 2019, "Ar-Ra'd", R.raw.loqman);
        addNewQuran("El Sheikh Islam Sobhy", R.drawable.sheikh2, "Royce on Jacob Hadrami", R.drawable.quran, 2019, "Ibrahim", R.raw.loqman);
        addNewQuran("El Sheikh Islam Sobhy", R.drawable.sheikh2, "Royce on Jacob Hadrami", R.drawable.quran, 2019, "Al-Hijr", R.raw.loqman);
        addNewQuran("El Sheikh Islam Sobhy", R.drawable.sheikh2, "Royce on Jacob Hadrami", R.drawable.quran, 2019, "An-Nahl", R.raw.loqman);

        addNewQuran("Sheikh Abdul Basit Abdul Samad", R.drawable.sheikh3, "Hafs narration from Asim", R.drawable.quran, 2019, "Al-Fatihah", R.raw.loqman);
        addNewQuran("Sheikh Abdul Basit Abdul Samad", R.drawable.sheikh3, "Hafs narration from Asim", R.drawable.quran, 2019, "Al-Baqarah", R.raw.loqman);
        addNewQuran("Sheikh Abdul Basit Abdul Samad", R.drawable.sheikh3, "Hafs narration from Asim", R.drawable.quran, 2019, "Ali 'Imran", R.raw.loqman);
        addNewQuran("Sheikh Abdul Basit Abdul Samad", R.drawable.sheikh3, "Hafs narration from Asim", R.drawable.quran, 2019, "An-Nisa", R.raw.loqman);
        addNewQuran("Sheikh Abdul Basit Abdul Samad", R.drawable.sheikh3, "Hafs narration from Asim", R.drawable.quran, 2019, "Al-Ma'idah", R.raw.loqman);
        addNewQuran("Sheikh Abdul Basit Abdul Samad", R.drawable.sheikh3, "Hafs narration from Asim", R.drawable.quran, 2019, "Al-An'am", R.raw.loqman);
        addNewQuran("Sheikh Abdul Basit Abdul Samad", R.drawable.sheikh3, "Hafs narration from Asim", R.drawable.quran, 2019, "Al-A'raf", R.raw.loqman);
        addNewQuran("Sheikh Abdul Basit Abdul Samad", R.drawable.sheikh3, "Hafs narration from Asim", R.drawable.quran, 2019, "Al-Anfal", R.raw.loqman);
        addNewQuran("Sheikh Abdul Basit Abdul Samad", R.drawable.sheikh3, "Hafs narration from Asim", R.drawable.quran, 2019, "At-Tawbah", R.raw.loqman);
        addNewQuran("Sheikh Abdul Basit Abdul Samad", R.drawable.sheikh3, "Hafs narration from Asim", R.drawable.quran, 2019, "Yunus", R.raw.loqman);
        addNewQuran("Sheikh Abdul Basit Abdul Samad", R.drawable.sheikh3, "Hafs narration from Asim", R.drawable.quran, 2019, "Hud", R.raw.loqman);
        addNewQuran("Sheikh Abdul Basit Abdul Samad", R.drawable.sheikh3, "Hafs narration from Asim", R.drawable.quran, 2019, "Yusuf", R.raw.loqman);
        addNewQuran("Sheikh Abdul Basit Abdul Samad", R.drawable.sheikh3, "Hafs narration from Asim", R.drawable.quran, 2019, "Ar-Ra'd", R.raw.loqman);
        addNewQuran("Sheikh Abdul Basit Abdul Samad", R.drawable.sheikh3, "Hafs narration from Asim", R.drawable.quran, 2019, "Ibrahim", R.raw.loqman);
        addNewQuran("Sheikh Abdul Basit Abdul Samad", R.drawable.sheikh3, "Hafs narration from Asim", R.drawable.quran, 2019, "Al-Hijr", R.raw.loqman);
        addNewQuran("Sheikh Abdul Basit Abdul Samad", R.drawable.sheikh3, "Hafs narration from Asim", R.drawable.quran, 2019, "An-Nahl", R.raw.loqman);

        addNewQuran("Sheikh Abdul Basit Abdul Samad", R.drawable.sheikh3, "Royce on Jacob Hadrami", R.drawable.quran, 2019, "Al-Fatihah", R.raw.loqman);
        addNewQuran("Sheikh Abdul Basit Abdul Samad", R.drawable.sheikh3, "Royce on Jacob Hadrami", R.drawable.quran, 2019, "Al-Baqarah", R.raw.loqman);
        addNewQuran("Sheikh Abdul Basit Abdul Samad", R.drawable.sheikh3, "Royce on Jacob Hadrami", R.drawable.quran, 2019, "Ali 'Imran", R.raw.loqman);
        addNewQuran("Sheikh Abdul Basit Abdul Samad", R.drawable.sheikh3, "Royce on Jacob Hadrami", R.drawable.quran, 2019, "An-Nisa", R.raw.loqman);
        addNewQuran("Sheikh Abdul Basit Abdul Samad", R.drawable.sheikh3, "Royce on Jacob Hadrami", R.drawable.quran, 2019, "Al-Ma'idah", R.raw.loqman);
        addNewQuran("Sheikh Abdul Basit Abdul Samad", R.drawable.sheikh3, "Royce on Jacob Hadrami", R.drawable.quran, 2019, "Al-An'am", R.raw.loqman);
        addNewQuran("Sheikh Abdul Basit Abdul Samad", R.drawable.sheikh3, "Royce on Jacob Hadrami", R.drawable.quran, 2019, "Al-A'raf", R.raw.loqman);
        addNewQuran("Sheikh Abdul Basit Abdul Samad", R.drawable.sheikh3, "Royce on Jacob Hadrami", R.drawable.quran, 2019, "Al-Anfal", R.raw.loqman);
        addNewQuran("Sheikh Abdul Basit Abdul Samad", R.drawable.sheikh3, "Royce on Jacob Hadrami", R.drawable.quran, 2019, "At-Tawbah", R.raw.loqman);
        addNewQuran("Sheikh Abdul Basit Abdul Samad", R.drawable.sheikh3, "Royce on Jacob Hadrami", R.drawable.quran, 2019, "Yunus", R.raw.loqman);
        addNewQuran("Sheikh Abdul Basit Abdul Samad", R.drawable.sheikh3, "Royce on Jacob Hadrami", R.drawable.quran, 2019, "Hud", R.raw.loqman);
        addNewQuran("Sheikh Abdul Basit Abdul Samad", R.drawable.sheikh3, "Royce on Jacob Hadrami", R.drawable.quran, 2019, "Yusuf", R.raw.loqman);
        addNewQuran("Sheikh Abdul Basit Abdul Samad", R.drawable.sheikh3, "Royce on Jacob Hadrami", R.drawable.quran, 2019, "Ar-Ra'd", R.raw.loqman);
        addNewQuran("Sheikh Abdul Basit Abdul Samad", R.drawable.sheikh3, "Royce on Jacob Hadrami", R.drawable.quran, 2019, "Ibrahim", R.raw.loqman);
        addNewQuran("Sheikh Abdul Basit Abdul Samad", R.drawable.sheikh3, "Royce on Jacob Hadrami", R.drawable.quran, 2019, "Al-Hijr", R.raw.loqman);
        addNewQuran("Sheikh Abdul Basit Abdul Samad", R.drawable.sheikh3, "Royce on Jacob Hadrami", R.drawable.quran, 2019, "An-Nahl", R.raw.loqman);

    }

    private void addNewQuran(String sheikhName, int imgSheikh, String riwayaName, int imgRiwaya, int recordYear, String titleName, int sound) {
        SheikhModel sheikhModel = addSheikh(sheikhName, imgSheikh);
        RiwayaModel riwayaModel = addRiwaya(sheikhModel, riwayaName, imgRiwaya, recordYear);
        Quran quran = addQuran(riwayaModel, titleName, sound);
    }

    private SheikhModel addSheikh(String sheikhName, int imgSheikh) {
        for (SheikhModel sheikhModel : sheikhModels)
            if (sheikhModel.getTitle().equals(sheikhName))
                return sheikhModel;
        SheikhModel sheikhModel = new SheikhModel(sheikhName, imgSheikh);
        sheikhModels.add(sheikhModel);
        return sheikhModel;
    }

    private RiwayaModel addRiwaya(SheikhModel sheikhModel, String riwayaName, int imgRiwaya, int recordYear) {
        for (RiwayaModel riwayaModel : sheikhModel.getRiwayaModel())
            if (riwayaModel.getTitle().equals(riwayaName))
                return riwayaModel;
        return new RiwayaModel(riwayaName, recordYear, sheikhModel, imgRiwaya);
    }

    private Quran addQuran(RiwayaModel riwayaModel, String titleName, int sound) {
        for (Quran quran : riwayaModel.getQuran())
            if (quran.getTitle().equals(titleName))
                return quran;
        return new Quran(titleName, riwayaModel, sound);
    }

    @Override
    public void onItemClick(SheikhModel item) {
        // start RiwayaActivity
        Intent intent = new Intent(HomeActivity.this, RiwayaActivity.class);
        intent.putExtra(getString(R.string.sheikhs), item);
        startActivity(intent);
    }

    private PlayListModel getQuransList() {
        PlayListModel playlist = new PlayListModel(Parent.ALL);
        for (SheikhModel a : sheikhModels)
            for (RiwayaModel riwayaModel : a.getRiwayaModel())
                playlist.setQurans(riwayaModel.getQuran());
        return playlist;
    }
}
