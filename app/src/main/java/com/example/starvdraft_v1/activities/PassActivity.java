package com.example.starvdraft_v1.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.starvdraft_v1.R;

public class PassActivity extends AppCompatActivity {

    Button btn_Search, btn_Consult, btn_Create, btn_Home;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pass);

        btn_Search = (Button) findViewById(R.id.btn_Search);
        btn_Create = (Button) findViewById(R.id.btn_Create);
        btn_Home = (Button) findViewById(R.id.btn_Home);

        btn_Search.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(PassActivity.this, SearchActivity.class);
                startActivity(intent);
            }
        });

        btn_Create.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(PassActivity.this, CreateRecipeActivity.class);
                startActivity(intent);
            }
        });

        btn_Home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(PassActivity.this, HomeActivity.class);
                startActivity(intent);
            }
        });

    }
}
