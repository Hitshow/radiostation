package com.example.a.radiostation;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RadioButton;

public class MainActivity extends AppCompatActivity {
     RadioButton rb3,rb2,rb1 ;
     LinearLayout ll1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rb1= (RadioButton) findViewById(R.id.rb1);
        rb2= (RadioButton) findViewById(R.id.rb2);
        rb3= (RadioButton) findViewById(R.id.rb3);
        ll1= (LinearLayout) findViewById(R.id.ll1);
    }

    public void colorchange(View view) {
        if(rb1.isChecked()){
            ll1.setBackgroundColor(Color.RED);
        }
       else if (rb2.isChecked()) {
                ll1.setBackgroundColor(Color.GREEN);
            }
           else{
                ll1.setBackgroundColor(Color.BLUE);
            }
        }

    public void whito(View view) {
        ll1.setBackgroundColor(Color.WHITE);
    }
}

