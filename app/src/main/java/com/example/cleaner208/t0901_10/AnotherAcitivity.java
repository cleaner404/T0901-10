package com.example.cleaner208.t0901_10;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class AnotherAcitivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_another_acitivity);


        Button button=(Button)findViewById(R.id.btn_back);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AnotherAcitivity.this, MainActivity.class);
                startActivity(intent);
                finish();
            }
        });

        Intent intent=getIntent();
        String code=intent.getStringExtra("code");
        Integer TN=intent.getIntExtra("truenum", 1);
        Toast.makeText(this,code+TN, Toast.LENGTH_LONG).show();
    }

}
