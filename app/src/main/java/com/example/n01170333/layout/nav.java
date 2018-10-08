package com.example.n01170333.layout;

import android.support.annotation.NonNull;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;


public class nav extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {
    private DrawerLayout drawer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nav);

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        drawer = findViewById(R.id.drawer_layout);
        NavigationView navigationView = findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);

        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(this, drawer, toolbar,
                R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

        /* will auto load welcome fragment*/

       if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, new welcome()).commit();

           /* will auto select nav item*/
            /*navigationView.setCheckedItem(R.id.nav_patient1);*/
        }


    }


/* switch between fragments if selected*/
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {
            case R.id.nav_patient1:
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,
                        new Patient1()).commit();
                break;
            case R.id.nav_patient2:
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,
                        new Patient2()).commit();
                break;
            case R.id.nav_patient3:
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,
                        new Patient3()).commit();
                break;
            case R.id.nav_patient4:
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,
                        new Patient4()).commit();
                break;

        }


        drawer.closeDrawer(GravityCompat.START);
        return true;
    }


    @Override
    public void onBackPressed() {
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }


}
