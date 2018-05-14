package com.example.android.loginflowchallenge;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Register extends AppCompatActivity {


    EditText mtextName, mtextSurname, mtextEmail, mtextPassword;
    Button mSignup;

    public String getName, getSurname, getMail, getPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        getSupportActionBar().hide();
        mtextName = (EditText) findViewById(R.id.editText2);
        //mtextSurname = (EditText) findViewById(R.id.editText3);
        mtextEmail = (EditText) findViewById(R.id.editText3);
        mtextPassword = (EditText) findViewById(R.id.editText4);

        mSignup = (Button) findViewById(R.id.button);


        mSignup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                getName = mtextName.getText().toString();
                //getSurname = mtextSurname.getText().toString();
                getMail = mtextEmail.getText().toString();
                getPassword = mtextPassword.getText().toString();

                if (getName.isEmpty() != true && getMail.isEmpty() != true && getPassword.isEmpty() != true) {

                    Toast.makeText(Register.this, getMail + ", You have registered successfully !!", Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(Register.this, MainActivity.class);
                    startActivity(intent);
                } else {
                    Toast.makeText(Register.this, "Please enter valid details !!", Toast.LENGTH_SHORT).show();
                }

            }
        });


    }
}
