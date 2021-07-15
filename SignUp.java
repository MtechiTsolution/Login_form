package com.projecttwenty.departementofcomputerscience;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


import java.io.IOException;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class SignUp extends AppCompatActivity {
    EditText etname,etemail,etpass;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);
        if (getSupportActionBar() != null) {
            getSupportActionBar().hide();
        }
        etname=findViewById(R.id.editName);
        etemail=findViewById(R.id.editEmail);
        etpass=findViewById(R.id.editPass);

        Button btn_new=findViewById(R.id.buttonAcount);
        final String name=etname.getText().toString().trim();
        final String email=etemail.getText().toString().trim();
        final String pass=etpass.getText().toString().trim();

        btn_new.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(SignUp.this,ProfileActivity.class);
                startActivity(intent);
            }
        });

    }

    private void createNewAcount(String name, String email, String pass) {
        if (TextUtils.isEmpty(name)){
            etname.setError("Please Enter Name");
            etname.requestFocus();
            return;
        }
        if (TextUtils.isEmpty(email)){
            etemail.setError("Please Enter Email");
            etemail.requestFocus();
            return;
        }
        if (TextUtils.isEmpty(pass)){
            etpass.setError("Please Enter Password");
            etpass.requestFocus();
            return;
        }

//        Call<ResponseBody>call= MyRetrofit.getInstance().getMyRetrofit().createNewAcount(name,email,pass);
//        call.enqueue(new Callback<ResponseBody>() {
//            @Override
//            public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
//                try {
//                    String hi=response.body().string();
//                    Toast.makeText(getApplicationContext(),hi,Toast.LENGTH_LONG).show();
//                } catch (IOException e) {
//                    e.printStackTrace();
//                }
//
//            }
//
//            @Override
//            public void onFailure(Call<ResponseBody> call, Throwable t) {
//
//            }
//        });
    }

}