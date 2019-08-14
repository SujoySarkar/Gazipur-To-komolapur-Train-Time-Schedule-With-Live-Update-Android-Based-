package vfdgcom.diuproject.semister.gazitffdfokomlalast;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class Kom1st extends AppCompatActivity {
    PDFView pdfView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().setDisplayShowTitleEnabled(true);
        getSupportActionBar().setTitle("4.45 a.m - 8.15 a.m");
        setContentView(R.layout.activity_kom1st);
        pdfView=findViewById(R.id.kom1stpdf);
        pdfView.fromAsset("komfir.pdf").load();
    }
}
