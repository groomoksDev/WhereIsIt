package ru.example.whereisit;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import ru.example.whereisit.ventilation.VentilationsActivity;

public class MainActivity extends AppCompatActivity {
    Button ventBtn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ventBtn = findViewById(R.id.ventBtn);
        ventBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), VentilationsActivity.class);
                startActivity(intent);
            }
        });
    }

}
