package com.example.f_to_c_to_f;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    //Declaring widgets
    EditText celsiusInput;
    EditText fahInput;
    TextView fahOutput;
    TextView celOutput;
    Button convertToFah;
    Button convertToCel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        celsiusInput = findViewById(R.id.celsiusInput);
        fahInput = findViewById(R.id.fahInput);
        fahOutput = findViewById(R.id.fahOutput);
        celOutput = findViewById(R.id.celOutput);
        convertToFah = findViewById(R.id.convertToFah);
        convertToCel = findViewById(R.id.convertToCel);

        //for the celsius to fahrenheit converter on button click
        convertToFah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Code for the button goes here
                String celIn = celsiusInput.getText().toString();
                Double celsiusTemp = Double.parseDouble(celIn);
                Double toFah = ((9/5) * celsiusTemp) + 32;
                fahOutput.setText(toFah.toString());
            }
        });

        //for the fahrenheit to celsius converter on button click
        convertToCel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Code for the button goes here
                String fahIn = fahInput.getText().toString();
                Double fahTemp = Double.parseDouble(fahIn);
                Double toCelsius = (5/9)*(fahTemp - 32);
                celOutput.setText(toCelsius.toString());
            }
        });

    }
}