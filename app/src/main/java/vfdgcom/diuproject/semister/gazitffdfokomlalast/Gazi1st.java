package vfdgcom.diuproject.semister.gazitffdfokomlalast;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class Gazi1st extends AppCompatActivity {
    PDFView pdfView1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().setDisplayShowTitleEnabled(true);
        getSupportActionBar().setTitle("3.38 a.m - 9.22 a.m");
        setContentView(R.layout.activity_gazi1st);
        pdfView1=findViewById(R.id.gazipdf1id);
        pdfView1.fromAsset("gazifir.pdf").load();
    }
}
