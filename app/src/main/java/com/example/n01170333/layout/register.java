package com.example.n01170333.layout;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class register extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        configureNextButton();
        configureNextButton2();
    }

    private void configureNextButton2() {
        Button nextbutton = (Button) findViewById(R.id.button5);
        nextbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(register.this, nav.class));
            }
        });
    }


    private void configureNextButton() {

        Button nextbutton = (Button) findViewById(R.id.button6);
        nextbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(register.this, login.class));
            }
        });

    }
}
