package com.example.r.bookcalculator;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;
import android.widget.Toast;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Apertura extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_apertura);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_apertura, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        int id = item.getItemId();
        TextView tv1 = (TextView) findViewById(R.id.editText62);
        TextView tv2 = (TextView) findViewById(R.id.editText63);
        TextView tv3 = (TextView) findViewById(R.id.editText64);
        TextView tv4 = (TextView) findViewById(R.id.editText65);
        TextView tv5 = (TextView) findViewById(R.id.editText66);
        TextView tv6 = (TextView) findViewById(R.id.editText67);
        TextView tv7 = (TextView) findViewById(R.id.editText68);

        TextView tv8 = (TextView) findViewById(R.id.editText69);
        TextView tv9 = (TextView) findViewById(R.id.editText70);
        TextView tv10 = (TextView) findViewById(R.id.editText71);
        TextView tv11 = (TextView) findViewById(R.id.editText72);
        TextView tv12 = (TextView) findViewById(R.id.editText73);
        TextView tv13 = (TextView) findViewById(R.id.editText74);
        TextView tv14 = (TextView) findViewById(R.id.editText75);

        //noinspection SimplifiableIfStatement
        if (id == R.id.save) {

            SharedPreferences sett = getApplicationContext().getSharedPreferences("file", MODE_PRIVATE);


            String date = new SimpleDateFormat("yyyy_MM_dd").format(new Date());

            int counter = sett.getInt("counter", 0);

            if(counter>0)
            {
                counter++;
            }
            else if(counter <=0){counter=1;}

            if (counter >999){counter=0;}

            SharedPreferences.Editor editor = sett.edit();
            editor.putInt("counter", counter);
            editor.apply();

            //float totall=donn+ttotal;
            //totalg.setText(String.valueOf(totall));



            int u1=0;
            int u2=0;
            int u3=0;
            int u4=0;
            int u5=0;
            int u6=0;
            int u7=0;
            int u8=0;

            int u9=0;
            int u10=0;
            int u11=0;
            int u12=0;
            int u13=0;
            int u14=0;

            if (tv1.getText().length()  != 0){u1=Integer.parseInt(tv1.getText().toString());}
            if (tv2.getText().length()  != 0){u2=Integer.parseInt(tv2.getText().toString());}
            if (tv3.getText().length()  != 0){u3=Integer.parseInt(tv3.getText().toString());}
            if (tv4.getText().length()  != 0){u4=Integer.parseInt(tv4.getText().toString());}
            if (tv5.getText().length()  != 0){u5=Integer.parseInt(tv5.getText().toString());}
            if (tv6.getText().length()  != 0){u6=Integer.parseInt(tv6.getText().toString());}
            if (tv7.getText().length() != 0){u7=Integer.parseInt(tv7.getText().toString());}
            if (tv8.getText().length() != 0){u8=Integer.parseInt(tv8.getText().toString());}

            if (tv9.getText().length()  != 0){u9=Integer.parseInt(tv9.getText().toString());}
            if (tv10.getText().length()  != 0){u10=Integer.parseInt(tv10.getText().toString());}
            if (tv11.getText().length()  != 0){u11=Integer.parseInt(tv11.getText().toString());}
            if (tv12.getText().length()  != 0){u12=Integer.parseInt(tv12.getText().toString());}
            if (tv13.getText().length()  != 0){u13=Integer.parseInt(tv13.getText().toString());}
            if (tv14.getText().length()  != 0){u14=Integer.parseInt(tv14.getText().toString());}


            int number = sett.getInt("uno", 0);
            u1=u1+number;
            number = sett.getInt("dos", 0);
            u2=u2+number;
            number = sett.getInt("tres", 0);
            u3=u3+number;
            number = sett.getInt("cuatro", 0);
            u4=u4+number;
            number = sett.getInt("cinco", 0);
            u5=u5+number;
            number = sett.getInt("seis", 0);
            u6=u6+number;
            number = sett.getInt("jfc", 0);
            u7=u7+number;
            number = sett.getInt("pre", 0);
            u8=u8+number;

            number = sett.getInt("tuno", 0);
            u9=u9+number;
            number = sett.getInt("tdos", 0);
            u10=u10+number;
            number = sett.getInt("ttres", 0);
            u11=u11+number;
            number = sett.getInt("tcuatro", 0);
            u12=u12+number;
            number = sett.getInt("tcinco", 0);
            u13=u13+number;
            number = sett.getInt("tseis", 0);
            u14=u14+number;

            SharedPreferences settings = getApplicationContext().getSharedPreferences("file", MODE_PRIVATE);

            editor.putInt("uno",     u1);
            editor.putInt("dos",     u2);
            editor.putInt("tres",    u3);
            editor.putInt("cuatro",  u4);
            editor.putInt("cinco",   u5);
            editor.putInt("seis",    u6);
            editor.putInt("jfc",     u7);
            editor.putInt("pre",     u8);
            editor.putInt("tuno",    u9);
            editor.putInt("tdos",    u10);
            editor.putInt("ttres",   u11);
            editor.putInt("tcuatro", u12);
            editor.putInt("tcinco", u13);
            editor.putInt("tseis", u14);

            editor.apply();

            Toast.makeText(getApplicationContext(), "Guardado", Toast.LENGTH_LONG).show();

            String body=" [Apertura]: "+ date +"\n"+"\n"+
                    "Fecha: "+date+"\n"+
                    "--------------------------------------"+"\n"+
                    "LEB 1:     "+"\t"+u1+"   \n"+
                    "LEB 2:     "+"\t"+u2+"   \n"+
                    "LEB 3:     "+"\t"+u3+"   \n"+
                    "LEB 4:     "+"\t"+u4+"   \n"+
                    "LEB 5:     "+"\t"+u5+"   \n"+
                    "LEB 6:     "+"\t"+u6+"   \n"+
                    "GPB 1:    "+"\t"+u9+"   \n"+
                    "GPB 2:    "+"\t"+u10+"   \n"+
                    "GPB 3:    "+"\t"+u11+"   \n"+
                    "GPB 4:    "+"\t"+u12+"   \n"+
                    "GPB 5:    "+"\t"+u13+"   \n"+
                    "GPB 6:    "+"\t"+u14+"   \n"+
                    "JFC:       "+"\t"+u7+"   \n"+
                    "PRES:     "+"\t"+u8+"   \n"+

                    "\n"+"\n"
                    ;

            Intent i = new Intent(Intent.ACTION_SEND);
            i.setType("message/rfc822");
            i.putExtra(Intent.EXTRA_EMAIL, new String[]{sett.getString("mail","email address")});
            i.putExtra(Intent.EXTRA_SUBJECT, "Apertura: "+"" +" "+date);
            i.putExtra(Intent.EXTRA_TEXT, body);
            try {
                startActivity(Intent.createChooser(i, "Enviar email..."));
                finish();
            } catch (android.content.ActivityNotFoundException ex) {
                Toast.makeText(getApplicationContext(), "No hay app de email instalada.", Toast.LENGTH_SHORT).show();
            }

            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
