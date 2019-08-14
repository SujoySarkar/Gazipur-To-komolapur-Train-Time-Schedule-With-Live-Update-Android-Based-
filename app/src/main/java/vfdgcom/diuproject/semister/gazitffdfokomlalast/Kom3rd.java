package vfdgcom.diuproject.semister.gazitffdfokomlalast;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class Kom3rd extends AppCompatActivity {
    PDFView pdfView3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().setDisplayShowTitleEnabled(true);
        getSupportActionBar().setTitle("6.00 p.m - 12.50 p.m");
        setContentView(R.layout.activity_kom3rd);
        pdfView3=findViewById(R.id.kom3rdpdf);
        pdfView3.fromAsset("komthi.pdf").load();
    }
}
