package com.example.r.bookcalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import android.widget.TextView;
import android.widget.EditText;
import android.content.SharedPreferences;

public class Inventory extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_send);

        setTitle("Inventario");

         //Restore preferences
        TextView tv1 = (TextView) findViewById(R.id.textView44);
        TextView tv2 = (TextView) findViewById(R.id.textView45);
        TextView tv3 = (TextView) findViewById(R.id.textView58);
        TextView tv4 = (TextView) findViewById(R.id.textView59);
        TextView tv5 = (TextView) findViewById(R.id.textView60);
        TextView tv6 = (TextView) findViewById(R.id.textView61);
        TextView tv7 = (TextView) findViewById(R.id.textView62);
        TextView tv8 = (TextView) findViewById(R.id.textView63);
        TextView tv9 = (TextView) findViewById(R.id.textView64);
        TextView tv10 = (TextView) findViewById(R.id.textView65);
        TextView tv11 = (TextView) findViewById(R.id.textView66);
        TextView tv12 = (TextView) findViewById(R.id.textView69);
        TextView tv13 = (TextView) findViewById(R.id.textView68);
        TextView tv14 = (TextView) findViewById(R.id.textView67);


        SharedPreferences sett = getApplicationContext().getSharedPreferences("file", MODE_PRIVATE);

        int number = sett.getInt("uno", 0);
        tv1.setText(String.valueOf(number));
        number = sett.getInt("dos", 0);
        tv2.setText(String.valueOf(number));
        number = sett.getInt("tres", 0);
        tv3.setText(String.valueOf(number));
        number = sett.getInt("cuatro", 0);
        tv4.setText(String.valueOf(number));
        number = sett.getInt("cinco", 0);
        tv5.setText(String.valueOf(number));
        number = sett.getInt("seis", 0);
        tv6.setText(String.valueOf(number));
        number = sett.getInt("jfc", 0);
        tv7.setText(String.valueOf(number));
        number = sett.getInt("pre", 0);
        tv8.setText(String.valueOf(number));
        number = sett.getInt("tuno", 0);
        tv9.setText(String.valueOf(number));
        number = sett.getInt("tdos", 0);
        tv10.setText(String.valueOf(number));
        number = sett.getInt("ttres", 0);
        tv11.setText(String.valueOf(number));
        number = sett.getInt("tcuatro", 0);
        tv12.setText(String.valueOf(number));
        number = sett.getInt("tcinco", 0);
        tv13.setText(String.valueOf(number));
        number = sett.getInt("tseis", 0);
        tv14.setText(String.valueOf(number));

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_send, menu);
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
