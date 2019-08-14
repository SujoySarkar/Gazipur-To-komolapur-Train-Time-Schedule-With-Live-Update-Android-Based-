package vfdgcom.diuproject.semister.gazitffdfokomlalast;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;


import android.view.View;

import androidx.appcompat.app.AppCompatDelegate;
import androidx.core.view.GravityCompat;
import androidx.appcompat.app.ActionBarDrawerToggle;

import android.view.MenuItem;

import com.google.android.material.navigation.NavigationView;

import androidx.drawerlayout.widget.DrawerLayout;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;


import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.Switch;

public class Navigation_Sujoy extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    Button btn6,btn3,btn4,btn5,btn1,btn2;
    Switch aSwitch;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_navigation__sujoy);
        Toolbar toolbar = findViewById(R.id.toolbar);
        //for switch
        aSwitch=findViewById(R.id.switchid3);
        aSwitch.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked){

                    getDelegate().setLocalNightMode(AppCompatDelegate.MODE_NIGHT_YES);

                }else{
                    getDelegate().setLocalNightMode(AppCompatDelegate.MODE_NIGHT_NO);
                }
            }
        });



        //for button


        btn1=findViewById(R.id.homebtn1);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Navigation_Sujoy.this,GazitoKomlatime.class);
                startActivity(intent);
            }
        });



        btn3=findViewById(R.id.homebtn3);
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Navigation_Sujoy.this,Update_time.class);
                startActivity(intent);
            }
        });






        btn4=findViewById(R.id.homebtn4);
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent=new Intent(Navigation_Sujoy.this,SmsSUjoy.class);
                startActivity(intent);

            }
        });







        btn5=findViewById(R.id.homebtn5);
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.facebook.com/groups/gdtpf/"));
                startActivity(intent);

            }
        });








        btn6=findViewById(R.id.homebtn6);
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Navigation_Sujoy.this,MainActivity.class);
                startActivity(intent);
            }
        });
        btn2=findViewById(R.id.homebtn2);
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Navigation_Sujoy.this,Komlaputto_Gazipurtime.class);
                startActivity(intent);
            }
        });







        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("Home");
        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Navigation_Sujoy.this,HelpACti.class);
                startActivity(intent);
            }
        });
        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        NavigationView navigationView = findViewById(R.id.nav_view);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();
        navigationView.setNavigationItemSelectedListener(this);
    }







    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.nav_homesujoy)
        {

        }
        else if (id == R.id.nav_aboutsujoy)
        {
            Intent intent=new Intent(Navigation_Sujoy.this,Aboutacti.class);
            startActivity(intent);

        }
        else if (id == R.id.nav_helpsujoy)
        {
            Intent intent = new Intent(Navigation_Sujoy.this,HelpACti.class);
            startActivity(intent);

        }
        else if (id == R.id.nav_sharesujoy)
        {
            Intent fab=new Intent();
            fab.setAction(Intent.ACTION_SEND);
            fab.putExtra(Intent.EXTRA_TEXT,"www.google.com");
            fab.setType("text/plain");
            startActivity(Intent.createChooser(fab,"Share Via"));
        }
        else if (id == R.id.nav_callsujoy)
        {
            Intent callintent=new Intent(Intent.ACTION_DIAL);
            callintent.setData(Uri.parse("tel:01616368112"));
            startActivity(callintent);

        }



        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;

    }
}
