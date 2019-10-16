package com.example.clickimage;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class ConstraintActivity extends AppCompatActivity implements View.OnClickListener {
    ImageView imageView,imageView3;
    TextView textView2,textView3,textView4,textView5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_constraint);
        imageView =findViewById(R.id.imageView);
        imageView3 =findViewById(R.id.imageView3);
        textView2 =findViewById(R.id.textView2);
        textView3=findViewById(R.id.textView3);
        textView4=findViewById(R.id.textView4);
        textView5=findViewById(R.id.textView5);
    }

    @Override
    public void onClick(View v) {

    }
}
