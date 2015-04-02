package com.example.david.assignment_1;

import android.app.Activity;
import android.content.DialogInterface;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import java.util.Random;
import android.view.View.OnClickListener;

public class MainActivity extends Activity implements OnClickListener {


    Random random;
    int n = 0;
    TextView textView2;
    String[] quotes;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView2 = (TextView) findViewById(R.id.textView2);
        quotes = getResources().getStringArray(R.array.quotes);

        final Button button = (Button) findViewById(R.id.button);

            button.setOnClickListener(this);



    }


    @Override
    public void onClick(View v){
        random = new Random();
        n = random.nextInt(3);
        textView2.setText(quotes[n]);


        Log.i("assignment_1", "Button pressed");


    }


            @Override
            protected void onStart() {
                super.onStart();
                Log.i("onStart", "Activity start");
                // The activity is about to become visible.
            }

            @Override
            protected void onResume() {
                super.onResume();
                Log.i("onResume", "Activity resumed");
                // The activity has become visible (it is now "resumed").
            }

            @Override
            protected void onPause() {
                super.onPause();
                Log.i("onPause", "Activity paused");
                // Another activity is taking focus (this activity is about to be "paused").
            }

            @Override
            protected void onStop() {
                super.onStop();
                Log.i("onStop", "Activity stopped");
                // The activity is no longer visible (it is now "stopped")
            }

            @Override
            protected void onDestroy() {
                super.onDestroy();
                Log.i("onDestroy", "Activity destroyed");
                // The activity is about to be destroyed.
            }

            @Override
            public boolean onCreateOptionsMenu(Menu menu) {
                // Inflate the menu; this adds items to the action bar if it is present.
                getMenuInflater().inflate(R.menu.menu_main, menu);
                return true;
            }

            @Override
            public boolean onOptionsItemSelected(MenuItem item) {
                // Handle action bar item clicks here. The action bar will
                // automatically handle clicks on the Home/Up button, so long
                // as you specify a parent activity in AndroidManifest.xml.
                int id = item.getItemId();

                //noinspection SimplifiableIfStatement
                if (id == R.id.action_settings) {
                    return true;
                }

                return super.onOptionsItemSelected(item);
            }
        }

