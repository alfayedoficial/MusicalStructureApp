package com.alialfayed.musicalstructureapp.Riwaya;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import com.alialfayed.musicalstructureapp.QuranPlayer.Parent;
import com.alialfayed.musicalstructureapp.QuranPlayer.PlayListModel;
import com.alialfayed.musicalstructureapp.QuranPlayer.PlayListQuranActivity;
import com.alialfayed.musicalstructureapp.R;
import com.alialfayed.musicalstructureapp.SheikhActivity.HomeActivity;
import com.alialfayed.musicalstructureapp.SheikhActivity.SheikhModel;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import butterknife.ButterKnife;

public class RiwayaActivity extends AppCompatActivity implements OnItemClickListener {

    private SheikhModel sheikhModel;
    @BindView(R.id.recyclerView_Riwaya)
    RecyclerView recyclerViewRiwaya;
    @BindView(R.id.btn_PlayAll_RiwayaActivity)
    Button btnPlayAllRiwayaActivity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_riwaya);
        ButterKnife.bind(this);

        Intent intent = getIntent();
        sheikhModel = (SheikhModel) intent.getSerializableExtra(getString(R.string.sheikhs));
        if (sheikhModel != null) {
            RiwayaAdapter adapter = new RiwayaAdapter(this, sheikhModel.getRiwayaModel());
            recyclerViewRiwaya.setAdapter(adapter);
            Context context;
            GridLayoutManager manager = new GridLayoutManager(getApplicationContext(), 2);
            recyclerViewRiwaya.setLayoutManager(manager);

            btnPlayAllRiwayaActivity.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    PlayListModel playlist = getQuransList();
                    Intent intent = new Intent(RiwayaActivity.this, PlayListQuranActivity.class);
                    intent.putExtra(getString(R.string.playlist), playlist);
                    startActivity(intent);
                }
            });
        }

    }

    @Override
    public boolean onPrepareOptionsMenu(Menu menu) {
        menu.findItem(R.id.menu_sheikhs).setVisible(true);
        menu.findItem(R.id.menu_riwayas).setVisible(false);

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
            Intent newIntent = new Intent(RiwayaActivity.this, HomeActivity.class);
            startActivity(newIntent);
        }
        return true;
    }

    @Override
    public void onItemClick(RiwayaModel item) {
        // start RiwayaActivity
        PlayListModel playlist = new PlayListModel(Parent.RIWAYA);
        playlist.setQurans(item.getQuran());
        Intent intent = new Intent(RiwayaActivity.this, PlayListQuranActivity.class);
        intent.putExtra(getString(R.string.playlist), playlist);
        startActivity(intent);

    }

    private PlayListModel getQuransList() {
        PlayListModel playlist = new PlayListModel(Parent.SHEIKH);
        for (RiwayaModel a : sheikhModel.getRiwayaModel())
            playlist.setQurans(a.getQuran());

        return playlist;
    }
}
