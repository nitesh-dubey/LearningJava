package com.nitesh.dubey.learningjava;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    private EditText edttxt1;
    private TextView txt1;
    private TextView txtview;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edttxt1 = findViewById(R.id.edttxt1);
        txt1 = findViewById(R.id.txt1);
        txtview = findViewById(R.id.txtview);



        }

        public void btnClick(View Textview){
        txtview.setText("Here You GO");

         int x = Integer.valueOf(edttxt1.getText().toString());
         String s = "";
         for(int i = 0;i<15;i++){

             s = s + x + " * " + (i+1) + " = " + (x*(i+1) +"") + "\n";

         }

         txt1.setText(s);


        }


}
