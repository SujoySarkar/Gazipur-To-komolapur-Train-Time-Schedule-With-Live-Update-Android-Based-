package vfdgcom.diuproject.semister.gazitffdfokomlalast;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class Kom2nd extends AppCompatActivity {
    PDFView pdfView2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().setDisplayShowTitleEnabled(true);
        getSupportActionBar().setTitle("10.00 a.m - 5.20 p.m");
        setContentView(R.layout.activity_kom2nd);
        pdfView2=findViewById(R.id.kom2ndpdf);
        pdfView2.fromAsset("komsec.pdf").load();

    }
}
