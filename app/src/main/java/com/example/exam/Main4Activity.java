package com.example.exam;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Main4Activity extends AppCompatActivity {

    private TextView title,content;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
        title=findViewById(R.id.bt_title);
        content=findViewById(R.id.bt_content);

        Bundle bundle=getIntent().getExtras();
        if(bundle!=null){
            String name  = bundle.getString("text");
            String name2=bundle.getString("text2");
            title.setText(name);
            content.setText(name2);
        }
}}
