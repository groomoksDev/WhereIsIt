package ru.example.whereisit;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Spinner;

import ru.example.whereisit.ventilation.TextViewActivity;

public class MainActivity extends AppCompatActivity {
    Spinner spinnerSys;
    Spinner spinnerPlaceInstall;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

/*
        spinnerSys = findViewById(R.id.spinnerSys);
        spinnerSys.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View itemSelected, int itemSelectedPosition, long id) {
                openActivity(itemSelected, itemSelectedPosition);
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        spinnerPlaceInstall = findViewById(R.id.spinnerPlaceInstall);
        spinnerPlaceInstall.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View itemSelected, int itemSelectedPosition, long id) {
                openActivity(itemSelected, itemSelectedPosition);
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });*/
    }

    void openActivity(View itemSelected, int itemSelectedPosition) {
        Bundle bundle = new Bundle();
        bundle.putInt("0", itemSelectedPosition);
        Intent intent = new Intent(itemSelected.getContext(), TextViewActivity.class);
        if (itemSelectedPosition != 0) {
            intent.putExtras(bundle);
            startActivityForResult(intent, 0);
            spinnerSys.setSelection(0);
            spinnerPlaceInstall.setSelection(0);
        }
    }
}
