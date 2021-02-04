package com.example;

import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.drawerlayout.widget.DrawerLayout;

import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.LinearLayout;


import com.example.pepperfry.R;
import com.google.android.material.navigation.NavigationView;

public class NavigationActivity extends AppCompatActivity {
    private DrawerLayout drawer;
    private LinearLayout linearLayout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notification);

        drawer=(DrawerLayout) findViewById(R.id.drawer);
        linearLayout=(LinearLayout) findViewById(R.id.line1);
        Toolbar toolbar=(Toolbar)findViewById(R.id.Toolbar);
        setSupportActionBar(toolbar);

        Window window=getWindow();
        window.setFlags(WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS, WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS);

        NavigationView navigationView=findViewById(R.id.nav_view);
        ActionBarDrawerToggle toggle=new ActionBarDrawerToggle(this,drawer,toolbar,R.string.navigation_drawer_open,R.string.navigation_drawer_close){
            @Override
            public void onDrawerSlide(View drawerView, float slideOffset) {
                super.onDrawerSlide(drawerView, slideOffset);
                float slidex=drawerView.getWidth()*slideOffset;
                linearLayout.setTranslationX(slidex);
            }
        };
        drawer.addDrawerListener(toggle);
        toggle.syncState();
    }
}