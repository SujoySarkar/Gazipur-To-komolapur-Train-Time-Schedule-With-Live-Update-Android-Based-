package vfdgcom.diuproject.semister.gazitffdfokomlalast;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class Gazi3rd extends AppCompatActivity {
    PDFView pdfView3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().setDisplayShowTitleEnabled(true);
        getSupportActionBar().setTitle("5.10 p.m - 8.38 p.m");
        setContentView(R.layout.activity_gazi3rd);
        pdfView3=findViewById(R.id.gazipdf3id);
        pdfView3.fromAsset("gazit.pdf").load();
    }
}
