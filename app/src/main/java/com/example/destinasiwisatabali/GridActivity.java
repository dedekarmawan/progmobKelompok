package com.example.destinasiwisatabali;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

public class GridActivity extends RecyclerView.Adapter<GridActivity.GridViewHolder> {

    private static final String TAG = "ListView";
    private ArrayList<Kabupaten> listKabupaten;

    private Context context;

    public GridActivity(Context context) {
        this.context = context;
    }

    public ArrayList<Kabupaten> getListKabupaten() {
        return listKabupaten;
    }

    public void setListKabupaten(ArrayList<Kabupaten> listKabupaten) {
        this.listKabupaten = listKabupaten;
    }

    @NonNull
    @Override
    public GridViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.layout_grid, parent, false);
        return new GridViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull GridViewHolder holder, final int position) {
        Glide.with(context)
                .asBitmap()
                .load(getListKabupaten().get(position).getPhoto())
                .into(holder.imgPhoto);
        holder.imgPhoto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = null;
                if(position==0){
                    intent = new Intent(context,MainActivity.class);
                }else if(position==1) {
                    intent = new Intent(context,Main2Activity.class);
                }else if(position==2) {
                    intent = new Intent(context,Tabanan.class);
                }else if(position==3) {
                    intent = new Intent(context,Denpasar.class);
                } else if(position==4) {
                intent = new Intent(context,Jembrana.class);
            }else if(position==5) {
                    intent = new Intent(context,Gianyar.class);
                } else if(position==6) {
                    intent = new Intent(context,Bangli.class);
                } else if(position==7) {
                    intent = new Intent(context,Buleleng.class);
                }else if(position==8) {
                    intent = new Intent(context,Klungkung.class);
                }
                context.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return getListKabupaten().size();
    }

    @Override
    public int getItemViewType(int position){
        return position;
    }

    class GridViewHolder extends RecyclerView.ViewHolder {
        ImageView imgPhoto;
        GridViewHolder(View itemView) {
            super(itemView);
            imgPhoto = itemView.findViewById(R.id.img_item_photo);
            context = itemView.getContext();
        }
    }
}
