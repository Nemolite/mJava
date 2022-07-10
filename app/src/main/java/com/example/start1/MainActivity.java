package com.example.start1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {
private LinearLayout imp1,imp2,imp3;
private boolean st_sp = false;
private Button mb1;
//private int counter = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imp1 = findViewById(R.id.mp1);
        imp2 = findViewById(R.id.mp2);
        imp3 = findViewById(R.id.mp3);
        mb1 = findViewById(R.id.b1);
    }

    public void onClickStart(View view) {
        if (!st_sp) {
            mb1.setText("Stop");
                st_sp =true;
            imp1.setBackgroundColor(getResources().getColor(R.color.purple_200));
            imp2.setBackgroundColor(getResources().getColor(R.color.teal_200));
            imp3.setBackgroundColor(getResources().getColor(R.color.red));



         } else {
            mb1.setText("Start");
            st_sp = false;
            imp1.setBackgroundColor(getResources().getColor(R.color.red));
            imp2.setBackgroundColor(getResources().getColor(R.color.teal_200));
            imp3.setBackgroundColor(getResources().getColor(R.color.purple_200));
        }

        }
    @Override
    protected void onDestroy () {
        super.onDestroy();
        st_sp =false;

    }
}