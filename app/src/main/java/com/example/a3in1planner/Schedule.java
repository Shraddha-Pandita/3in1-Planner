package com.example.a3in1planner;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Schedule extends AppCompatActivity {
    private Button button5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_schedule);

        button5 = (Button) findViewById(R.id.button5);
        button5.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {
                opentodo();

            }
        });

    }

    public void opentodo()
    {
        Intent intent = new Intent(this, Todo.class);
        startActivity(intent);
    }
}