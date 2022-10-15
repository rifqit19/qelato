package com.triginandri.qelato;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.triginandri.qelato.adapters.IceCreamAdapter;
import com.triginandri.qelato.adapters.MakananAdapter;
import com.triginandri.qelato.models.Baverages;
import com.triginandri.qelato.models.IceCream;
import com.triginandri.qelato.models.Makanan;

import java.util.ArrayList;
import java.util.List;


public class FoodFragment extends Fragment {

    RecyclerView rv_menu;
    List<Makanan> makananList = new ArrayList<>();

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_food, container, false);

        rv_menu = view.findViewById(R.id.rv_food);

        makananList.clear();
        makananList.add(new Makanan("Meatball Pasta",32000,"Pasta Italian cuisine Bolognese sauce Meatball Fra diavolo sauce",R.drawable.food1));
        makananList.add(new Makanan("Bolognese Lasagne",29000,"Lasagne Pasta Bolognese sauce Spaghetti Recipe, Pasta italian",R.drawable.food2));
        makananList.add(new Makanan("Burritos",24000,"two burritos, Wrap Shawarma Burrito Pizza Doner kebab,",R.drawable.food3));
        makananList.add(new Makanan("Hamburger Slider",36000,"Hamburger Slider Steers French fries Pizza",R.drawable.food4));

        rv_menu.setHasFixedSize(true);
        MakananAdapter adapter = new MakananAdapter(makananList);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(view.getContext(), LinearLayoutManager.VERTICAL, false);
        rv_menu.setLayoutManager(linearLayoutManager);
//        rv_menu.setNestedScrollingEnabled(false);
        rv_menu.setMotionEventSplittingEnabled(false);
        rv_menu.setAdapter(adapter);

        return view;
    }
}