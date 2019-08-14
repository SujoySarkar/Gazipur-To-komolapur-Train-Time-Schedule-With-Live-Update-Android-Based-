package vfdgcom.diuproject.semister.gazitffdfokomlalast;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Komlaputto_Gazipurtime extends AppCompatActivity {
    Button btn1,btn2,btn3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().setDisplayShowTitleEnabled(true);
        getSupportActionBar().setTitle("Select time");
        setContentView(R.layout.activity_komlaputto__gazipurtime);

        btn1=findViewById(R.id.komlatogazi1);
        btn2=findViewById(R.id.komlatogazi2);
        btn3=findViewById(R.id.komlatogazi3);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Komlaputto_Gazipurtime.this,Kom1st.class);
                startActivity(intent);
            }
        });


        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Komlaputto_Gazipurtime.this,Kom2nd.class);
                startActivity(intent);
            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Komlaputto_Gazipurtime.this,Kom3rd.class);
                startActivity(intent);
            }
        });
    }
}
