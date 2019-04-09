package ru.example.whereisit.ventilation;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.method.ScrollingMovementMethod;
import android.widget.TextView;

import ru.example.whereisit.Classifier.SysNameClassifier;
import ru.example.whereisit.R;

import static ru.example.whereisit.Classifier.SysNameClassifier.*;

public class TextViewActivity extends AppCompatActivity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.vent_frst_flow_texview_layout);

        Intent intent = getIntent();
        Integer position = intent.getIntExtra("0", 0);
        SysNameClassifier sysNameClassifier = getSysNameClassifier(position);
        if (sysNameClassifier != null) {
            TextView textViewSysName = findViewById(R.id.textViewSysName);
            TextView textViewPlace = findViewById(R.id.textViewPalce);
            TextView textViewRooms = findViewById(R.id.textViewRooms);
            TextView textViewUpDownSys = findViewById(R.id.textViewUpDownSys);
            textViewPlace.setMovementMethod(new ScrollingMovementMethod());
            textViewRooms.setMovementMethod(new ScrollingMovementMethod());
            textViewUpDownSys.setMovementMethod(new ScrollingMovementMethod());
            switch (sysNameClassifier) {
                case B1:
                    textViewSysName.setText((getResources().getStringArray(R.array.systemName)[B1.getValue()]));
                    textViewPlace.setText((getResources().getStringArray(R.array.placeInstall)[B1.getValue()]));
                    textViewRooms.setText((getResources().getStringArray(R.array.b1Rooms)[B1.getValue()]));
                    textViewUpDownSys.setText((getResources().getStringArray(R.array.b1PlaceOnOffSystem)[B1.getValue()]));
                    return;
                case B2:
                    textViewSysName.setText((getResources().getStringArray(R.array.systemName)[B2.getValue()]));
                    textViewPlace.setText((getResources().getStringArray(R.array.placeInstall)[B2.getValue()]));
                    textViewRooms.setText((getResources().getStringArray(R.array.b1Rooms)[B2.getValue()]));
                    textViewUpDownSys.setText((getResources().getStringArray(R.array.b1PlaceOnOffSystem)[B2.getValue()]));
                    return;
                case B3:
                    textViewSysName.setText((getResources().getStringArray(R.array.systemName)[B3.getValue()]));
                    textViewPlace.setText((getResources().getStringArray(R.array.placeInstall)[B3.getValue()]));
                    textViewRooms.setText((getResources().getStringArray(R.array.b1Rooms)[B3.getValue()]));
                    textViewUpDownSys.setText((getResources().getStringArray(R.array.b1PlaceOnOffSystem)[B3.getValue()]));
                    return;
                case B4:
                    textViewSysName.setText((getResources().getStringArray(R.array.systemName)[B4.getValue()]));
                    textViewPlace.setText((getResources().getStringArray(R.array.placeInstall)[B4.getValue()]));
                    textViewRooms.setText((getResources().getStringArray(R.array.b1Rooms)[B4.getValue()]));
                    textViewUpDownSys.setText((getResources().getStringArray(R.array.b1PlaceOnOffSystem)[B4.getValue()]));
                    return;
                case B5:
                    textViewSysName.setText((getResources().getStringArray(R.array.systemName)[B5.getValue()]));
                    textViewPlace.setText((getResources().getStringArray(R.array.placeInstall)[B5.getValue()]));
                    textViewRooms.setText((getResources().getStringArray(R.array.b1Rooms)[5]));
                    textViewUpDownSys.setText((getResources().getStringArray(R.array.b1PlaceOnOffSystem)[5]));
                    return;
                case B6:
                    textViewSysName.setText((getResources().getStringArray(R.array.systemName)[B6.getValue()]));
                    textViewPlace.setText((getResources().getStringArray(R.array.placeInstall)[B6.getValue()]));
                    textViewRooms.setText((getResources().getStringArray(R.array.b1Rooms)[B6.getValue()]));
                    textViewUpDownSys.setText((getResources().getStringArray(R.array.b1PlaceOnOffSystem)[B6.getValue()]));
                    return;
                case B7:
                    textViewSysName.setText((getResources().getStringArray(R.array.systemName)[B7.getValue()]));
                    textViewPlace.setText((getResources().getStringArray(R.array.placeInstall)[B7.getValue()]));
                    textViewRooms.setText((getResources().getStringArray(R.array.b1Rooms)[B7.getValue()]));
                    textViewUpDownSys.setText((getResources().getStringArray(R.array.b1PlaceOnOffSystem)[B7.getValue()]));
                    return;
                case B8:
                    textViewSysName.setText((getResources().getStringArray(R.array.systemName)[B8.getValue()]));
                    textViewPlace.setText((getResources().getStringArray(R.array.placeInstall)[B8.getValue()]));
                    textViewRooms.setText((getResources().getStringArray(R.array.b1Rooms)[B8.getValue()]));
                    textViewUpDownSys.setText((getResources().getStringArray(R.array.b1PlaceOnOffSystem)[B8.getValue()]));
                    return;
                case B9:
                    textViewSysName.setText((getResources().getStringArray(R.array.systemName)[B9.getValue()]));
                    textViewPlace.setText((getResources().getStringArray(R.array.placeInstall)[B9.getValue()]));
                    textViewRooms.setText((getResources().getStringArray(R.array.b1Rooms)[B9.getValue()]));
                    textViewUpDownSys.setText((getResources().getStringArray(R.array.b1PlaceOnOffSystem)[B9.getValue()]));
                    return;
                case B10:
                    textViewSysName.setText((getResources().getStringArray(R.array.systemName)[B10.getValue()]));
                    textViewPlace.setText((getResources().getStringArray(R.array.placeInstall)[B10.getValue()]));
                    textViewRooms.setText((getResources().getStringArray(R.array.b1Rooms)[B10.getValue()]));
                    textViewUpDownSys.setText((getResources().getStringArray(R.array.b1PlaceOnOffSystem)[B10.getValue()]));
                    return;
                case B11:
                    textViewSysName.setText((getResources().getStringArray(R.array.systemName)[B11.getValue()]));
                    textViewPlace.setText((getResources().getStringArray(R.array.placeInstall)[B11.getValue()]));
                    textViewRooms.setText((getResources().getStringArray(R.array.b1Rooms)[B11.getValue()]));
                    textViewUpDownSys.setText((getResources().getStringArray(R.array.b1PlaceOnOffSystem)[B11.getValue()]));
                    return;
                case B12:
                    textViewSysName.setText((getResources().getStringArray(R.array.systemName)[B12.getValue()]));
                    textViewPlace.setText((getResources().getStringArray(R.array.placeInstall)[B12.getValue()]));
                    textViewRooms.setText((getResources().getStringArray(R.array.b1Rooms)[B12.getValue()]));
                    textViewUpDownSys.setText((getResources().getStringArray(R.array.b1PlaceOnOffSystem)[B12.getValue()]));
                    return;
                default:
                    textViewRooms.setText("Если отображается этот текст, значит где то упущение в приложении." +
                            " В данный момент нужно вернутся назад и выбрать значение из выпадающего списка");
            }
        }
    }


}
