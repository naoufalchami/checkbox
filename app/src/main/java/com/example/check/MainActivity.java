package com.example.check;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    Button btn;
    CheckBox checkBox1,checkBox2,checkBox3,checkBox4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        checkBox1 = findViewById(R.id.check1);
        checkBox2 = findViewById(R.id.check2);
        checkBox3 = findViewById(R.id.check3);
        checkBox4 = findViewById(R.id.check4);
        btn = findViewById(R.id.btn);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                StringBuilder message = new StringBuilder();

                if (checkBox1.isChecked()) {
                    message.append(checkBox1.getText()).append(",");
                }
                if (checkBox2.isChecked()) {
                    message.append(checkBox2.getText()).append(",");
                }
                if (checkBox3.isChecked()) {
                    message.append(checkBox3.getText()).append(",");
                }
                if (checkBox4.isChecked()) {
                    message.append(checkBox4.getText()).append("");
                }

                if (message.length() > 0) {
                    Toast.makeText(MainActivity.this, message.toString().trim(), Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(MainActivity.this, "No checkboxes selected", Toast.LENGTH_SHORT).show();
                }
            }
        });


    }
}