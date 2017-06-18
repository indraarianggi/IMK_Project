package com.indraarianggi.plesirpurworejo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class Home extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
    }

    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.profil :
                Intent intent1 = new Intent(getApplicationContext(), ProfilPurworejo.class);
                startActivity(intent1);
                break;
            case R.id.wisata :
                Intent intent2 = new Intent(getApplicationContext(), Wisata.class);
                startActivity(intent2);
                break;
            case R.id.kuliner :
                Intent intent3 = new Intent(getApplicationContext(), Kuliner.class);
                startActivity(intent3);
                break;
            case R.id.budaya :
                Intent intent4 = new Intent(getApplicationContext(), Budaya.class);
                startActivity(intent4);
                break;
            default:
                Toast.makeText(getApplicationContext(), "Terjadi Kesalahan", Toast.LENGTH_SHORT).show();
        }
    }
}
