package com.alialfayed.musicalstructureapp.QuranPlayer;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

import com.alialfayed.musicalstructureapp.R;
import com.alialfayed.musicalstructureapp.Riwaya.RiwayaActivity;
import com.alialfayed.musicalstructureapp.SheikhActivity.HomeActivity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import butterknife.ButterKnife;

public class PlayListQuranActivity extends AppCompatActivity implements OnItemClickListener {

    @BindView(R.id.recyclerViewPlaylist)
    RecyclerView recyclerViewPlaylist;
    private PlayListModel playListModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_play_list_quran);
        ButterKnife.bind(this);

        Intent intent = getIntent();
        playListModel = (PlayListModel) intent.getSerializableExtra(getString(R.string.playlist));

        if (playListModel != null){

            PlayListQuranAdapter adapter = new PlayListQuranAdapter(this, playListModel);
            recyclerViewPlaylist.setAdapter(adapter);
            LinearLayoutManager layoutManager = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);
            recyclerViewPlaylist.setLayoutManager(layoutManager);
        }
    }

    @Override
    public void onItemClick(Quran quran) {
        Intent intent = new Intent(PlayListQuranActivity.this,PlayerActivity.class);
        intent.putExtra(getString(R.string.playlist), quran);
        startActivity(intent);
    }

    @Override
    public boolean onPrepareOptionsMenu(Menu menu) {
        menu.findItem(R.id.menu_sheikhs).setVisible(true);
        menu.findItem(R.id.menu_riwayas).setVisible(true);
        return true;
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == R.id.menu_sheikhs) {
            Intent newIntent = new Intent(PlayListQuranActivity.this, HomeActivity.class);
            startActivity(newIntent);
        }
        else if (item.getItemId() == R.id.menu_riwayas){
            Intent intent = new Intent(PlayListQuranActivity.this, RiwayaActivity.class);
            intent.putExtra(getString(R.string.sheikhs),playListModel.getQurans().get(0).getRiwayaModel().getSheikhModel());
            startActivity(intent);
        }
        return true;
    }
}
