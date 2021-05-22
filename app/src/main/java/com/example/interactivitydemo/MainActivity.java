package com.example.interactivitydemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

import static android.view.View.INVISIBLE;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void login(View view) {
        EditText username = (EditText) findViewById(R.id.personNameEditText);
        EditText password = (EditText) findViewById(R.id.passwordEditText);
        Log.i("Info", "Button pressed ");
        Log.i("Values", username.getText().toString());
        Log.i("Values", password.getText().toString());
        Toast.makeText(this, "You have been successfully logged in", Toast.LENGTH_LONG).show();

        //swap images
        ImageView imageView1 = findViewById(R.id.imageView1);
        ImageView imageView2 = findViewById(R.id.imageView2);

        if (imageView1.getVisibility() == View.VISIBLE) {
//            imageView1.setVisibility(View.INVISIBLE);
//            imageView2.setVisibility(View.VISIBLE);
            imageView1.setImageResource(R.drawable.image2);
        } else {
//            imageView1.setVisibility(View.VISIBLE);
//            imageView2.setVisibility(INVISIBLE);
            imageView1.setImageResource(R.drawable.image1);
        }



    }
}