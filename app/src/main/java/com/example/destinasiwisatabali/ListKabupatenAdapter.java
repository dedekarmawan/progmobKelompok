package com.example.destinasiwisatabali;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

public class ListKabupatenAdapter extends RecyclerView.Adapter<ListKabupatenAdapter.CategoryViewHolder> {
    private Context context;
    private ArrayList<Wisata> listWisata;


    public ListKabupatenAdapter(Context context) {
        this.context = context;
    }

    public ArrayList<Wisata> getListWisata() {
        return listWisata;
    }

    public void setListWisata(ArrayList<Wisata> listWisata) {
        this.listWisata = listWisata;
    }

    @NonNull
    @Override
    public CategoryViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View itemRow = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_list_kabupaten, viewGroup, false);
        return new CategoryViewHolder(itemRow);
    }

    @Override
    public void onBindViewHolder(@NonNull CategoryViewHolder categoryViewHolder, final int position) {
        categoryViewHolder.tvName.setText(getListWisata().get(position).getNama());
        categoryViewHolder.tvRemarks.setText(getListWisata().get(position).getDeskripsi());
        Glide.with(context)
                .asBitmap()
                .load(getListWisata().get(position).getPhoto())
                .into(categoryViewHolder.imgPhoto);
        categoryViewHolder.imgPhoto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                Intent intent = new Intent(context, DetailActivity.class);
                intent.putExtra("image_url",getListWisata().get(position).getPhoto());
                intent.putExtra("image_name",getListWisata().get(position).getNama());
                intent.putExtra("image_desc",getListWisata().get(position).getDetail());
                intent.putExtra("image_address", getListWisata().get(position).getLokasi());
                context.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return getListWisata().size();
    }

    public class CategoryViewHolder extends RecyclerView.ViewHolder {
        TextView tvName;
        TextView tvRemarks;
        ImageView imgPhoto;
        ImageView gambar;

        public CategoryViewHolder(@NonNull View itemView) {
            super(itemView);

            tvName = itemView.findViewById(R.id.tv_item_name);
            tvRemarks = itemView.findViewById(R.id.tv_item_remarks);
            imgPhoto = itemView.findViewById(R.id.img_item_photo);
        }
    }
}
