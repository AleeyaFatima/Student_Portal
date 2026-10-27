package com.example.studentcard;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.button.MaterialButton;
import com.google.android.material.card.MaterialCardView;

public class DashboardActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);

        // Retrieve student data from Intent
        String name = getIntent().getStringExtra("STUDENT_NAME");
        String regNo = getIntent().getStringExtra("REG_NO");
        String uniName = getIntent().getStringExtra("UNI_NAME");
        String fatherName = getIntent().getStringExtra("FATHER_NAME");
        String program = getIntent().getStringExtra("PROGRAM");
        String phone = getIntent().getStringExtra("PHONE");
        String emergencyPhone = getIntent().getStringExtra("EMERGENCY_PHONE");

        // Set welcome text
        TextView tvDashboardName = findViewById(R.id.tvDashboardName);
        TextView tvDashboardProgram = findViewById(R.id.tvDashboardProgram);
        tvDashboardName.setText(name != null ? name : "Aleeya Fatima");
        tvDashboardProgram.setText(program != null ? program : "BS AI (Artificial Intelligence)");

        // Dashboard card click events
        MaterialCardView cardCourses = findViewById(R.id.cardCourses);
        MaterialCardView cardAttendance = findViewById(R.id.cardAttendance);
        MaterialCardView cardResults = findViewById(R.id.cardResults);
        MaterialCardView cardProfile = findViewById(R.id.cardProfile);
        MaterialCardView cardStudentCard = findViewById(R.id.cardStudentCard);
        MaterialButton btnLogout = findViewById(R.id.btnDashboardLogout);

        // Courses card click
        cardCourses.setOnClickListener(v -> {
            Toast.makeText(this, "Courses - Coming Soon", Toast.LENGTH_SHORT).show();
        });

        // Attendance card click
        cardAttendance.setOnClickListener(v -> {
            Toast.makeText(this, "Attendance - Coming Soon", Toast.LENGTH_SHORT).show();
        });

        // Results card click
        cardResults.setOnClickListener(v -> {
            Toast.makeText(this, "Results - Coming Soon", Toast.LENGTH_SHORT).show();
        });

        // Profile card → opens ProfileActivity
        cardProfile.setOnClickListener(v -> {
            Intent intent = new Intent(DashboardActivity.this, ProfileActivity.class);
            intent.putExtra("STUDENT_NAME", name);
            intent.putExtra("REG_NO", regNo);
            intent.putExtra("UNI_NAME", uniName);
            intent.putExtra("FATHER_NAME", fatherName);
            intent.putExtra("PROGRAM", program);
            intent.putExtra("PHONE", phone);
            intent.putExtra("EMERGENCY_PHONE", emergencyPhone);
            startActivity(intent);
        });

        // Student Card → opens existing CardActivity
        cardStudentCard.setOnClickListener(v -> {
            Intent intent = new Intent(DashboardActivity.this, CardActivity.class);
            intent.putExtra("STUDENT_NAME", name);
            intent.putExtra("REG_NO", regNo);
            intent.putExtra("UNI_NAME", uniName);
            intent.putExtra("FATHER_NAME", fatherName);
            intent.putExtra("PROGRAM", program);
            intent.putExtra("PHONE", phone);
            intent.putExtra("EMERGENCY_PHONE", emergencyPhone);
            startActivity(intent);
        });

        // Logout → go back to Login
        btnLogout.setOnClickListener(v -> {
            Intent intent = new Intent(DashboardActivity.this, MainActivity.class);
            intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP | Intent.FLAG_ACTIVITY_NEW_TASK);
            startActivity(intent);
            finish();
        });
    }
}
