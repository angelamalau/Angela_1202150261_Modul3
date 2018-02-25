package com.example.android.angela_1202150261_modul3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class detailActivity extends AppCompatActivity {
    private int counts = 1;
    private Button plus, minus;
    private TextView value;
    private ImageView battery;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        //mengambil intent yang didapat dari RecyclerAdapter
        Intent intent = getIntent();

        //mengambil data sesuai dengan kebutuhan layout
        String title = intent.getStringExtra("title");
        String ringkasan = intent.getStringExtra("ringkasan");
        int gambar = intent.getIntExtra("gambar", 0);

        TextView textTitle = findViewById(R.id.title);
        TextView textRingkasan = findViewById(R.id.ringkasan);
        ImageView imageGambar = findViewById(R.id.imageview);

        //menampilkan data yang sudah diambil
        textTitle.setText(title);
        textRingkasan.setText(ringkasan);
        imageGambar.setImageResource(gambar);

        plus = findViewById(R.id.plus);
        minus = findViewById(R.id.minus);
        value = findViewById(R.id.txt);
        battery = findViewById(R.id.battery);

        //menampilkan gambar pada battery
        battery.setImageResource(R.drawable.ic_battery_20_black_24dp);
        value.setText(Integer.toString(counts) + "L");

    }

    //case jika klik tombol (+)
    public void plus(View view) {
        counts++;
        if (value != null) {
            switch (counts) {
                case 1:
                    //kondisi jika battery low
                    battery.setImageResource(R.drawable.ic_battery_20_black_24dp);
                    value.setText(Integer.toString(counts) + "L");
                    Toast.makeText(this, "Battery Low", Toast.LENGTH_LONG).show();
                    break;
                case 2:
                    battery.setImageResource(R.drawable.ic_battery_30_black_24dp);
                    value.setText(Integer.toString(counts) + "L");
                    break;
                case 3:
                    battery.setImageResource(R.drawable.ic_battery_50_black_24dp);
                    value.setText(Integer.toString(counts) + "L");
                    break;
                case 4:
                    battery.setImageResource(R.drawable.ic_battery_60_black_24dp);
                    value.setText(Integer.toString(counts) + "L");
                    break;
                case 5:
                    battery.setImageResource(R.drawable.ic_battery_90_black_24dp);
                    value.setText(Integer.toString(counts) + "L");
                    break;
                case 6:
                    //kondisi jika battery full
                    battery.setImageResource(R.drawable.ic_battery_full_black_24dp);
                    value.setText(Integer.toString(counts) + "L");
                    Toast.makeText(this, "Battery Full", Toast.LENGTH_LONG).show();
                    break;
            }
        }
    }

    //case jika klik tombol (-)
    public void minus(View view) {
        counts--;
        if (value != null) {
            switch (counts) {
                case 6:
                    //kondisi jika battery full
                    battery.setImageResource(R.drawable.ic_battery_full_black_24dp);
                    value.setText(Integer.toString(counts) + "L");
                    Toast.makeText(this, "Battery Full", Toast.LENGTH_LONG).show();
                    break;
                case 5:
                    battery.setImageResource(R.drawable.ic_battery_90_black_24dp);
                    value.setText(Integer.toString(counts) + "L");
                    break;
                case 4:
                    battery.setImageResource(R.drawable.ic_battery_60_black_24dp);
                    value.setText(Integer.toString(counts) + "L");
                    break;
                case 3:
                    battery.setImageResource(R.drawable.ic_battery_50_black_24dp);
                    value.setText(Integer.toString(counts) + "L");
                    break;
                case 2:
                    battery.setImageResource(R.drawable.ic_battery_30_black_24dp);
                    value.setText(Integer.toString(counts) + "L");
                    break;
                case 1:
                    //kondisi jika battery low
                    battery.setImageResource(R.drawable.ic_battery_20_black_24dp);
                    value.setText(Integer.toString(counts) + "L");
                    Toast.makeText(this, "Battery Low", Toast.LENGTH_LONG).show();
                    break;
            }
        }
    }
}
