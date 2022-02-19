package com.example.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.Gravity;
import android.widget.Toast;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_second);
        getSupportActionBar().hide();

        Toast toast = Toast.makeText(this, "Second_Create", Toast.LENGTH_SHORT);
        toast.setGravity(Gravity.CENTER, 0,0);
//        toast.setDuration();
        toast.show();

    }
// we can write these methods any where , na matter that you write in same format ; super.onStart is a inbuilt method , from where i override that;
    @Override
    protected void onStart(){
        super.onStart();
        Toast toast = Toast.makeText(this, "Second_Start", Toast.LENGTH_SHORT);
        toast.setGravity(Gravity.CENTER, 0,0);
        toast.show();
    }
    @Override
    protected void onResume(){
        super.onResume();
        Toast toast = Toast.makeText(this, "Second_Resume", Toast.LENGTH_SHORT);
        toast.setGravity(Gravity.CENTER, 0,0);
        toast.show();
    }
    @Override
    protected void onPause(){
        super.onPause();
        Toast toast = Toast.makeText(this, "Second_Pause", Toast.LENGTH_SHORT);
        toast.setGravity(Gravity.CENTER, 0,0);
        toast.show();
    }
    @Override
    protected void onStop(){
        super.onStop();
        Toast toast = Toast.makeText(this, "Second_Stop", Toast.LENGTH_SHORT);
        toast.setGravity(Gravity.CENTER, 0,0);
        toast.show();
    }

    @Override
    protected void onDestroy(){
        super.onDestroy();
        Toast toast = Toast.makeText(this, "Second_Destroy", Toast.LENGTH_SHORT);
        toast.setGravity(Gravity.CENTER, 0,0);
        toast.show();
    }
    @Override
    protected void onRestart(){
        super.onRestart();
        Toast toast = Toast.makeText(this, "Second_Restart", Toast.LENGTH_SHORT);
        toast.setGravity(Gravity.CENTER, 0,0);
        toast.show();
    }

}