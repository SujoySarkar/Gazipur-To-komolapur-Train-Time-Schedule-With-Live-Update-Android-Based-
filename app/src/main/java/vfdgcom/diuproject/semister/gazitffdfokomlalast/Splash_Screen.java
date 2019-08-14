package vfdgcom.diuproject.semister.gazitffdfokomlalast;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;

import java.util.Timer;
import java.util.TimerTask;


public class Splash_Screen extends AppCompatActivity {

    int Delay=3500;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getSupportActionBar().hide();
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);

        setContentView(R.layout.activity_splashscreen);

        Timer RunSplash= new Timer();
        TimerTask ShowSplash= new TimerTask() {
            @Override
            public void run() {
                finish();
                Intent intent=new Intent(Splash_Screen.this, Signin.class);
                startActivity(intent);

            }
        };
        RunSplash.schedule(ShowSplash,Delay);



    }
}
