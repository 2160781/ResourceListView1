package com.example.android_resource;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menudeopciones,menu);

        return true  ;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {

        switch (item.getItemId()){

            case R.id.mQRCODE:
                Intent anterior = new Intent(this, Q_R_CODE.class);
                startActivity(anterior);
                return true;

            case R.id.mVOZ:
                Intent anterior11 = new Intent(this,AtivaRechonecimentoVoz.class);
                startActivity(anterior11);
                break;
            case R.id.mTarefas:
                Intent anterior21 = new Intent(this, ListView.class);
                startActivity(anterior21);
                return true;
        }

        return super.onOptionsItemSelected(item);
    }
}