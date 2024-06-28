package com.example.quiz;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MenuActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu_activity);

        Button startButton= findViewById(R.id.startButton);

    }

    public void Iniciar (View view){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

};
