package com.example.IqroShort;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
    }

    public void back1(View view) {
        // Membuka MainActivity
        Intent intent = new Intent(MainActivity2.this, MainActivity.class);
        startActivity(intent);
        finish(); // Opsional: Untuk menutup Activity sekarang dan mencegah pengguna kembali ke Activity ini
    }
}