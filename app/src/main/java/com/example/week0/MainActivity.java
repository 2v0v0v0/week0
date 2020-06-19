package com.example.week0;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ((TextView) findViewById(R.id.textView3)).setTextColor(getResources().getColor(R.color.colorPrimary));
            }
        });

        findViewById(R.id.button2).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                findViewById(R.id.rootView).setBackgroundColor(getResources().getColor(R.color.pink));

            }
        });

        findViewById(R.id.button3).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //user input
                String newText=((EditText)findViewById(R.id.editText)).getText().toString();
                //change text= user's input
                if(TextUtils.isEmpty(newText)){
                    ((TextView) findViewById(R.id.textView3)).setText("Hello from Thu!");
                } else{
                    ((TextView) findViewById(R.id.textView3)).setText(newText);
                }


            }
        });

        findViewById(R.id.rootView).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //reset text color
                ((TextView) findViewById(R.id.textView3)).setTextColor(getResources().getColor(R.color.black));
                //reset view color
                findViewById(R.id.rootView).setBackgroundColor(getResources().getColor(R.color.colorAccent));
                //reset text
                ((TextView) findViewById(R.id.textView3)).setText("Hello from Thu!");
            }
        });

    }
}