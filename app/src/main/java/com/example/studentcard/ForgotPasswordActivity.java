package com.example.studentcard;

import android.content.Intent;
import android.os.Bundle;
import android.util.Patterns;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.button.MaterialButton;
import com.google.android.material.textfield.TextInputEditText;

public class ForgotPasswordActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forgot_password);

        TextInputEditText etForgotEmail = findViewById(R.id.etForgotEmail);
        MaterialButton btnSendReset = findViewById(R.id.btnSendReset);
        TextView tvBackToLogin = findViewById(R.id.tvBackToLoginFromForgot);

        // Send reset link → navigate to Reset Password screen
        btnSendReset.setOnClickListener(v -> {
            String email = etForgotEmail.getText() != null ? etForgotEmail.getText().toString().trim() : "";

            if (email.isEmpty()) {
                Toast.makeText(this, "Please enter your Email or Student ID", Toast.LENGTH_SHORT).show();
                return;
            }

            if (!Patterns.EMAIL_ADDRESS.matcher(email).matches()) {
                Toast.makeText(this, "Please enter a valid email address", Toast.LENGTH_SHORT).show();
                return;
            }

            Toast.makeText(this, "Reset link sent to " + email, Toast.LENGTH_SHORT).show();

            // Navigate to Reset Password screen
            Intent intent = new Intent(ForgotPasswordActivity.this, ResetPasswordActivity.class);
            intent.putExtra("EMAIL", email);
            startActivity(intent);
        });

        // Back to Login
        tvBackToLogin.setOnClickListener(v -> finish());
    }
}
