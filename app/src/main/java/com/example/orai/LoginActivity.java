package com.example.orai;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // Kai langas bus sukurtas koki vaizda jam uzkrausim
        setContentView(R.layout.activity_login);

        EditText username = findViewById(R.id.username_field);
        EditText password = findViewById(R.id.password_field);
        Button login = findViewById(R.id.login);

        // Mygtuko paspaudimas
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Klaidu zurnalo isvalymas
                username.setError(null);
                password.setError(null);

                // Aprasomas kodas kaip bus paspaudziamas mygtukas
                if (Validation.isUsernameValid(username.getText().toString()) &&
                        (Validation.isPasswordValid(password.getText().toString()))) {
                    // Jeigu duomenys teisingi pereiti is prisijungimo lango i pagrindini
                    // Sukuriamas ketinimas pereiti is prisijungimo lango i "Main" langa
                    Intent goToMainActivity = new Intent(LoginActivity.this, MainActivity.class);
                    // Startuojama nauja veikla ( Butina perduoti auksciau susikurta ketinima )
                    startActivity (goToMainActivity);
                } else {
                    // Toast.makeText(getApplicationContext(), R.string.ErrorMessageUserField, Toast.LENGTH_LONG).show();
                    password.setError(getResources().getString(R.string.ErrorMessagePasswordField));
                    password.requestFocus();

                    username.setError(getResources().getString(R.string.ErrorMessageUsernameField));
                    username.requestFocus();
                }

            }
        });
    }
}