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
import com.triginandri.qelato.models.Baverages;
import com.triginandri.qelato.models.IceCream;

import java.util.List;

public class BaveragesAdapter extends RecyclerView.Adapter<BaveragesAdapter.MyViewHolder> {

    public BaveragesAdapter(List<Baverages> baveragesList) {
        this.baveragesList = baveragesList;
    }

    List<Baverages> baveragesList;

    @NonNull
    @Override
    public BaveragesAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        Context context = parent.getContext();
        LayoutInflater layoutInflater = LayoutInflater.from(context);
        View iceCreamView = layoutInflater.inflate(R.layout.menu_item2,null);
        MyViewHolder viewHolder = new MyViewHolder(iceCreamView);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull BaveragesAdapter.MyViewHolder holder, int position) {
        Baverages baverages = baveragesList.get(position);

        holder.tv_name.setText(baverages.getName());
        holder.tv_price.setText("Rp. "+baverages.getPrice());
        holder.iv_menu.setImageResource(baverages.getImage());
        holder.cv_menu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(view.getContext(), DetailActivity.class);
                i.putExtra("name", baverages.getName());
                i.putExtra("price", baverages.getPrice());
                i.putExtra("image", baverages.getImage());
                i.putExtra("desc", baverages.getDescription());
                view.getContext().startActivity(i);
            }
        });
    }

    @Override
    public int getItemCount() {
        return baveragesList.size();
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
