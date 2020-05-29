package com.stranger.chatapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class RegisterTypeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register_type);
        getSupportActionBar().hide();
        findViewById(R.id.stranger).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(RegisterTypeActivity.this, RegisterActivity.class);
                intent.putExtra("type","Stranger");
                startActivity(intent);
            }
        });
        findViewById(R.id.friends).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(RegisterTypeActivity.this, RegisterActivity.class);
                intent.putExtra("type","Friends");
                startActivity(intent);
            }
        });
    }
}
