package vfdgcom.diuproject.semister.gazitffdfokomlalast;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class GazitoKomlatime extends AppCompatActivity {
    Button btn1,btn2,btn3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().setDisplayShowTitleEnabled(true);
        getSupportActionBar().setTitle("Select time");
        setContentView(R.layout.activity_gazito_komlatime);

        btn1=findViewById(R.id.gazitokomtime1);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(GazitoKomlatime.this,Gazi1st.class);
                startActivity(intent);
            }
        });
        btn2=findViewById(R.id.gazitokomtime2);
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(GazitoKomlatime.this,Gazi2nd.class);
                startActivity(intent);
            }
        });


        btn3=findViewById(R.id.gazitokomtime3);

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(GazitoKomlatime.this,Gazi3rd.class);
                startActivity(intent);
            }
        });





    }
}
