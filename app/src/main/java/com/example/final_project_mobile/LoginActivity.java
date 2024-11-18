package com.example.final_project_mobile;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class LoginActivity extends AppCompatActivity {
private EditText et_email;
private EditText et_password;
private Button btn_login;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_login);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        //Signing variable
        et_email = findViewById(R.id.et_email);
        et_password = findViewById(R.id.et_password);
        btn_login = findViewById(R.id.btn_login);
        btn_login.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SuspiciousIndentation")
            @Override
            public void onClick(View view) {
                String email = et_email.getText().toString(); // Lấy giá trị email khi nhấn nút
                String password = et_password.getText().toString(); // Lấy giá trị password khi nhấn nút
                if(email.equals("admin@gmail.com") && password.equals("1111")) {
                    Intent intent = new Intent(LoginActivity.this, AdminDashBoardActivity.class);
                    startActivity(intent);
                }
                else
                Toast.makeText(LoginActivity.this, "Wrong password or Email, please try again!", Toast.LENGTH_SHORT).show();
            }
        });

    }
}