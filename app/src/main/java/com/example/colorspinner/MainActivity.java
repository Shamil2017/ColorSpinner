package com.example.colorspinner;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {
    private Spinner spinnerColors;
    private TextView txtDescription;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        spinnerColors = findViewById(R.id.spinnerColors);
        txtDescription = findViewById(R.id.txtDescription);

    }

    private String getDescriptionByPosition(int position) {
        String[] descriptions = getResources().getStringArray(R.array.description_of_temp);
        return descriptions[position];
    }


    public void onClick(View view) {
         int position = spinnerColors.getSelectedItemPosition();
        String description = getDescriptionByPosition(position);
        txtDescription.setText(description);
        Toast.makeText(this, String.valueOf(position), Toast.LENGTH_SHORT).show();

    }

}