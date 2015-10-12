package com.example.r.bookcalculator;

import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Settings extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);


        SharedPreferences sett = getApplicationContext().getSharedPreferences("file", MODE_PRIVATE);
        float number = sett.getFloat("cost", 0);
        EditText ucost = (EditText) findViewById(R.id.editText25);
        TextView uucost = (TextView) findViewById(R.id.textView94);
        EditText mail = (EditText) findViewById(R.id.editText23);
        String umail=sett.getString("mail","email address");

        EditText ucost1 = (EditText) findViewById(R.id.editText42);
        TextView uucost1 = (TextView) findViewById(R.id.textView99);
        EditText ucost2 = (EditText) findViewById(R.id.editText43);
        TextView uucost2 = (TextView) findViewById(R.id.textView100);
        TextView uucost3 = (TextView) findViewById(R.id.textView126);

        //uucost.setText(String.valueOf(number));
        uucost.setText(String.valueOf(number));
        uucost1.setText(String.valueOf(sett.getFloat("cost1", 0)));
        uucost2.setText(String.valueOf(sett.getFloat("cost2", 0)));
        uucost3.setText(String.valueOf(sett.getFloat("cost3", 0)));
//        if (ucost.getText().length()!= 0){
//            uucost.setText(String.valueOf(number));
//        }
//        if (ucost1.getText().length()!= 0){
//            uucost.setText(String.valueOf(sett.getFloat("cost1", 0)));
//        }
//        if (ucost2.getText().length()!= 0){
//            uucost.setText(String.valueOf(sett.getFloat("cost2", 0)));
//        }
        if (!umail.isEmpty()){

            mail.setText(umail);
        }


    }

//    @Override
//    public boolean onCreateOptionsMenu(Menu menu) {
//        // Inflate the menu; this adds items to the action bar if it is present.
//        getMenuInflater().inflate(R.menu.menu_settings, menu);
//        return true;
//    }
//
//    @Override
//    public boolean onOptionsItemSelected(MenuItem item) {
//        // Handle action bar item clicks here. The action bar will
//        // automatically handle clicks on the Home/Up button, so long
//        // as you specify a parent activity in AndroidManifest.xml.
//        int id = item.getItemId();
//
//        //noinspection SimplifiableIfStatement
//        if (id == R.id.action_settings) {
//            return true;
//        }
//
//        return super.onOptionsItemSelected(item);
//    }

    public void clicd( View view) {
        String button_test;
        button_test = ((Button) view).getText().toString();



        //int foo = Integer.parseInt("1234");

        if (button_test.equals("Borrar Inventario")) {

            SharedPreferences settings = getApplicationContext().getSharedPreferences("file", MODE_PRIVATE);
            SharedPreferences.Editor editor = settings.edit();

            editor.putInt("uno",     0);
            editor.putInt("dos",     0);
            editor.putInt("tres",    0);
            editor.putInt("cuatro", 0);
            editor.putInt("cinco",   0);
            editor.putInt("seis",    0);
            editor.putInt("jfc",     0);
            editor.putInt("pre",     0);
            editor.putInt("tuno",    0);
            editor.putInt("tdos",    0);
            editor.putInt("ttres",   0);
            editor.putInt("tcuatro", 0);
            editor.putInt("tcinco",  0);
            editor.putInt("tseis",   0);

            editor.apply();

            Toast.makeText(getApplicationContext(), "Borrado", Toast.LENGTH_LONG).show();


        } else if (button_test.equals("Guardar")) {

            SharedPreferences settings = getApplicationContext().getSharedPreferences("file", MODE_PRIVATE);
            SharedPreferences.Editor editor = settings.edit();

            float ccost=0;
            TextView ucost = (TextView) findViewById(R.id.editText25);
            TextView uucost = (TextView) findViewById(R.id.textView94);

            EditText ucost1 = (EditText) findViewById(R.id.editText42);
            TextView uucost1 = (TextView) findViewById(R.id.textView99);
            EditText ucost2 = (EditText) findViewById(R.id.editText43);
            TextView uucost2 = (TextView) findViewById(R.id.textView100);
            EditText ucost3 = (EditText) findViewById(R.id.editText61);
            TextView uucost3 = (TextView) findViewById(R.id.textView126);

            if (ucost.getText().length()!= 0){
                ccost=Float.parseFloat(ucost.getText().toString());
                editor.putFloat("cost", ccost);
                editor.apply();
                uucost.setText(String.valueOf(ccost));
            }
            if (ucost1.getText().length()!= 0){
                ccost=Float.parseFloat(ucost1.getText().toString());
                editor.putFloat("cost1", ccost);
                editor.apply();
                uucost1.setText(String.valueOf(ccost));
            }
            if (ucost2.getText().length()!= 0){
                ccost=Float.parseFloat(ucost2.getText().toString());
                editor.putFloat("cost2", ccost);
                editor.apply();
                uucost2.setText(String.valueOf(ccost));
            }
            if (ucost3.getText().length()!= 0){
                ccost=Float.parseFloat(ucost3.getText().toString());
                editor.putFloat("cost3", ccost);
                editor.apply();
                uucost3.setText(String.valueOf(ccost));
            }

            EditText mail = (EditText) findViewById(R.id.editText23);
            String yemail="";

            if (mail.getText().length()!= 0){
                yemail=(mail.getText().toString());
                editor.putString("mail", yemail);
                editor.apply();
                //uucost.setText(String.valueOf(ccost));
            }

            //String g="Dos";
            //g=String.valueOf(settings.getFloat("cost", 0));

            Toast.makeText(getApplicationContext(), yemail, Toast.LENGTH_LONG).show();


            //editor.putFloat("cost", ccost);

            //Intent intent = new Intent(this, Donations.class);
            //startActivity(intent);

            //SharedPreferences sett = getApplicationContext().getSharedPreferences("file", MODE_PRIVATE);
            //int number = sett.getInt("uno", 0);
            //Toast.makeText(getApplicationContext(), Integer.toString(number), Toast.LENGTH_LONG).show();

        }

    }

}
