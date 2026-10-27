package com.example.studentcard;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.button.MaterialButton;

public class CardActivity extends AppCompatActivity {

    private ImageView ivCardPhoto;
    private TextView tvCardUniName, tvCardName, tvCardRegNo, tvCardProgram;
    private TextView tvCardFatherName, tvCardPhone, tvCardEmergencyPhone;
    private MaterialButton btnBack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_card);

        // Initialize UI Elements
        ivCardPhoto = findViewById(R.id.ivCardPhoto);
        tvCardUniName = findViewById(R.id.tvCardUniName);
        tvCardName = findViewById(R.id.tvCardName);
        tvCardRegNo = findViewById(R.id.tvCardRegNo);
        tvCardProgram = findViewById(R.id.tvCardProgram);
        tvCardFatherName = findViewById(R.id.tvCardFatherName);
        tvCardPhone = findViewById(R.id.tvCardPhone);
        tvCardEmergencyPhone = findViewById(R.id.tvCardEmergencyPhone);
        btnBack = findViewById(R.id.btnBack);

        // Retrieve passed student data (with accurate defaults)
        String name = getIntent().getStringExtra("STUDENT_NAME");
        String regNo = getIntent().getStringExtra("REG_NO");
        String uniName = getIntent().getStringExtra("UNI_NAME");
        String fatherName = getIntent().getStringExtra("FATHER_NAME");
        String program = getIntent().getStringExtra("PROGRAM");
        String phone = getIntent().getStringExtra("PHONE");
        String emergencyPhone = getIntent().getStringExtra("EMERGENCY_PHONE");

        // Set data to views
        tvCardName.setText(name != null ? name : "Aleeya Fatima");
        tvCardRegNo.setText(regNo != null ? regNo : "24108108");
        tvCardUniName.setText(uniName != null ? uniName : "SZABIST ISLAMABAD");
        tvCardProgram.setText(program != null ? program : "BS AI (Artificial Intelligence)");
        tvCardFatherName.setText(fatherName != null ? fatherName : "Muhammad Altaf Khan");
        tvCardPhone.setText(phone != null ? phone : "0301-6668865");
        tvCardEmergencyPhone.setText(emergencyPhone != null ? emergencyPhone : "0345-5633510");

        // Back / Logout button action
        btnBack.setOnClickListener(v -> finish());
    }
}
