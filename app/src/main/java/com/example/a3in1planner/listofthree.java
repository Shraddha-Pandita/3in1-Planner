package com.example.a3in1planner;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.easyfitness.MainActivity;
import com.easyfitness.intro.MainIntroActivity;

public class listofthree extends AppCompatActivity {


    private Button button2;
    private Button button3;
    private Button button4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listofthree);


        button2 = (Button) findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View v) {
                openschedule();
            }
        });






        button3 = (Button) findViewById(R.id.button3);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override

           public void onClick(View v) {
               openbmi();
          }
        });

        button4 = (Button) findViewById(R.id.button4);
        button4.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View v) {
                openfitness();
            }
        });
    }

    public void openschedule()
    {
        Intent intent = new Intent(this, Schedule.class);
        startActivity(intent);
    }
    public void openbmi()
    {
        Intent intent = new Intent(this, bmi.class);
        startActivity(intent);
    }

    public void openfitness()
    {
       Intent intent = new Intent(this, MainIntroActivity.class);
        startActivity(intent);
    }


}