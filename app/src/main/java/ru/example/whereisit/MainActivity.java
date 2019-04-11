package ru.example.whereisit;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import ru.example.whereisit.ui.powerfailure.ShortTermPowerFailureActivity;
import ru.example.whereisit.ui.ventilation.VentilationsActivity;

public class MainActivity extends AppCompatActivity {
    Button ventBtn;
    Button shortTermPowerFailureBtn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // Вытяжная вентиляция
        ventBtn = findViewById(R.id.ventBtn);
        ventBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), VentilationsActivity.class);
                startActivity(intent);
            }
        });
        //Кратковременный сбой электроэнергии
        shortTermPowerFailureBtn = findViewById(R.id.shortTermPowerFailureBtn);
        shortTermPowerFailureBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), ShortTermPowerFailureActivity.class);
                startActivity(intent);
            }
        });
    }

}
