package com.example.brianbest.myfirstapp;

import android.graphics.Color;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        TextView textView = (TextView)findViewById(R.id.mainText);
        textView.setText("Spencer wrote this code!");

        textView.setTextColor(Color.parseColor("#00FFFF"));
        textView.setTextSize(30);

        textView.setGravity(1);


        TextView secondtextView = (TextView)findViewById(R.id.secondText);
        secondtextView.setText("Spencer plays minecraft");
        secondtextView.setY(250);

        secondtextView.setTextColor(Color.parseColor("#0000FF"));
        secondtextView.setTextSize(30);

        secondtextView.setGravity(1);

        Button clickButton=(Button) findViewById(R.id.button);
        clickButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView textView = (TextView)findViewById(R.id.mainText);
                textView.setTextColor(Color.parseColor("#FF0000"));
            }
        });

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
