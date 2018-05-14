package com.example.android.loginflowchallenge;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class ForgotPassword extends AppCompatActivity {

    EditText mretrieveMail;
    Button mretrieveButton;

    String rmail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forgot_password);
        getSupportActionBar().hide();

        mretrieveMail = (EditText) findViewById(R.id.retrieveMail);
        mretrieveButton = (Button) findViewById(R.id.retrieveButton);

        mretrieveButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                rmail = mretrieveMail.getText().toString();
                if (rmail.isEmpty() != true) {
                    Toast.makeText(ForgotPassword.this, "Your password has been reset successfully !! ", Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(ForgotPassword.this, MainActivity.class);
                    startActivity(intent);
                } else {
                    Toast.makeText(ForgotPassword.this, "Please enter valid Email ID !!", Toast.LENGTH_SHORT).show();
                }

            }
        });

    }
}
