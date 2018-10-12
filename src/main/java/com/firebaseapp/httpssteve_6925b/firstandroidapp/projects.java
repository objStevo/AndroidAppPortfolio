package com.firebaseapp.httpssteve_6925b.firstandroidapp;

import android.content.Intent;
import android.media.Image;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class projects extends AppCompatActivity {

    public ImageButton webDevButton;
    public ImageButton androidDevButton;
    public ImageButton matlabDevButton1;
    public ImageButton matlabDevButton2;
    public ImageButton matlabDevButton3;
    public ImageButton matlabDevButton4;
    public ImageButton matlabDevButton5;
    public ImageButton ctciDevButton;

    public void initButtons (){
        webDevButton = (ImageButton)findViewById(R.id.webButton);
        androidDevButton = (ImageButton)findViewById(R.id.androidButton);
        matlabDevButton1 = (ImageButton)findViewById(R.id.matButton1);
        matlabDevButton2 = (ImageButton)findViewById(R.id.matButton2);
        matlabDevButton3 = (ImageButton)findViewById(R.id.matButton3);
        matlabDevButton4 = (ImageButton)findViewById(R.id.matButton4);
        matlabDevButton5 = (ImageButton)findViewById(R.id.matButton5);
        ctciDevButton = (ImageButton)findViewById(R.id.ctciButton);

        webDevButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent linkwebdev = new Intent(Intent.ACTION_VIEW, Uri.parse("https://steve-6925b.firebaseapp.com"));
                startActivity(linkwebdev);
            }
        });

        androidDevButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent linkandroid = new Intent(Intent.ACTION_VIEW,Uri.parse("google.com"));
                startActivity(linkandroid);
            }
        });

        matlabDevButton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent linkmat1 = new Intent(Intent.ACTION_VIEW, Uri.parse("https://github.com/objStevo/Applied-Mathematics/tree/master/Project1-128A"));
                startActivity(linkmat1);
            }
        });

        matlabDevButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent linkmat2 = new Intent(Intent.ACTION_VIEW, Uri.parse("https://github.com/objStevo/Applied-Mathematics/tree/master/Project2-128A"));
                startActivity(linkmat2);
            }
        });
        matlabDevButton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent linkmat3 = new Intent(Intent.ACTION_VIEW, Uri.parse("https://github.com/objStevo/Applied-Mathematics/tree/master/Project%201-128B"));
                startActivity(linkmat3);
            }
        });
        matlabDevButton4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent linkmat4 = new Intent(Intent.ACTION_VIEW, Uri.parse("https://github.com/objStevo/Applied-Mathematics/tree/master/Project%202-128B"));
                startActivity(linkmat4);
            }
        });
        matlabDevButton5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent linkmat5 = new Intent(Intent.ACTION_VIEW, Uri.parse("https://github.com/objStevo/MATLAB-Programming"));
                startActivity(linkmat5);
            }
        });
        ctciDevButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent linkctci = new Intent(Intent.ACTION_VIEW, Uri.parse("https://github.com/objStevo/CTCI"));
                startActivity(linkctci);
            }
        });



    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_projects);
        initButtons();
    }
}
