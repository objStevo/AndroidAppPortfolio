package com.firebaseapp.httpssteve_6925b.firstandroidapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class resume extends AppCompatActivity {

    PDFView resume;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resume);

        resume=(PDFView) findViewById(R.id.pdfresume);
        resume.fromAsset("resume.pdf").load();
    }
}
