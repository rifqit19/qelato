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
        iceCreamList.add(new IceCream("Strawberry Cone",20000,"Strawberry gelato with crunchy cone made with love by professional chef",R.drawable.ice_cream1));
        iceCreamList.add(new IceCream("Mini Many",21000,"Triple mini scope galato with crunchy cone made with love by professional chef Three mini galato balls with crunchy cones made with love by a professional chef make your little ones' day happy",R.drawable.ice_cream2));
        iceCreamList.add(new IceCream("Triple Nuvo",33000,"Crunchy cone with triple scope special best seller gelato in qelato made with love by a professional chef",R.drawable.ice_cream3));
        iceCreamList.add(new IceCream("Vanila Honey",25000,"Special triple scope vanilla gelato with melted honey from african bee made with love by a professional chef",R.drawable.ice_cream4));
        iceCreamList.add(new IceCream("Specialberry",36000,"Special strawberry gelato with many toping in a crunchy bowl made with love by a professional chef",R.drawable.ice_cream5));
        iceCreamList.add(new IceCream("Squad Hunter",44000,"Crunchy cone with four scope special best seller gelato in qelato made with love by a professional chef",R.drawable.ice_cream6));
        iceCreamList.add(new IceCream("Tuty Fruity",41000,"Triple scope fruity gelato with mix fruit made with love by a professional chef",R.drawable.ice_cream7));
        iceCreamList.add(new IceCream("Cotton Candy",30000,"Sweet cotton candy turns into a delicious bowl of gelato made with love by a professional chef",R.drawable.ice_cream8));
        iceCreamList.add(new IceCream("Chocolate Gelato",20000,"Chocolate gelato with crunchy cone made with love by professional chef",R.drawable.ice_cream9));

        rv_menu.setHasFixedSize(true);
        IceCreamAdapter adapter = new IceCreamAdapter(iceCreamList);
        GridLayoutManager mGridLayoutManager = new GridLayoutManager(view.getContext(), 2, GridLayoutManager.VERTICAL, false);
        rv_menu.setLayoutManager(mGridLayoutManager);
//        rv_menu.setNestedScrollingEnabled(false);
        rv_menu.setMotionEventSplittingEnabled(false);
        rv_menu.setAdapter(adapter);

        return view;
    }

}