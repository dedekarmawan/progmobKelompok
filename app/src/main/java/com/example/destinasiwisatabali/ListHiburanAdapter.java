package com.example.destinasiwisatabali;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

public class ListHiburanAdapter extends RecyclerView.Adapter<ListHiburanAdapter.CategoryViewHolder> {
    private Context context;
    private ArrayList<Hiburan> listHiburan;

    public ListHiburanAdapter(Context context) {
        this.context = context;
    }

    public ArrayList<Hiburan> getListHiburan() {
        return listHiburan;
    }

    public void setListHiburan(ArrayList<Hiburan> listHiburan) {
        this.listHiburan = listHiburan;
    }

    @NonNull
    @Override
    public ListHiburanAdapter.CategoryViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View itemRow = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_list_hiburan, viewGroup, false);
        return new CategoryViewHolder(itemRow);
    }

    @Override
    public void onBindViewHolder(@NonNull ListHiburanAdapter.CategoryViewHolder categoryViewHolder, int position) {
        categoryViewHolder.tvName.setText(getListHiburan().get(position).getName());
        categoryViewHolder.tvRemarks.setText(getListHiburan().get(position).getRemarks());
        Glide.with(context)
                .asBitmap()
                .load(getListHiburan().get(position).getPhoto())
                .into(categoryViewHolder.imgPhoto);
    }

    @Override
    public int getItemCount() {
        return getListHiburan().size();
    }

    public class CategoryViewHolder extends RecyclerView.ViewHolder {
        TextView tvName;
        TextView tvRemarks;
        ImageView imgPhoto;

        public CategoryViewHolder(@NonNull View itemView) {
            super(itemView);
            tvName = itemView.findViewById(R.id.tv_item_name);
            tvRemarks = itemView.findViewById(R.id.tv_item_remarks);
            imgPhoto = itemView.findViewById(R.id.img_item_photo);
        }
    }
}
