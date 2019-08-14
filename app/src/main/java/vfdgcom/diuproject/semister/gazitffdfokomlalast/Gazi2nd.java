package vfdgcom.diuproject.semister.gazitffdfokomlalast;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class Gazi2nd extends AppCompatActivity {
    PDFView pdfView2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().setDisplayShowTitleEnabled(true);
        getSupportActionBar().setTitle("9.42 a.m - 4.40 p.m");
        setContentView(R.layout.activity_gazi2nd);
        pdfView2=findViewById(R.id.gazipdf2id);
        pdfView2.fromAsset("gazisec.pdf").load();
    }
}
