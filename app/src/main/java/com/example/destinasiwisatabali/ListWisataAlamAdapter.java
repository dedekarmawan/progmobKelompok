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

public class ListWisataAlamAdapter extends RecyclerView.Adapter<ListWisataAlamAdapter.CategoryViewHolder> {
    private Context context;
    private ArrayList<WisataAlam> listWisataAlam;

    public ListWisataAlamAdapter(Context context) {
        this.context = context;
    }

    public ArrayList<WisataAlam> getListWisataAlam() {
        return listWisataAlam;
    }

    public void setListWisataAlam(ArrayList<WisataAlam> listWisataAlam) {
        this.listWisataAlam = listWisataAlam;
    }

    @NonNull
    @Override
    public ListWisataAlamAdapter.CategoryViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View itemRow = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_list_wisata_alam, viewGroup, false);
        return new ListWisataAlamAdapter.CategoryViewHolder(itemRow);
    }

    @Override
    public void onBindViewHolder(@NonNull ListWisataAlamAdapter.CategoryViewHolder categoryViewHolder, int position) {
        categoryViewHolder.tvName.setText(getListWisataAlam().get(position).getName());
        categoryViewHolder.tvRemarks.setText(getListWisataAlam().get(position).getRemarks());
        Glide.with(context)
                .asBitmap()
                .load(getListWisataAlam().get(position).getPhoto())
                .into(categoryViewHolder.imgPhoto);
    }

    @Override
    public int getItemCount() {
        return getListWisataAlam().size();
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
