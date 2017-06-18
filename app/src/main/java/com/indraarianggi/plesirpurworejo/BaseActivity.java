package com.indraarianggi.plesirpurworejo;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.design.widget.NavigationView;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import android.widget.Toast;

public class BaseActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_base);
    }

    @Override
    public void setContentView(int layoutResID) {
        final DrawerLayout fullView = (DrawerLayout) getLayoutInflater().inflate(R.layout.activity_base, null);
        FrameLayout activityContainer = (FrameLayout) fullView.findViewById(R.id.activity_content);
        getLayoutInflater().inflate(layoutResID, activityContainer, true);
        super.setContentView(fullView);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);

        if (useToolbar()) {
            setSupportActionBar(toolbar);
            setTitle("Plesir Purworejo");
        } else {
            toolbar.setVisibility(View.GONE);
        }

        // menginisiasi DrawerLayout dan ActionBarToggle
        ActionBarDrawerToggle actionBarDrawerToggle = new ActionBarDrawerToggle(this, fullView, toolbar, R.string.drawer_open, R.string.drawer_close) {
            @Override
            public void onDrawerClosed(View drawerView) {
                super.onDrawerClosed(drawerView);
            }

            @Override
            public void onDrawerOpened(View drawerView) {
                super.onDrawerOpened(drawerView);
            }
        };

        // mensetting ActionBarToggle untuk DrawerLayout
        fullView.setDrawerListener(actionBarDrawerToggle);

        // memanggil syncstate
        actionBarDrawerToggle.syncState();


        // menginisiasi NavigationView
        NavigationView navigationView = (NavigationView) findViewById(R.id.navigation_view);

        // mengatur NavigationView Item yang akan dipanggil untuk menangani item klik menu navigasi
        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(MenuItem menuItem) {
                // memeriksa apakah item tersebut dalam keadaan dicek atau tidak
                if (menuItem.isChecked()) menuItem.setCheckable(false);
                else menuItem.setCheckable(true);

                // menutup drawer item klik
                fullView.closeDrawers();

                // memeriksa untuk melihat item yang akan diklik dan melakukan aksi
                switch (menuItem.getItemId()) {
                    case R.id.navigation1:
                        Intent intent1 = new Intent(getApplicationContext(), Home.class);
                        startActivity(intent1);
                        return true;
                    case R.id.navigation2:
                        Intent intent2 = new Intent(getApplicationContext(), Wisata.class);
                        startActivity(intent2);
                        return true;
                    case R.id.navigation3:
                        Intent intent3 = new Intent(getApplicationContext(), Kuliner.class);
                        startActivity(intent3);
                        return true;
                    case R.id.navigation4:
                        Intent intent4 = new Intent(getApplicationContext(), Budaya.class);
                        startActivity(intent4);
                        return true;
                    case R.id.navigation5:
                        AlertDialog.Builder info = new AlertDialog.Builder(BaseActivity.this);
                        info.setMessage("Indra Arianggi Suryaatmaja\n55414290\n3IA01").setCancelable(false).setPositiveButton("OK", new AlertDialog.OnClickListener() {
                            public void onClick(DialogInterface dialog, int id) {
                                dialog.cancel();
                            }
                        });
                        AlertDialog dialog = info.create();
                        dialog.setTitle("Aplikasi Dibuat Oleh");
                        dialog.show();
                        TextView textView = (TextView) dialog.findViewById(android.R.id.message);
                        textView.setTextSize(15);
                        return true;
                    default:
                        Toast.makeText(getApplicationContext(), "Kesalahan Terjadi ", Toast.LENGTH_SHORT).show();
                        return true;
                }
            }
        });
    }

    protected boolean useToolbar() {
        return true;
    }
    // Any activity that wants to opt out from having a toolbar just needs to override the useToolbar method and return false.

}
