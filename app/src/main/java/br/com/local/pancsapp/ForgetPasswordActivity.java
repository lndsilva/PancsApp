package br.com.local.pancsapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.google.android.material.appbar.MaterialToolbar;
import com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;


public class ForgetPasswordActivity extends AppCompatActivity {
    MaterialToolbar idToolBarForgetPassIcon;
    ExtendedFloatingActionButton FABCadastrarCliente;

    Snackbar snackbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.forget_password_layout);

        idToolBarForgetPassIcon = findViewById(R.id.idToolBarForgetPass);
        FABCadastrarCliente = findViewById(R.id.FABCadastrarCliente);

        FABCadastrarCliente.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                snackbar = Snackbar.make(v, "Cadastrado com sucesso", Snackbar.LENGTH_LONG)
                        .setAction("UNDO",
                                new View.OnClickListener() {
                                    @Override
                                    public void onClick(View v) {
                                        Toast.makeText(getApplicationContext(), "Apagando", Toast.LENGTH_SHORT).show();
                                    }
                                });
                snackbar.show();

            }
        });

        idToolBarForgetPassIcon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), LoginActivity.class));
            }
        });
    }
}