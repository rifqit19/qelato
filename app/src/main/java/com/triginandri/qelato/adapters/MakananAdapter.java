package com.triginandri.qelato.adapters;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.triginandri.qelato.DetailActivity;
import com.triginandri.qelato.R;
import com.triginandri.qelato.models.IceCream;
import com.triginandri.qelato.models.Makanan;

import java.util.List;

public class MakananAdapter extends RecyclerView.Adapter<MakananAdapter.MyViewHolder> {

    public MakananAdapter(List<Makanan> makananList) {
        this.makananList = makananList;
    }

    List<Makanan> makananList;

    @NonNull
    @Override
    public MakananAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        Context context = parent.getContext();
        LayoutInflater layoutInflater = LayoutInflater.from(context);
        View iceCreamView = layoutInflater.inflate(R.layout.menu_item2,null);
        MyViewHolder viewHolder = new MyViewHolder(iceCreamView);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull MakananAdapter.MyViewHolder holder, int position) {
        Makanan makanan = makananList.get(position);

        holder.tv_name.setText(makanan.getNama());
        holder.tv_price.setText("Rp. " + makanan.getHarga());
        holder.iv_menu.setImageResource(makanan.getGambar());
        holder.cv_menu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(view.getContext(), DetailActivity.class);
                i.putExtra("name", makanan.getNama());
                i.putExtra("price", makanan.getHarga());
                i.putExtra("image", makanan.getGambar());
                i.putExtra("desc", makanan.getDeskripsi());
                view.getContext().startActivity(i);
            }
        });
    }

    @Override
    public int getItemCount() {
        return makananList.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {

        public final TextView tv_name;
        public final ImageView iv_menu;
        public final TextView tv_price;
        public final CardView cv_menu;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            tv_name = itemView.findViewById(R.id.tv_name);
            tv_price = itemView.findViewById(R.id.tv_price);
            iv_menu = itemView.findViewById(R.id.iv_menu);
            cv_menu = itemView.findViewById(R.id.cv_menu);

        }
    }
}
