package com.example.r.bookcalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import android.widget.Button;
import android.content.Intent;

public class MainActivity extends AppCompatActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setTitle("Proyecto Jesús para los Niños");

        // Restore preferences
//        TextView tv4 = (TextView) findViewById(R.id.textView3);
//        TextView tv5 = (TextView) findViewById(R.id.textView5);
//        TextView tv6 = (TextView) findViewById(R.id.textView7);
//        TextView tv7 = (TextView) findViewById(R.id.textView9);
//        TextView tv8 = (TextView) findViewById(R.id.textView11);
//        TextView tv9 = (TextView) findViewById(R.id.textView13);
//        TextView tv10 = (TextView) findViewById(R.id.textView15);
//        TextView tv11 = (TextView) findViewById(R.id.textView17);

        //SharedPreferences sett = getApplicationContext().getSharedPreferences("file", MODE_PRIVATE);

        //int number = sett.getInt("uno", 0);
        //tv4.setText(String.valueOf(number));

    }


    public void clic( View view) {
        String button_test;
        button_test = ((Button) view).getText().toString();
        if (button_test.equals("Donación \n Contado \n Consig")) {
            Intent intent1 = new Intent(this, Donations.class);
            startActivity(intent1);
        } else if (button_test.equals("Devolución")) {
            Intent intent = new Intent(this, Return.class);
            startActivity(intent);
        }
        else if (button_test.equals("Apertura")) {
            Intent intent = new Intent(this, Apertura.class);
            startActivity(intent);
        }
        else if (button_test.equals("Cierre")) {
            Intent intent = new Intent(this, Cierre.class);
            startActivity(intent);
        }
        else if (button_test.equals("Ajustes")) {
            Intent intent = new Intent(this, Settings.class);
            startActivity(intent);
        }
        else if (button_test.equals("Inventario")) {
            Intent intent = new Intent(this, Inventory.class);
            startActivity(intent);
        }
    }

}
