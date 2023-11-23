package br.com.local.pancsapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.google.android.material.appbar.MaterialToolbar;
import com.google.android.material.card.MaterialCardView;

public class MenuActivity extends AppCompatActivity {
    MaterialCardView idCardGaleria;
    MaterialToolbar idToolBarMenu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu_layout);

        idCardGaleria = findViewById(R.id.idCardGaleria);
        idToolBarMenu = findViewById(R.id.idToolBarMenu);

        idCardGaleria.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(), GaleriaActivity.class));
            }
        });

        idToolBarMenu.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), LoginActivity.class));
            }
        });
    }
}