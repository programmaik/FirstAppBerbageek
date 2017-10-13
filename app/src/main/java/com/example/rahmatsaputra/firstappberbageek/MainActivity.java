package com.example.rahmatsaputra.firstappberbageek;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    ImageView imageView1,imageView2;
    Button btnPesan,btnPesan2,pesan,btnBatal1,btnBatal2;
    TextView tvHarga,tvHarga2,tvMenu1,tvMenu2;
    int harga1 = 0,harga2=0, total=0;
    public static final String TOTAL = "TOTAL";
    public static final String MENU1 = "MENU1";
    public static final String MENU2 = "MENU2";
    public static final String HARGA1 = "HARGA1";
    public static final String HARGA2 = "HARGA2";
    String totalHarga, menu1,menu2,sHarga1,sHarga2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageView1 = (ImageView) findViewById(R.id.image1);
        imageView1 = (ImageView) findViewById(R.id.image2);
        btnPesan = (Button) findViewById(R.id.btnPesan);
        btnPesan2 = (Button) findViewById(R.id.btnPesan2);
        tvHarga = (TextView) findViewById(R.id.harga1);
        tvHarga2 = (TextView) findViewById(R.id.harga2);
        pesan = (Button) findViewById(R.id.pesan);
        tvMenu1 = (TextView) findViewById(R.id.tvmenu1);
        tvMenu2 = (TextView) findViewById(R.id.tvmenu2);
        btnBatal1 = (Button) findViewById(R.id.btnBatal);
        btnBatal2 = (Button) findViewById(R.id.btnBatal2);

        tvHarga.setText("");
        tvHarga2.setText("");
        tvMenu1.setText("");
        tvMenu2.setText("");


        btnPesan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                harga1 = 10000;
                tvMenu1.setText("Ayam Goreng");
                tvHarga.setText(Integer.toString(harga1));

            }
        });

        btnBatal1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvHarga.setText("");
                tvMenu1.setText("");
            }
        });
        btnPesan2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                harga2 = 15000;
                tvMenu2.setText("Ikan Goreng");
                tvHarga2.setText(Integer.toString(harga2));
            }
        });

        btnBatal2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvHarga2.setText("");
                tvMenu2.setText("");
            }
        });

        pesan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                total = harga1 + harga2;
                totalHarga = Integer.toString(total);
                menu1 = tvMenu1.getText().toString();
                menu2 = tvMenu2.getText().toString();
                sHarga1 = tvHarga.getText().toString();
                sHarga2 = tvHarga2.getText().toString();
                Intent intent = new Intent(MainActivity.this,PesananActivity.class);
                intent.putExtra(TOTAL,totalHarga);
                intent.putExtra(MENU1,menu1);
                intent.putExtra(MENU2,menu2);
                intent.putExtra(HARGA1,sHarga1);
                intent.putExtra(HARGA2,sHarga2);
                startActivity(intent);

            }
        });
    }
}
