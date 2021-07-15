package com.projecttwenty.departementofcomputerscience;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Login_page extends AppCompatActivity {
    EditText etemail,etpass;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_page);
        if (getSupportActionBar() != null) {
            getSupportActionBar().hide();
        }
        TextView createnewac=findViewById(R.id.createnewac);
        etemail=findViewById(R.id.etemail);
        etpass=findViewById(R.id.mypass);
        Button btnlogin=findViewById(R.id.btnlogin);
        createnewac.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Login_page.this,SignUp.class));


            }
        });

    }
}