package com.example.IqroShort;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Array of button IDs for easier initialization
        int[] buttonIds = {
                R.id.button1, R.id.button2, R.id.button3, R.id.button4, R.id.button5,
                R.id.button6,
        };

        for (int i = 0; i < buttonIds.length; i++) {
            final int index = i + 1; // 1 through 10
            Button button = findViewById(buttonIds[i]);
            button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent;

                    // Map each index to a specific activity
                    switch (index) {
                        case 1:
                            intent = new Intent(MainActivity.this, MainActivity2.class);
                            break;
                        case 2:
                            intent = new Intent(MainActivity.this, MainActivity4.class);
                            break;
                        case 3:
                            intent = new Intent(MainActivity.this, MainActivity3.class);
                            break;
                        case 4:
                            intent = new Intent(MainActivity.this, MainActivity6.class);
                            break;
                        case 5:
                            intent = new Intent(MainActivity.this, bapak.class);
                            break;
                        case 6:
                            intent = new Intent(MainActivity.this, bengkel.class);
                            break;
                        default:
                            throw new IllegalStateException("Unexpected value: " + index);
                    }

                    // Pass the index to the next activity if needed
                    intent.putExtra("IqroShort", index);
                    startActivity(intent);
                }
            });
        }
    }
}