package com.example.instafarm;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SelectActivity extends AppCompatActivity {

    private Button buttoncarrot;
    private Button buttonbroc;
    private Button buttoncauli;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_select);

        buttoncarrot = (Button) findViewById(R.id.buycarrots);
        buttoncarrot.setOnClickListener (new View.OnClickListener() {
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(),DescribeActivity.class);
                i.putExtra("food", "carrots");
                startActivity(i);
            }
        });

        buttonbroc = (Button) findViewById(R.id.buybroc);
        buttonbroc.setOnClickListener (new View.OnClickListener() {
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(),DescribeActivity.class);
                i.putExtra("food", "brocolli");
                startActivity(i);
            }
        });

        buttoncauli = (Button) findViewById(R.id.buycauli);
        buttoncauli.setOnClickListener (new View.OnClickListener() {
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(),DescribeActivity.class);
                i.putExtra("food", "cauliflower");
                startActivity(i);
            }
        });
    }
}
