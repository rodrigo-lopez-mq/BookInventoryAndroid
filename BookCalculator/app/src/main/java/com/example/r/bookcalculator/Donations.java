package com.example.r.bookcalculator;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.app.Activity;
import android.widget.TextView;
import android.widget.EditText;
import android.content.SharedPreferences;
import android.widget.Toast;
import android.content.Context;
import android.util.Log;

import java.util.Date;
import java.text.SimpleDateFormat;

public class Donations extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_donations);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_donations, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        TextView tv1 = (TextView) findViewById(R.id.editText41);
        TextView tv2 = (TextView) findViewById(R.id.editText28);
        TextView tv3 = (TextView) findViewById(R.id.editText29);
        TextView tv4 = (TextView) findViewById(R.id.editText30);
        TextView tv5 = (TextView) findViewById(R.id.editText31);
        TextView tv6 = (TextView) findViewById(R.id.editText32);
        TextView tv7 = (TextView) findViewById(R.id.editText33);

        TextView tv8 = (TextView) findViewById(R.id.editText34);
        TextView tv9 = (TextView) findViewById(R.id.editText35);
        TextView tv10 = (TextView) findViewById(R.id.editText36);
        TextView tv11 = (TextView) findViewById(R.id.editText37);
        TextView tv12 = (TextView) findViewById(R.id.editText38);
        TextView tv13 = (TextView) findViewById(R.id.editText39);
        TextView tv14 = (TextView) findViewById(R.id.editText40);

        TextView uv1 = (TextView) findViewById(R.id.editText4);
        TextView uv2 = (TextView) findViewById(R.id.editText5);
        TextView uv3 = (TextView) findViewById(R.id.editText6);
        TextView uv4 = (TextView) findViewById(R.id.editText7);
        TextView uv5 = (TextView) findViewById(R.id.editText8);
        TextView uv6 = (TextView) findViewById(R.id.editText9);
        TextView uv7 = (TextView) findViewById(R.id.editText10);
        TextView uv8 = (TextView) findViewById(R.id.editText11);
        TextView uv9 = (TextView) findViewById(R.id.editText27);
        TextView uv10 = (TextView) findViewById(R.id.editText26);
        TextView uv11 = (TextView) findViewById(R.id.editText24);
        TextView uv12 = (TextView) findViewById(R.id.editText3);
        TextView uv13 = (TextView) findViewById(R.id.editText2);
        TextView uv14 = (TextView) findViewById(R.id.editText);
        TextView don = (TextView) findViewById(R.id.editText205);


        //noinspection SimplifiableIfStatement
        if (id == R.id.calculate) {

            //Toast.makeText(getApplicationContext(), "Saved", Toast.LENGTH_LONG).show();

            SharedPreferences sett = getApplicationContext().getSharedPreferences("file", MODE_PRIVATE);
            float number = sett.getFloat("cost", 0);
            float number2 = sett.getFloat("cost1", 0);
            float number1 = sett.getFloat("cost2", 0);
            float number3 = sett.getFloat("cost3", 0);

            float h1 = 0;
            float h2 = 0;
            float h3 = 0;
            float h4 = 0;
            float h5 = 0;
            float h6 = 0;
            float h7 = 0;
            float h8 = 0;
            float h9 = 0;
            float h10 = 0;
            float h11 = 0;
            float h12 = 0;
            float h13 = 0;
            float h14 = 0;
            int boooks = 0;
            float donn = 0;

            if (tv1.getText().length() != 0) {
                h1 = Float.parseFloat(tv1.getText().toString());
                boooks = +(int) h1;
                h1 = h1 * number;
                uv1.setText(String.valueOf(h1));
            }
            if (tv2.getText().length() != 0) {
                h2 = Float.parseFloat(tv2.getText().toString());
                boooks = +(int) h2;
                h2 = h2 * number;
                uv2.setText(String.valueOf(h2));
            }
            if (tv3.getText().length() != 0) {
                h3 = Float.parseFloat(tv3.getText().toString());
                boooks = +(int) h3;
                h3 = h3 * number;
                uv3.setText(String.valueOf(h3));
            }
            if (tv4.getText().length() != 0) {
                h4 = Float.parseFloat(tv4.getText().toString());
                boooks = +(int) h4;
                h4 = h4 * number;
                uv4.setText(String.valueOf(h4));
            }
            if (tv5.getText().length() != 0) {
                h5 = Float.parseFloat(tv5.getText().toString());
                boooks = +(int) h5;
                h5 = h5 * number;
                uv5.setText(String.valueOf(h5));
            }
            if (tv6.getText().length() != 0) {
                h6 = Float.parseFloat(tv6.getText().toString());
                boooks = +(int) h6;
                h6 = h6 * number;
                uv6.setText(String.valueOf(h6));
            }
            if (tv7.getText().length() != 0) {
                h7 = Float.parseFloat(tv7.getText().toString());
                boooks = +(int) h7;
                h7 = h7 * number1;
                uv7.setText(String.valueOf(h7));
            }
            if (tv8.getText().length() != 0) {
                h8 = Float.parseFloat(tv8.getText().toString());
                boooks = +(int) h8;
                h8 = h8 * number3;
                uv8.setText(String.valueOf(h8));
            }
            if (tv9.getText().length() != 0) {
                h9 = Float.parseFloat(tv9.getText().toString());
                boooks = +(int) h9;
                h9 = h9 * number2;
                uv9.setText(String.valueOf(h9));
            }
            if (tv10.getText().length() != 0) {
                h10 = Float.parseFloat(tv10.getText().toString());
                boooks = +(int) h10;
                h10 = h10 * number2;
                uv10.setText(String.valueOf(h10));
            }
            if (tv11.getText().length() != 0) {
                h11 = Float.parseFloat(tv11.getText().toString());
                boooks = +(int) h11;
                h11 = h11 * number2;
                uv11.setText(String.valueOf(h11));
            }
            if (tv12.getText().length() != 0) {
                h12 = Float.parseFloat(tv12.getText().toString());
                boooks = +(int) h12;
                h12 = h12 * number2;
                uv12.setText(String.valueOf(h12));
            }
            if (tv13.getText().length() != 0) {
                h13 = Float.parseFloat(tv13.getText().toString());
                boooks = +(int) h13;
                h13 = h13 * number2;
                uv13.setText(String.valueOf(h13));
            }
            if (tv14.getText().length() != 0) {
                h14 = Float.parseFloat(tv14.getText().toString());
                boooks = +(int) h14;
                h14 = h14 * number2;
                uv14.setText(String.valueOf(h14));
            }
            if (don.getText().length() != 0) {
                donn = Float.parseFloat(don.getText().toString());
            }

            //TextView nbooks = (TextView) findViewById(R.id.textView70);
            TextView totalv = (TextView) findViewById(R.id.textView71);
            TextView invoicen = (TextView) findViewById(R.id.textView72);
            TextView totalg = (TextView) findViewById(R.id.textView201);
            TextView invo = (TextView) findViewById(R.id.editText216);
            String invv = "";

            if (don.getText().length() != 0) {
                invv = don.getText().toString();
            }


            float ttotal = h1 + h2 + h3 + h4 + h5 + h6 + h7 + h8 + h9 + h10 + h11 + h12 + h13 + h14;


            String date = new SimpleDateFormat("yyyy_MM_dd").format(new Date());

            int counter = sett.getInt("counter", 0);

            if (counter > 0) {
                counter++;
            } else if (counter <= 0) {
                counter = 1;
            }

            if (counter > 999) {
                counter = 0;
            }

            SharedPreferences.Editor editor = sett.edit();
            editor.putInt("counter", counter);
            editor.apply();
            //date+="_"+String.valueOf(counter);
            float totall = donn - ttotal;
            totalg.setText(String.valueOf(ttotal));

            //nbooks.setText(String.valueOf(boooks));
            totalv.setText(String.valueOf(totall));
            invoicen.setText(date);


            Toast.makeText(getApplicationContext(), "Listo", Toast.LENGTH_LONG).show();


            return true;
        }


        if (id == R.id.action_settings) {
            tv1.setText("200");
            tv2.setText("200");
            tv3.setText("200");
            tv4.setText("200");
            tv5.setText("200");
            tv6.setText("200");
            tv7.setText("200");
            tv8.setText("200");
            tv9.setText("200");
            tv10.setText("200");
            tv11.setText("200");
            tv12.setText("200");
            tv13.setText("200");
            tv14.setText("200");
            return true;
        }

        if (id == R.id.save) {

            SharedPreferences sett = getApplicationContext().getSharedPreferences("file", MODE_PRIVATE);


            float number0 = sett.getFloat("cost", 0);
            float number1 = sett.getFloat("cost1", 0);
            float number2 = sett.getFloat("cost2", 0);
            float number3 = sett.getFloat("cost3", 0);

            float h1 = 0;
            float h2 = 0;
            float h3 = 0;
            float h4 = 0;
            float h5 = 0;
            float h6 = 0;
            float h7 = 0;
            float h8 = 0;
            float h9 = 0;
            float h10 = 0;
            float h11 = 0;
            float h12 = 0;
            float h13 = 0;
            float h14 = 0;
            int boooks = 0;
            float donn = 0;

            if (tv1.getText().length() != 0) {
                h1 = Float.parseFloat(tv1.getText().toString());
                boooks = +(int) h1;
                h1 = h1 * number0;
                uv1.setText(String.valueOf(h1));
            }
            if (tv2.getText().length() != 0) {
                h2 = Float.parseFloat(tv2.getText().toString());
                boooks = +(int) h1;
                h2 = h2 * number0;
                uv2.setText(String.valueOf(h2));
            }
            if (tv3.getText().length() != 0) {
                h3 = Float.parseFloat(tv3.getText().toString());
                boooks = +(int) h1;
                h3 = h3 * number0;
                uv3.setText(String.valueOf(h3));
            }
            if (tv4.getText().length() != 0) {
                h4 = Float.parseFloat(tv4.getText().toString());
                boooks = +(int) h1;
                h4 = h4 * number0;
                uv4.setText(String.valueOf(h4));
            }
            if (tv5.getText().length() != 0) {
                h5 = Float.parseFloat(tv5.getText().toString());
                boooks = +(int) h1;
                h5 = h5 * number0;
                uv5.setText(String.valueOf(h5));
            }
            if (tv6.getText().length() != 0) {
                h6 = Float.parseFloat(tv6.getText().toString());
                boooks = +(int) h1;
                h6 = h6 * number0;
                uv6.setText(String.valueOf(h6));
            }
            if (tv7.getText().length() != 0) {
                h7 = Float.parseFloat(tv7.getText().toString());
                boooks = +(int) h1;
                h7 = h7 * number2;
                uv7.setText(String.valueOf(h7));
            }
            if (tv8.getText().length() != 0) {
                h8 = Float.parseFloat(tv8.getText().toString());
                boooks = +(int) h1;
                h8 = h8 * number3;
                uv8.setText(String.valueOf(h8));
            }
            if (tv9.getText().length() != 0) {
                h9 = Float.parseFloat(tv9.getText().toString());
                boooks = +(int) h1;
                h9 = h9 * number1;
                uv9.setText(String.valueOf(h9));
            }
            if (tv10.getText().length() != 0) {
                h10 = Float.parseFloat(tv10.getText().toString());
                boooks = +(int) h1;
                h10 = h10 * number1;
                uv10.setText(String.valueOf(h10));
            }
            if (tv11.getText().length() != 0) {
                h11 = Float.parseFloat(tv11.getText().toString());
                boooks = +(int) h1;
                h11 = h11 * number1;
                uv11.setText(String.valueOf(h11));
            }
            if (tv12.getText().length() != 0) {
                h12 = Float.parseFloat(tv12.getText().toString());
                boooks = +(int) h1;
                h12 = h12 * number1;
                uv12.setText(String.valueOf(h12));
            }
            if (tv13.getText().length() != 0) {
                h13 = Float.parseFloat(tv13.getText().toString());
                boooks = +(int) h1;
                h13 = h13 * number1;
                uv13.setText(String.valueOf(h13));
            }
            if (tv14.getText().length() != 0) {
                h14 = Float.parseFloat(tv14.getText().toString());
                boooks = +(int) h1;
                h14 = h14 * number1;
                uv14.setText(String.valueOf(h14));
            }
            if (don.getText().length() != 0) {
                donn = Float.parseFloat(don.getText().toString());
            }

            TextView totalg = (TextView) findViewById(R.id.textView201);
            //TextView nbooks = (TextView) findViewById(R.id.textView70);
            TextView totalv = (TextView) findViewById(R.id.textView71);
            TextView invoicen = (TextView) findViewById(R.id.textView72);

            TextView invo = (TextView) findViewById(R.id.editText200);
            String invv="";
            if (invo.getText().length()  != 0){invv=invo.getText().toString();}

            float ttotal = h1 + h2 + h3 + h4 + h5 + h6 + h7 + h8 + h9 + h10 + h11 + h12 + h13 + h14;
            float totall = donn - ttotal;

            String date = new SimpleDateFormat("yyyy_MM_dd").format(new Date());

            int counter = sett.getInt("counter", 0);

            if (counter > 0) {
                counter++;
            } else if (counter <= 0) {
                counter = 1;
            }

            if (counter > 999) {
                counter = 0;
            }

            SharedPreferences.Editor editor = sett.edit();
            editor.putInt("counter", counter);
            editor.apply();
            //date+="_"+String.valueOf(counter);

            //nbooks.setText(String.valueOf(boooks));
            totalv.setText(String.valueOf(totall));
            invoicen.setText(date);
            totalg.setText(String.valueOf(ttotal));

            int u1 = 0;
            int u2 = 0;
            int u3 = 0;
            int u4 = 0;
            int u5 = 0;
            int u6 = 0;
            int u7 = 0;
            int u8 = 0;

            int u9 = 0;
            int u10 = 0;
            int u11 = 0;
            int u12 = 0;
            int u13 = 0;
            int u14 = 0;

            if (tv1.getText().length() != 0) {
                u1 = Integer.parseInt(tv1.getText().toString());
            }
            if (tv2.getText().length() != 0) {
                u2 = Integer.parseInt(tv2.getText().toString());
            }
            if (tv3.getText().length() != 0) {
                u3 = Integer.parseInt(tv3.getText().toString());
            }
            if (tv4.getText().length() != 0) {
                u4 = Integer.parseInt(tv4.getText().toString());
            }
            if (tv5.getText().length() != 0) {
                u5 = Integer.parseInt(tv5.getText().toString());
            }
            if (tv6.getText().length() != 0) {
                u6 = Integer.parseInt(tv6.getText().toString());
            }
            if (tv7.getText().length() != 0) {
                u7 = Integer.parseInt(tv7.getText().toString());
            }
            if (tv8.getText().length() != 0) {
                u8 = Integer.parseInt(tv8.getText().toString());
            }

            if (tv9.getText().length() != 0) {
                u9 = Integer.parseInt(tv9.getText().toString());
            }
            if (tv10.getText().length() != 0) {
                u10 = Integer.parseInt(tv10.getText().toString());
            }
            if (tv11.getText().length() != 0) {
                u11 = Integer.parseInt(tv11.getText().toString());
            }
            if (tv12.getText().length() != 0) {
                u12 = Integer.parseInt(tv12.getText().toString());
            }
            if (tv13.getText().length() != 0) {
                u13 = Integer.parseInt(tv13.getText().toString());
            }
            if (tv14.getText().length() != 0) {
                u14 = Integer.parseInt(tv14.getText().toString());
            }

            //Log.d("ADebugTag", "Va:"+tv11.getText().toString());
            //Toast.makeText(getApplicationContext(), tv11.getText().toString(), Toast.LENGTH_LONG).show();
            //if (tv11.getText().length() == 0){Toast.makeText(getApplicationContext(), "ff", Toast.LENGTH_LONG).show();}
            //if (tv11.getText().toString()!=""){int u8=Integer.parseInt(tv11.getText().toString());}

            int n1=u1;
            int n2=u2;
            int n3=u3;
            int n4=u4;
            int n5=u5;
            int n6=u6;
            int n7=u7;
            int n8=u8;
            int n9=u9;
            int n10=u10;
            int n11=u11;
            int n12=u12;
            int n13=u13;
            int n14=u14;

            int number = sett.getInt("uno", 0);
            u1 = -u1 + number;
            number = sett.getInt("dos", 0);
            u2 = -u2 + number;
            number = sett.getInt("tres", 0);
            u3 = -u3 + number;
            number = sett.getInt("cuatro", 0);
            u4 = -u4 + number;
            number = sett.getInt("cinco", 0);
            u5 = -u5 + number;
            number = sett.getInt("seis", 0);
            u6 = -u6 + number;
            number = sett.getInt("jfc", 0);
            u7 = -u7 + number;
            number = sett.getInt("pre", 0);
            u8 = -u8 + number;

            number = sett.getInt("tuno", 0);
            u9 = -u9 + number;
            number = sett.getInt("tdos", 0);
            u10 = -u10 + number;
            number = sett.getInt("ttres", 0);
            u11 = -u11 + number;
            number = sett.getInt("tcuatro", 0);
            u12 = -u12 + number;
            number = sett.getInt("tcinco", 0);
            u13 = -u13 + number;
            number = sett.getInt("tseis", 0);
            u14 = -u14 + number;


            SharedPreferences settings = getApplicationContext().getSharedPreferences("file", MODE_PRIVATE);
            //SharedPreferences.Editor editor = settings.edit();

            editor.putInt("uno", u1);
            editor.putInt("dos", u2);
            editor.putInt("tres", u3);
            editor.putInt("cuatro", u4);
            editor.putInt("cinco", u5);
            editor.putInt("seis", u6);
            editor.putInt("jfc", u7);
            editor.putInt("pre", u8);
            editor.putInt("tuno", u9);
            editor.putInt("tdos", u10);
            editor.putInt("ttres", u11);
            editor.putInt("tcuatro", u12);
            editor.putInt("tcinco", u13);
            editor.putInt("tseis", u14);

            editor.apply();

            Toast.makeText(getApplicationContext(), "Guardado", Toast.LENGTH_LONG).show();


            String body = "Número de Factura [Donación]: " + invv + "\n" + "\n" +
                    "Fecha: " + date + "\n" +
                    "--------------------------------------" + "\n" +
                    "LEB 1:     " + "\t" + n1 + "   $ " + h1 + "\n" +
                    "LEB 2:     " + "\t" + n2 + "   $ " + h2 + "\n" +
                    "LEB 3:     " + "\t" + n3 + "   $ " + h3 + "\n" +
                    "LEB 4:     " + "\t" + n4 + "   $ " + h4 + "\n" +
                    "LEB 5:     " + "\t" + n5 + "   $ " + h5 + "\n" +
                    "LEB 6:     " + "\t" + n6 + "   $ " + h6 + "\n" +
                    "GPB 1: " + "   \t" + n9 + "   $ " + h9 + "\n" +
                    "GPB 2: " + "   \t" + n10 + "   $ " + h10 + "\n" +
                    "GPB 3: " + "   \t" + n11 + "   $ " + h11 + "\n" +
                    "GPB 4: " + "   \t" + n12 + "   $ " + h12 + "\n" +
                    "GPB 5: " + "   \t" + n13 + "   $ " + h13 + "\n" +
                    "GPB 6: " + "   \t" + n14 + "   $ " + h14 + "\n" +
                    "JFC:        " + "\t" + n7 + "   $ " + h7 + "\n" +
                    "PRES:     " + "\t" + n8 + "   $ " + h8 + "\n" +

                    "\n" + "\n" +
                    "Total:                         " + ttotal + "\n" +
                    "Donaciones:                   " + donn + "\n" +
                    "Gran total:                   " + totall + "\n" +
                    "Número de factura:          " + invv + "\n";

            Intent i = new Intent(Intent.ACTION_SEND);
            i.setType("message/rfc822");
            i.putExtra(Intent.EXTRA_EMAIL, new String[]{sett.getString("mail","email address")});
            i.putExtra(Intent.EXTRA_SUBJECT, "Factura: "+invv +" "+date);
            i.putExtra(Intent.EXTRA_TEXT, body);
            try {
                startActivity(Intent.createChooser(i, "Enviar email..."));
                finish();
            } catch (android.content.ActivityNotFoundException ex) {
                Toast.makeText(getApplicationContext(), "No hay app de email instalada.", Toast.LENGTH_SHORT).show();
            }

            //finish();

            return true;
        }

        return super.onOptionsItemSelected(item);
    }




}
