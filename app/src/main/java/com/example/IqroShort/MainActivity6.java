package com.example.IqroShort;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity6 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main6);
    }

    public void back6(View view) {
        // Membuka MainActivity
        Intent intent = new Intent(MainActivity6.this, MainActivity.class);
        startActivity(intent);
        finish(); // Opsional: Untuk menutup Activity sekarang dan mencegah pengguna kembali ke Activity ini
    }
}