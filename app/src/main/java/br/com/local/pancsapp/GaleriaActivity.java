package br.com.local.pancsapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;

import com.google.android.material.appbar.MaterialToolbar;

public class GaleriaActivity extends AppCompatActivity {
    MaterialToolbar idToolBarGaleria;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.galeria_layout);

        idToolBarGaleria = findViewById(R.id.idToolBarGaleria);

        idToolBarGaleria.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(), MenuActivity.class));
            }
        });
    }
}