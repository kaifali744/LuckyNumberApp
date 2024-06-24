package com.example.luckynumberapp;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.Random;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_second);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        TextView luckyTitle = findViewById(R.id.luckyTitle);
        TextView luckyNum = findViewById(R.id.luckyNum);
        Button shareBtn = findViewById(R.id.shareBtn);
        int randomNo = randomGenerator();
        luckyNum.setText(""+randomNo);
        Intent i = getIntent();
        String name = i.getStringExtra("username");
    }
    public static int randomGenerator(){
        Random random = new Random();
        int rand = random.nextInt(10);
        return rand;
    }

}