package com.example.s25q2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    DatePicker dp1;
    Button b1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        dp1 = (DatePicker) findViewById(R.id.datepicker);
        b1 = (Button) findViewById(R.id.button);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String res = getCurrentDate();

                Toast.makeText(MainActivity.this, res, Toast.LENGTH_LONG).show();

            }
        });
    }

        public String getCurrentDate(){

            StringBuilder sb=new StringBuilder();

            sb.append((dp1.getMonth()+1)+"/");
            sb.append(dp1.getDayOfMonth()+"/");
            sb.append(dp1.getYear());

            return sb.toString();
    }
}