package com.example.rahmatsaputra.firstappberbageek;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.TextView;

public class PesananActivity extends AppCompatActivity {

    public static final String TOTAL = "TOTAL";
    public static final String MENU1 = "MENU1";
    public static final String MENU2 = "MENU2";
    public static final String HARGA1 = "HARGA1";
    public static final String HARGA2 = "HARGA2";
    String total="",menu1="",menu2="",harga1="",harga2="";
    TextView totalHarga,tvMenu1,tvMenu2,tvHarga1,tvHarga2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pesanan);

        totalHarga = (TextView) findViewById(R.id.total);
        tvMenu1 = (TextView) findViewById(R.id.menu1);
        tvMenu2 = (TextView) findViewById(R.id.menu2);
        tvHarga1 = (TextView) findViewById(R.id.harga1);
        tvHarga2 = (TextView) findViewById(R.id.harga2);

        if(getIntent() != null){
            total = getIntent().getStringExtra(TOTAL);
            menu1 = getIntent().getStringExtra(MENU1);
            menu2 = getIntent().getStringExtra(MENU2);
            harga1 = getIntent().getStringExtra(HARGA1);
            harga2 = getIntent().getStringExtra(HARGA2);


        }
        if(!TextUtils.isEmpty(total)){
            totalHarga.setText(total);
            tvMenu1.setText(menu1);
            tvMenu2.setText(menu2);
            tvHarga1.setText(harga1);
            tvHarga2.setText(harga2);

        }

    }
}
