package com.example.exam;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity implements View.OnClickListener {
    private TextView Title;
    private Button btngj,btnkc;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        btngj=findViewById(R.id.gj);
        btnkc=findViewById(R.id.kc);
        Title=findViewById(R.id.Title);

        Intent intent = getIntent();
        String title = intent.getStringExtra("username");
        Title.setText(title);

        btnkc.setOnClickListener(this);
        btngj.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.kc:
                kc();
                break;
            case R.id.gj:
                finish();


        }
    }



    private void kc() {
        Intent intent=new Intent(Main2Activity.this,Main3Activity.class);
        startActivity(intent);
    }
}
