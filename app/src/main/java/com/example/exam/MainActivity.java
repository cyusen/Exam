package com.example.exam;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private EditText etUsername;
    private EditText etPassword;
    private Button btnLogin;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        etUsername=findViewById(R.id.userName);
        etPassword=findViewById(R.id.password);
        btnLogin=findViewById(R.id.login);

        btnLogin.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.login:
            login();
            break;

        }
    }

    private void login() {
        String username=etUsername.getText().toString().trim();
        String password=etPassword.getText().toString();
        if (username.equals("cys")&&password.equals("123")){
            Toast.makeText(MainActivity.this,"登录成功",Toast.LENGTH_LONG).show();
            Intent intent=new Intent(MainActivity.this,Main2Activity.class);
            intent.putExtra("username",etUsername.getText().toString());
            startActivity(intent);
        }else
            Toast.makeText(MainActivity.this,"登录失败",Toast.LENGTH_LONG).show();

    }

//    private void welcome() {
//
////        String text = etUsername.getText().toString();
////        Bundle bundle = new Bundle();
////        bundle.putString("ttt",text);
////        startActivityForResult(intent,100);
//
//
//    }
}


