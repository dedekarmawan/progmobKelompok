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
import com.bumptech.glide.request.RequestOptions;

import java.util.ArrayList;

public class ListReligiAdapter extends RecyclerView.Adapter<ListReligiAdapter.CategoryViewHolder> {
    private Context context;
    private ArrayList<Religi> listReligi;

    public ListReligiAdapter(Context context) {
        this.context = context;
    }

    public ArrayList<Religi> getListReligi() {
        return listReligi;
    }

    public void setListReligi(ArrayList<Religi> listReligi) {
        this.listReligi = listReligi;
    }

    @NonNull
    @Override
    public ListReligiAdapter.CategoryViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View itemRow = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_list_religi, viewGroup, false);
        return new CategoryViewHolder(itemRow);
    }

    @Override
    public void onBindViewHolder(@NonNull ListReligiAdapter.CategoryViewHolder categoryViewHolder, int position) {
        categoryViewHolder.tvName.setText(getListReligi().get(position).getName());
        categoryViewHolder.tvRemarks.setText(getListReligi().get(position).getRemarks());
        Glide.with(context)
                .asBitmap()
                .load(getListReligi().get(position).getPhoto())
                .into(categoryViewHolder.imgPhoto);
    }

    @Override
    public int getItemCount() {
        return getListReligi().size();
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
