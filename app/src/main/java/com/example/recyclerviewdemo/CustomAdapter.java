package com.example.recyclerviewdemo;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class CustomAdapter extends RecyclerView.Adapter<CustomAdapter.MyViewHolder>{

    List<Model> my_list;
    Context context;

    public CustomAdapter(List<Model> my_list, Context context) {
        this.my_list = my_list;
        this.context = context;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.custom_list_item,parent,false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(CustomAdapter.MyViewHolder holder, int position) {
        Model model = my_list.get(position);
        holder.namawisata.setText(model.getNamawisata());
        holder.alamatwisata.setText(model.getAlamatwisata());
        holder.nohpwisata.setText(model.getNohpwisata());
        holder.image.setImageDrawable(context.getResources().getDrawable(model.getImage()));
    }

    @Override
    public int getItemCount() {
        return my_list.size();
    }

    class MyViewHolder extends RecyclerView.ViewHolder{

        ImageView image;
        TextView namawisata, alamatwisata, nohpwisata;

        public MyViewHolder(View itemView) {
            super(itemView);

            image=itemView.findViewById(R.id.image);
            namawisata=itemView.findViewById(R.id.nama_wisata);
            alamatwisata=itemView.findViewById(R.id.alamat_wisata);
            nohpwisata=itemView.findViewById(R.id.nohp_wisata);

        }
    }
}
