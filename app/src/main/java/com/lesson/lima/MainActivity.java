package com.lesson.lima;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button buttonOrder;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonOrder = (Button)findViewById(R.id.buttonOrder);

        buttonOrder.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, TerimaKasih.class);
                startActivity(i);


            }
        });




    }






   /* public void submitOrder(View view){

      int nilai = 10;
      // display tidak di pakai
      //display( nilai);

        //Intent intent = new Intent(MainActivity.this, TerimaKasih.class);
        //startActivity(intent);




    }*/


    public void display( int nilai){

        String keterangan = "";

        TextView jumlah = (TextView)findViewById(R.id.jumlah);

      /*  if(nilai > 80) {
            //Executes when the Boolean expression is true
            keterangan = "NILAI A";
        }else if( nilai < 80 && nilai > 41){

                keterangan = "NILAI B";
        }else{
            //Executes when the Boolean expression is false
            keterangan = "NILAI C";
        }*/

       /* if(nilai <= 100 && nilai >= 80) {
            //Executes when the Boolean expression is true
            keterangan = "NILAI A";
        }else if( nilai < 79 && nilai >= 41){

            keterangan = "NILAI B";
        }else{
            //Executes when the Boolean expression is false
            keterangan = "NILAI C";
        }*/


       /* for(int i=0; i<9; i++){
            nilai += 1;
        }*/



        while( nilai < 20 ) {
            keterangan += "value of x : " + nilai +"\n" ;
            nilai++;

        }





        // jumlah.setText(keterangan + nilaiTampil);
        jumlah.setText(keterangan);

    }


}
