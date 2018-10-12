package com.firebaseapp.httpssteve_6925b.firstandroidapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    public Button resBut;
    public Button contactBut;
    public Button aboutBut;
    public Button projectsBut;

    public void initResBut(){
        resBut = (Button)findViewById(R.id.resume_button);
        resBut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent goToResume= new Intent(MainActivity.this,resume.class);
                startActivity(goToResume);
            }
        });
    }

    public void initContactBut(){
        contactBut = (Button)findViewById(R.id.contact_button);
        contactBut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent goToContact = new Intent(MainActivity.this,contact.class);
                startActivity(goToContact);
            }
        });
    }

    public void initaboutBut(){
        aboutBut = (Button)findViewById(R.id.about_button);
        aboutBut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent goToAbout = new Intent(MainActivity.this,aboutme.class);
                startActivity(goToAbout);
            }
        });
    }

    public void initProjectsBut(){
        projectsBut = (Button)findViewById(R.id.project_button);
        projectsBut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent goToProjects = new Intent(MainActivity.this,projects.class);
                startActivity(goToProjects);
            }
        });
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initResBut();
        initContactBut();
        initaboutBut();
        initProjectsBut();
    }
}
