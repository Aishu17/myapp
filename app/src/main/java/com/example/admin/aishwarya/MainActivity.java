package com.example.admin.aishwarya;

import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.appindexing.Action;
import com.google.android.gms.appindexing.AppIndex;
import com.google.android.gms.common.api.GoogleApiClient;

public class MainActivity extends AppCompatActivity {

    /**
     * ATTENTION: This was auto-generated to implement the App Indexing API.
     * See https://g.co/AppIndexing/AndroidStudio for more information.
     */
    private GoogleApiClient client;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        setContentView(R.layout.activity_main);

        Button btn = (Button) findViewById(R.id.btn);

        Button btn1 = (Button) findViewById(R.id.btn1);


        final TextView tv = (TextView) findViewById(R.id.txt);


//        View.OnClickListener(listener);

        View.OnClickListener Listener1 = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            String text = tv.getText().toString();
            int counter = Integer.parseInt(text);
                if(v.getId()==R.id.btn){

//            Log.d("TAG", String.valueOf(counter));
//            Log.e("TAG", String.valueOf(counter));
//            Log.i("TAG", "Hello");
//            Log.w("TAG", String.valueOf(counter));
//            tv.setText(String.valueOf(counter));
                Intent intent = new Intent(MainActivity.this, activity2.class);
                intent.putExtra("name", "aish");
                intent.putExtra("count", String.valueOf(counter));
                startActivity(intent);
            }
                else if(v.getId()==R.id.btn1)
                    counter++;
        };

        View.OnClickListener Listener2 = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text = tv.getText().toString();
                int counter = Integer.parseInt(text);
                counter--;
                Log.d("TAG", String.valueOf(counter));
                Log.e("TAG", String.valueOf(counter));
                Log.i("TAG", String.valueOf(counter));
                Log.w("TAG", String.valueOf(counter));

                tv.setText(String.valueOf(counter));
            }
        };

        btn.setOnClickListener(Listener1);
        btn1.setOnClickListener(Listener2);
        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        client = new GoogleApiClient.Builder(this).addApi(AppIndex.API).build();
    };

    @Override
    protected void onStart() {
        super.onStart();
        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        client.connect();
        Log.d("start", "OnStart called");
        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        Action viewAction = Action.newAction(
                Action.TYPE_VIEW, // TODO: choose an action type.
                "Main Page", // TODO: Define a title for the content shown.
                // TODO: If you have web page content that matches this app activity's content,
                // make sure this auto-generated web page URL is correct.
                // Otherwise, set the URL to null.
                Uri.parse("http://host/path"),
                // TODO: Make sure this auto-generated app deep link URI is correct.
                Uri.parse("android-app://com.example.admin.aishwarya/http/host/path")
        );
        AppIndex.AppIndexApi.start(client, viewAction);
    }

    @Override
    protected void onStop() {
        super.onStop();
        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        Action viewAction = Action.newAction(
                Action.TYPE_VIEW, // TODO: choose an action type.
                "Main Page", // TODO: Define a title for the content shown.
                // TODO: If you have web page content that matches this app activity's content,
                // make sure this auto-generated web page URL is correct.
                // Otherwise, set the URL to null.
                Uri.parse("http://host/path"),
                // TODO: Make sure this auto-generated app deep link URI is correct.
                Uri.parse("android-app://com.example.admin.aishwarya/http/host/path")
        );
        AppIndex.AppIndexApi.end(client, viewAction);
        Log.d("stop", "OnStop called");

        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        client.disconnect();
    }

//editing the file

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("pause", "on pause called");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("resume", "on resume called");
    }
}
