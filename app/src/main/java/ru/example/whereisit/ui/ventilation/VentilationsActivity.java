package ru.example.whereisit.ui.ventilation;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import ru.example.whereisit.R;

public class VentilationsActivity extends AppCompatActivity {
    Button techFlowBtn;
    Button frstFlowBtn;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ventilations);

        techFlowBtn = findViewById(R.id.ventilationsTechFlowBtn);
        techFlowBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), VentilationTechFlowActivity.class);
                startActivity(intent);
            }
        });

        frstFlowBtn = findViewById(R.id.ventilationsFirstFlowBtn);
        frstFlowBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), VentilationFirstFlowActivity.class);
                startActivity(intent);
            }
        });
    }
}
