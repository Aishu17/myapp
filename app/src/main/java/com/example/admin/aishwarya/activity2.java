package com.example.admin.aishwarya;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class activity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activity2);


        Button btn = (Button) findViewById(R.id.btn);


        final TextView tv = (TextView) findViewById(R.id.txt);


//        View.OnClickListener(listener);

        View.OnClickListener listener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//            String text = tv.getText().toString();
//            int counter = Integer.parseInt(text);
//            counter++;
//            Log.d("TAG", String.valueOf(counter));
//            Log.e("TAG", String.valueOf(counter));
//            Log.i("TAG", "Hello");
//            Log.w("TAG", String.valueOf(counter));
//            tv.setText(String.valueOf(counter));
                finish();
            }
        };

        btn.setOnClickListener(listener);
    }
}