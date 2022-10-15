package com.triginandri.qelato;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class DetailMenuActivity extends AppCompatActivity {

    androidx.appcompat.widget.Toolbar tb_detail;
    ImageView iv_detail;
    TextView tvName,tvDesc,tvPrice;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_menu);
        tb_detail = (Toolbar) findViewById(R.id.tb_detail);
        setupToolbar();

        iv_detail = findViewById(R.id.iv_detail);
        tvName = findViewById(R.id.tv_name);
        tvDesc = findViewById(R.id.tv_desc);
        tvPrice = findViewById(R.id.tv_price);


        String name = getIntent().getStringExtra("name");
        int price = getIntent().getIntExtra("price",0);
        String desc = getIntent().getStringExtra("desc");

        iv_detail.setImageResource(getIntent().getIntExtra("image",R.drawable.place_holder));
        tvName.setText(name);
        tvDesc.setText(desc);
        tvPrice.setText("Rp. " + price);

//        Toast.makeText(this, "Pesan: " + name + " " + desc + " " + price , Toast.LENGTH_SHORT).show();

    }

    public void setupToolbar(){
        setSupportActionBar(tb_detail);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        tb_detail.setNavigationIcon(R.drawable.ic_back_white);
        tb_detail.setTitleTextColor(getResources().getColor(R.color.white));
        getSupportActionBar().setTitle("Detail Makanan");
        tb_detail.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onBackPressed();
            }
        });
    }
}