package com.alialfayed.musicalstructureapp.QuranPlayer;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import com.alialfayed.musicalstructureapp.R;

import androidx.appcompat.app.AppCompatActivity;
import butterknife.BindView;
import butterknife.ButterKnife;

public class PlayerActivity extends AppCompatActivity {

    @BindView(R.id.imgPlayer)
    ImageView imgPlayer;
    @BindView(R.id.item_quran_title)
    TextView itemQuranTitle;
    @BindView(R.id.item_quran_riwaya)
    TextView itemQuranRiwaya;
    @BindView(R.id.item_quran_sheikh)
    TextView itemQuranSheikh;
    @BindView(R.id.play)
    ImageButton play;
    @BindView(R.id.pause)
    ImageButton pause;

    private MediaPlayer mp;
    private static String nameQuran ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_player);
        ButterKnife.bind(this);

        Intent intent = getIntent();
        Quran quran = (Quran) intent.getSerializableExtra(getString(R.string.playlist));
        if (quran != null) {
            imgPlayer.setImageResource(quran.getRiwayaModel().getImg());
            itemQuranTitle.setText(quran.getTitle());
            itemQuranRiwaya.setText(quran.getRiwayaModel().getTitle());
            itemQuranSheikh.setText(quran.getRiwayaModel().getSheikhModel().getTitle());
            mp = MediaPlayer.create(this, quran.getSound());

            nameQuran = quran.getTitle();
            setTitle(getString(R.string.playing) +nameQuran);

            play.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    mp.start();
                    setTitle(getString(R.string.playing) + nameQuran);
                }
            });

            pause.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    mp.pause();
                    setTitle(getString(R.string.pause) + nameQuran);
                }
            });

        }


    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        mp.stop();
    }
}
