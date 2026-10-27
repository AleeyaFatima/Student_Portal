package com.example.studentcard;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.button.MaterialButton;

public class ProfileActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        // Initialize UI Elements
        TextView tvProfileName = findViewById(R.id.tvProfileName);
        TextView tvProfileProgram = findViewById(R.id.tvProfileProgram);
        TextView tvProfileRegNo = findViewById(R.id.tvProfileRegNo);
        TextView tvProfileFatherName = findViewById(R.id.tvProfileFatherName);
        TextView tvProfileUni = findViewById(R.id.tvProfileUni);
        TextView tvProfilePhone = findViewById(R.id.tvProfilePhone);
        TextView tvProfileEmergency = findViewById(R.id.tvProfileEmergency);
        MaterialButton btnEditProfile = findViewById(R.id.btnEditProfile);
        MaterialButton btnBackToDashboard = findViewById(R.id.btnBackToDashboard);

        // Retrieve passed student data
        String name = getIntent().getStringExtra("STUDENT_NAME");
        String regNo = getIntent().getStringExtra("REG_NO");
        String uniName = getIntent().getStringExtra("UNI_NAME");
        String fatherName = getIntent().getStringExtra("FATHER_NAME");
        String program = getIntent().getStringExtra("PROGRAM");
        String phone = getIntent().getStringExtra("PHONE");
        String emergencyPhone = getIntent().getStringExtra("EMERGENCY_PHONE");

        // Set data to views
        tvProfileName.setText(name != null ? name : "Aleeya Fatima");
        tvProfileProgram.setText(program != null ? program : "BS AI (Artificial Intelligence)");
        tvProfileRegNo.setText(regNo != null ? regNo : "24108108");
        tvProfileFatherName.setText(fatherName != null ? fatherName : "Muhammad Altaf Khan");
        tvProfileUni.setText(uniName != null ? uniName : "SZABIST ISLAMABAD");
        tvProfilePhone.setText(phone != null ? phone : "0301-6668865");
        tvProfileEmergency.setText(emergencyPhone != null ? emergencyPhone : "0345-5633510");

        // Edit Profile click event
        btnEditProfile.setOnClickListener(v -> {
            Toast.makeText(this, "Edit Profile - Coming Soon", Toast.LENGTH_SHORT).show();
        });

        // Back to Dashboard
        btnBackToDashboard.setOnClickListener(v -> finish());

        // Logout → go back to Login and clear back stack
        MaterialButton btnLogout = findViewById(R.id.btnLogout);
        btnLogout.setOnClickListener(v -> {
            Intent intent = new Intent(ProfileActivity.this, MainActivity.class);
            intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP | Intent.FLAG_ACTIVITY_NEW_TASK);
            startActivity(intent);
            finish();
        });
    }
}
