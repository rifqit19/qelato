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

import java.util.List;

public class IceCreamAdapter extends RecyclerView.Adapter<IceCreamAdapter.MyViewHolder> {

    public IceCreamAdapter(List<IceCream> iceCreamList) {
        this.iceCreamList = iceCreamList;
    }

    List<IceCream> iceCreamList;

    @NonNull
    @Override
    public IceCreamAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        Context context = parent.getContext();
        LayoutInflater layoutInflater = LayoutInflater.from(context);
        View iceCreamView = layoutInflater.inflate(R.layout.menu_item,null);
        MyViewHolder viewHolder = new MyViewHolder(iceCreamView);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull IceCreamAdapter.MyViewHolder holder, int position) {
        IceCream iceCream = iceCreamList.get(position);

        holder.tv_name.setText(iceCream.getName());
        holder.tv_price.setText("Rp. "+iceCream.getPrice());
        holder.iv_menu.setImageResource(iceCream.getImage());
        holder.cv_menu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(view.getContext(), DetailActivity.class);
                i.putExtra("name", iceCream.getName());
                i.putExtra("price", iceCream.getPrice());
                i.putExtra("image", iceCream.getImage());
                i.putExtra("desc", iceCream.getDescription());
                view.getContext().startActivity(i);
            }
        });
    }

    @Override
    public int getItemCount() {
        return iceCreamList.size();
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
