package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity<arrayadapter> extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void loginUser (View view) {
        EditText emailInput = findViewById(R.id.email_input);
        EditText passInput = findViewById(R.id.password_input);

        if (emailInput.getText().toString().equals("mustafakhaled") &&
                passInput.getText().toString().equals("14699")){
            Toast.makeText(this, "Login successful", Toast.LENGTH_LONG).show();

            Intent intent = new Intent(this, Main2Activity.class);
            startActivity(intent);
            // to switch to another main
        }
        else {
            Toast.makeText(this, "Login failed", Toast.LENGTH_LONG).show();
        }
    }
}
