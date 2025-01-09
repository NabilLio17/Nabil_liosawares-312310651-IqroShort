package com.example.IqroShort;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class bengkel extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.bengkel);
    }
    public void back8(View view) {
        // Membuka MainActivity
        Intent intent = new Intent(bengkel.this, MainActivity.class);
        startActivity(intent);
        finish(); // Opsional: Untuk menutup Activity sekarang dan mencegah pengguna kembali ke Activity ini
    }
}
