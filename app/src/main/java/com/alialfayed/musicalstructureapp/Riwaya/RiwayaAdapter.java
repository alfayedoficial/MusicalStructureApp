package com.alialfayed.musicalstructureapp.Riwaya;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;


import com.alialfayed.musicalstructureapp.R;

import java.util.ArrayList;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

/**
 * Created by ( Eng Ali Al Fayed)
 * Class do :
 * Date 5/8/2020 - 12:12 AM
 */
public class RiwayaAdapter extends RecyclerView.Adapter<RiwayaAdapter.RiwayaViewHolder> {

    private final OnItemClickListener listener;

    RiwayaAdapter(OnItemClickListener listener, ArrayList<RiwayaModel> list) {
        this.listener = listener;
        this.list = list;
    }

    private ArrayList<RiwayaModel> list;

    @NonNull
    @Override
    public RiwayaViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_riwaya_card, parent, false);
        return new RiwayaViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RiwayaViewHolder holder, int position) {
        final RiwayaModel riwayaModel = list.get(position);
        // set Riwaya info
        holder.txtName_RiwayaCard.setText(riwayaModel.getTitle());
        holder.txtNameSheikh_RiwayaCard.setText(riwayaModel.getSheikhModel().getTitle());
        holder.txtyear_RiwayaCard.setText(String.valueOf(riwayaModel.getYear()));
        holder.img_RiwayaCard.setImageResource(riwayaModel.getImg());

        // set Riwaya listener
        holder.riwayaCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                listener.onItemClick(riwayaModel);
            }
        });
    }

    @Override
    public int getItemCount() {
        return Math.max(list.size(), 0);
    }

    static class RiwayaViewHolder extends RecyclerView.ViewHolder{

        private ImageView img_RiwayaCard;
        private TextView txtName_RiwayaCard;
        private TextView txtNameSheikh_RiwayaCard;
        private TextView txtyear_RiwayaCard;
        private CardView riwayaCard;

        RiwayaViewHolder(@NonNull View itemView) {
            super(itemView);

            img_RiwayaCard = itemView.findViewById(R.id.img_RiwayaCard);
            txtName_RiwayaCard = itemView.findViewById(R.id.txtName_RiwayaCard);
            txtNameSheikh_RiwayaCard = itemView.findViewById(R.id.txtNameSheikh_RiwayaCard);
            txtyear_RiwayaCard = itemView.findViewById(R.id.txtyear_RiwayaCard);
            riwayaCard = itemView.findViewById(R.id.riwayaCard);

        }
    }
}
