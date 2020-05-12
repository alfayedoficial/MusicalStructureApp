package com.alialfayed.musicalstructureapp.QuranPlayer;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.alialfayed.musicalstructureapp.R;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

/**
 * Created by ( Eng Ali Al Fayed)
 * Class do :
 * Date 5/11/2020 - 4:42 PM
 */
public class PlayListQuranAdapter extends RecyclerView.Adapter<PlayListQuranAdapter.PlayListQuranViewHolder> {

    PlayListQuranAdapter(OnItemClickListener listener, PlayListModel playListModel) {
        this.listener = listener;
        this.playListModel = playListModel;
    }

    private final OnItemClickListener listener;
    private PlayListModel playListModel;

    @NonNull
    @Override
    public PlayListQuranViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_playlist, parent, false);
        return new PlayListQuranViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull PlayListQuranViewHolder holder, final int position) {
        final Quran quran = playListModel.getQurans().get(position);

        holder.img_quran.setImageResource(quran.getRiwayaModel().getImg());
        holder.item_title.setText(quran.getTitle());
        holder.item_riwaya.setText(quran.getRiwayaModel().getTitle());
        holder.item_sheikh.setText(quran.getRiwayaModel().getSheikhModel().getTitle());

        holder.item_quran.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                listener.onItemClick(quran);
            }
        });
    }

    @Override
    public int getItemCount() {
        return playListModel.getQurans().size();
    }

    static class PlayListQuranViewHolder extends RecyclerView.ViewHolder {

        private LinearLayout item_quran;
        private ImageView img_quran;
        private TextView item_title;
        private TextView item_riwaya;
        private TextView item_sheikh;

        PlayListQuranViewHolder(@NonNull View itemView) {
            super(itemView);
            item_quran = itemView.findViewById(R.id.item_quran);
            img_quran = itemView.findViewById(R.id.item_quran_img_riwaya);
            item_title = itemView.findViewById(R.id.item_quran_title);
            item_riwaya = itemView.findViewById(R.id.item_quran_riwaya);
            item_sheikh = itemView.findViewById(R.id.item_quran_sheikh);
        }
    }
}
