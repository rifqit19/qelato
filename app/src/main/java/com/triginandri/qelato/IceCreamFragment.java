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
import com.triginandri.qelato.models.IceCream;

import java.util.ArrayList;
import java.util.List;


public class IceCreamFragment extends Fragment {

    RecyclerView rv_menu;
    List<IceCream> iceCreamList = new ArrayList<>();

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_ice_cream, container, false);

        rv_menu = view.findViewById(R.id.rv_ice_cream);

        iceCreamList.clear();
        iceCreamList.add(new IceCream("Strawberry",20000,"asdas",R.drawable.ice_cream1));
        iceCreamList.add(new IceCream("Mini Many",21000,"asdas",R.drawable.ice_cream2));
        iceCreamList.add(new IceCream("Triple Nuvo",33000,"asdas",R.drawable.ice_cream3));
        iceCreamList.add(new IceCream("Vanila Honey",25000,"asdas",R.drawable.ice_cream4));
        iceCreamList.add(new IceCream("Specialberry",36000,"asdas",R.drawable.ice_cream5));
        iceCreamList.add(new IceCream("Squad Hunter ",41000,"asdas",R.drawable.ice_cream6));

        rv_menu.setHasFixedSize(true);
        IceCreamAdapter adapter = new IceCreamAdapter(iceCreamList);
        GridLayoutManager mGridLayoutManager = new GridLayoutManager(view.getContext(), 2, GridLayoutManager.VERTICAL, false);
        rv_menu.setLayoutManager(mGridLayoutManager);
        rv_menu.setNestedScrollingEnabled(false);
        rv_menu.setMotionEventSplittingEnabled(false);
        rv_menu.setAdapter(adapter);

        return view;
    }

}