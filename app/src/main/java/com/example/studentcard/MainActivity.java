package com.example.studentcard;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.button.MaterialButton;
import com.google.android.material.textfield.TextInputEditText;

public class MainActivity extends AppCompatActivity {

    private TextInputEditText etUsername, etPassword;
    private MaterialButton btnLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Initialize UI Elements
        etUsername = findViewById(R.id.etUsername);
        etPassword = findViewById(R.id.etPassword);
        btnLogin = findViewById(R.id.btnLogin);
        TextView forgot = findViewById(R.id.tvForgotPassword);
        TextView register = findViewById(R.id.tvRegister);

        // Navigate to Forgot Password screen
        forgot.setOnClickListener(v -> {
            startActivity(new Intent(MainActivity.this, ForgotPasswordActivity.class));
        });

        // Navigate to Register screen
        register.setOnClickListener(v -> {
            startActivity(new Intent(MainActivity.this, RegisterActivity.class));
        });

        // Login authentication action
        btnLogin.setOnClickListener(v -> {
            String username = etUsername.getText() != null ? etUsername.getText().toString().trim() : "";
            String password = etPassword.getText() != null ? etPassword.getText().toString().trim() : "";

            if (username.isEmpty() || password.isEmpty()) {
                Toast.makeText(MainActivity.this, "Please enter both Username and Password", Toast.LENGTH_SHORT).show();
                return;
            }

            // Verify credentials for Aleeya Fatima (accepts Aleeya Fatima or Aliya Fatima)
            if ((username.equalsIgnoreCase("Aleeya Fatima") || username.equalsIgnoreCase("Aliya Fatima"))
                    && (password.equals("aleeya27") || password.equals("aliya27"))) {
                Toast.makeText(MainActivity.this, "Login Successful! Welcome Aleeya Fatima", Toast.LENGTH_SHORT).show();

                // Navigate to Dashboard (Main Screen) after successful login
                Intent intent = new Intent(MainActivity.this, DashboardActivity.class);
                intent.putExtra("STUDENT_NAME", "Aleeya Fatima");
                intent.putExtra("REG_NO", "24108108");
                intent.putExtra("UNI_NAME", "SZABIST ISLAMABAD");
                intent.putExtra("FATHER_NAME", "Muhammad Altaf Khan");
                intent.putExtra("PROGRAM", "BS AI (Artificial Intelligence)");
                intent.putExtra("PHONE", "0301-6668865");
                intent.putExtra("EMERGENCY_PHONE", "0345-5633510");
                startActivity(intent);
            } else {
                Toast.makeText(MainActivity.this, "Invalid credentials! Use 'Aleeya Fatima' and 'aleeya27'", Toast.LENGTH_LONG).show();
            }
        });
    }
}
