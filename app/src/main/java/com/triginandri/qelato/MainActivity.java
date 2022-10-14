package com.triginandri.qelato;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity implements BottomNavigationView.OnNavigationItemSelectedListener {

    BottomNavigationView bnView;
    IceCreamFragment iceCreamFragment = new IceCreamFragment();
    FoodFragment foodFragment = new FoodFragment();
    BaverageFragment baverageFragment = new BaverageFragment();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bnView = findViewById(R.id.bn_main);
        bnView.setOnNavigationItemSelectedListener(this);
        bnView.setSelectedItemId(R.id.ice_cream);

    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {

        switch (item.getItemId()){
            case R.id.ice_cream:
                getSupportFragmentManager().beginTransaction().replace(R.id.rl_main,iceCreamFragment).commit();
                return true;

            case R.id.food:
                getSupportFragmentManager().beginTransaction().replace(R.id.rl_main,foodFragment).commit();
                return true;

            case R.id.baverages:
                getSupportFragmentManager().beginTransaction().replace(R.id.rl_main,baverageFragment).commit();
                return true;
        }
        return false;
    }
}