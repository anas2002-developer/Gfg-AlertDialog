package com.anas.gfgalertdialog;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity{

    Button btn1,btn2,btn3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn1=findViewById(R.id.btn1);
        btn2=findViewById(R.id.btn2);
        btn3=findViewById(R.id.btn3);

    }

    public void BTN1(View v){
        AlertDialog alert1=new AlertDialog.Builder(MainActivity.this).create();

        alert1.setTitle("Alert Dialog 1");
        alert1.setMessage("Alert Dialog with 1 Button");

        alert1.setButton(Dialog.BUTTON_NEGATIVE,"Yes", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                Toast.makeText(MainActivity.this,"Yes Clicked",Toast.LENGTH_SHORT).show();
            }
        });

        alert1.show();
    }

    public void BTN2(View v){
        AlertDialog.Builder alert2=new AlertDialog.Builder(MainActivity.this);

        alert2.setTitle("Alert Dialog 2");
        alert2.setMessage("Alert Dialog with 2 Buttons");

        alert2.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                Toast.makeText(MainActivity.this,"Yes Clicked",Toast.LENGTH_SHORT).show();
            }
        });

        alert2.setNegativeButton("No", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Toast.makeText(MainActivity.this,"No Clicked",Toast.LENGTH_SHORT).show();
            }
        });

        alert2.show();
    }

    public void BTN3(View v){

        AlertDialog.Builder alert3=new AlertDialog.Builder(MainActivity.this);

        alert3.setTitle("Alert Dialog 3");
        alert3.setMessage("Alert Dialog with 3 buttons");

        alert3.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                Toast.makeText(MainActivity.this,"Yes Clicked",Toast.LENGTH_SHORT).show();
                MainActivity.super.onBackPressed();
            }
        });

        alert3.setNegativeButton("No", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Toast.makeText(MainActivity.this,"No Clicked",Toast.LENGTH_SHORT).show();
            }
        });

        alert3.setNeutralButton("Cancel", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Toast.makeText(MainActivity.this,"Cancel Clicked",Toast.LENGTH_SHORT).show();
            }
        });

        alert3.show();

    }
}