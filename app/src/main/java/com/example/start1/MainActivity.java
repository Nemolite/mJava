package com.example.start1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {
private LinearLayout imp1,imp2,imp3;
private boolean st_sp = false;
private Button mb7;
private int setil=0;
//private int counter = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imp1 = findViewById(R.id.mp1);
        imp2 = findViewById(R.id.mp2);
        imp3 = findViewById(R.id.mp3);
        mb7 = findViewById(R.id.button8);

    }

    public void onClicker(View view) {
        if(!st_sp) {
            st_sp =true;
            mb7.setText("Stop");



            // Новый поток
            Thread thread = new Thread(new Runnable() {
                @Override
                public void run() {
                    while (st_sp) {
                        setil++;
                        switch (setil){
                            case 1:
                                imp1.setBackgroundColor(getResources().getColor(R.color.red));
                                imp2.setBackgroundColor(getResources().getColor(R.color.black));
                                imp3.setBackgroundColor(getResources().getColor(R.color.black));

                                break;
                            case 2:

                                imp1.setBackgroundColor(getResources().getColor(R.color.black));
                                imp2.setBackgroundColor(getResources().getColor(R.color.yal));
                                imp3.setBackgroundColor(getResources().getColor(R.color.black));

                                break;
                            case 3:

                                imp1.setBackgroundColor(getResources().getColor(R.color.black));
                                imp2.setBackgroundColor(getResources().getColor(R.color.black));
                                imp3.setBackgroundColor(getResources().getColor(R.color.gre));

                                setil = 0;
                                break;
                        }


                    } // while

                } // run
            });
            thread.start();
            // завршение потока

        } else {
            st_sp =false;
            mb7.setText("Start");
        } // if
    } //onClicker
    @Override
    protected void onDestroy () {
        super.onDestroy();
        st_sp =false;

    }
}