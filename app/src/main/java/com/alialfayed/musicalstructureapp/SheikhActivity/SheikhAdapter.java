package com.alialfayed.musicalstructureapp.SheikhActivity;

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
 * Date 5/7/2020 - 10:27 PM
 */
public class SheikhAdapter extends RecyclerView.Adapter<SheikhAdapter.SheikhViewHolder> {

    private final OnItemClickListener listener;
    private ArrayList<SheikhModel> list;

    SheikhAdapter(OnItemClickListener listener, ArrayList<SheikhModel> list) {
        this.listener = listener;
        this.list = list;
    }

    @NonNull
    @Override
    public SheikhViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_sheikh_card, parent, false);
        return new SheikhViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull SheikhViewHolder holder, int position) {
        final SheikhModel sheikhModel = list.get(position);

        // set sheikh info
        holder.txtName_SheikhCard.setText(sheikhModel.getTitle());
        holder.img_SheikhCard.setImageResource(sheikhModel.getImg());

        // set sheikh listener
        holder.sheikhCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                listener.onItemClick(sheikhModel);
            }
        });
    }

    @Override
    public int getItemCount() {
        return Math.max(list.size(), 0);
    }

    static class SheikhViewHolder extends RecyclerView.ViewHolder{
        private ImageView img_SheikhCard;
        private TextView txtName_SheikhCard;
        private CardView sheikhCard;
        SheikhViewHolder(@NonNull View itemView) {
            super(itemView);

            img_SheikhCard = itemView.findViewById(R.id.img_SheikhCard);
            txtName_SheikhCard = itemView.findViewById(R.id.txtName_SheikhCard);
            sheikhCard = itemView.findViewById(R.id.sheikhCard);
        }
    }
}
