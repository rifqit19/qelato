package com.triginandri.qelato;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.triginandri.qelato.adapters.BaveragesAdapter;
import com.triginandri.qelato.adapters.MakananAdapter;
import com.triginandri.qelato.models.Baverages;
import com.triginandri.qelato.models.Makanan;

import java.util.ArrayList;
import java.util.List;

public class BaverageFragment extends Fragment {

    RecyclerView rv_menu;
    List<Baverages> baveragesList = new ArrayList<>();

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_baverage, container, false);

        rv_menu = view.findViewById(R.id.rv_baverages);

        baveragesList.clear();
        baveragesList.add(new Baverages("Latte Espresso",24000,"Latte Espresso Milk Iced coffee Ice cream",R.drawable.bav1));
        baveragesList.add(new Baverages("Iced coffee Luwak",18000,"white teacup with saucer, Iced coffee Kopi Luwak Cafe Tea",R.drawable.bav2));
        baveragesList.add(new Baverages("Cappuccino Espresso",22000,"Coffee cup Cappuccino Espresso Ipoh white coffee,",R.drawable.bav3));

        rv_menu.setHasFixedSize(true);
        BaveragesAdapter adapter = new BaveragesAdapter(baveragesList);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(view.getContext(), LinearLayoutManager.VERTICAL, false);
        rv_menu.setLayoutManager(linearLayoutManager);
//        rv_menu.setNestedScrollingEnabled(false);
        rv_menu.setMotionEventSplittingEnabled(false);
        rv_menu.setAdapter(adapter);

        return  view;
    }
}