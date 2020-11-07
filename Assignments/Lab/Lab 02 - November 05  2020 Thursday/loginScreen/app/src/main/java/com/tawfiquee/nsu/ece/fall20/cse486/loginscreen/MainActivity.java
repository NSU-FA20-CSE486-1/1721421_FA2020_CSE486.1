package com.tawfiquee.nsu.ece.fall20.cse486.loginscreen;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Objects;

public class MainActivity extends AppCompatActivity {
    EditText username,password;
    Button login;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        username=findViewById(R.id.username);
        password=findViewById(R.id.password);
        login=findViewById(R.id.login);
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.KITKAT) {
                    if(Objects.equals(username.getText().toString(), "Tawfique")&&Objects.equals(password.getText().toString(),"Yellow"))
                    {
                        Toast.makeText(MainActivity.this,"Success",Toast.LENGTH_LONG).show();

                    }else
                    {
                        Toast.makeText(MainActivity.this,"Failed",Toast.LENGTH_LONG).show();
                    }
                }

            }
        });

    }
 }