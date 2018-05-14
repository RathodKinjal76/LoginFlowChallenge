package com.example.android.loginflowchallenge;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    TextView mtvlogin, mtvforgotPassword, mtvSignup;
    AutoCompleteTextView mtvEmail;
    EditText metpassword;
    Button mblogin;

    String getEmail, getPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportActionBar().hide();

        mtvlogin = (TextView) findViewById(R.id.textViewLoginDetails);
        mtvforgotPassword = (TextView) findViewById(R.id.textViewForgotPassword);
        mtvSignup = (TextView) findViewById(R.id.textViewSignUp);

        mtvEmail = (AutoCompleteTextView) findViewById(R.id.autoCompTextEmailId);

        metpassword = (EditText) findViewById(R.id.editTextPassword);

        mblogin = (Button) findViewById(R.id.buttonLogin);


        mblogin.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {

                if (mtvEmail.getText().toString().isEmpty() != true && metpassword.getText().toString().isEmpty() != true) {
                    Toast.makeText(MainActivity.this, "You are logged in successfully !!", Toast.LENGTH_SHORT).show();
                    Intent ilogin = new Intent(MainActivity.this, LoginSuccess.class);
                    startActivity(ilogin);

                } else {
                    Toast.makeText(MainActivity.this, "Please enter login details.", Toast.LENGTH_SHORT).show();
                }

            }


        });


        mtvforgotPassword.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent ilogin = new Intent(MainActivity.this, ForgotPassword.class);
                startActivity(ilogin);
            }
        });


        mtvSignup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent ilogin = new Intent(MainActivity.this, Register.class);
                startActivity(ilogin);
            }
        });


    }
}
