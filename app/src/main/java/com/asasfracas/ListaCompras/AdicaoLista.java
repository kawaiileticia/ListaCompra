package com.asasfracas.ListaCompras;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class AdicaoLista extends AppCompatActivity {

    private EditText etnovaLista;
    private Button salvarLista;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.adicao_lista);

        etnovaLista= (EditText) findViewById(R.id.etnovaLista);
        salvarLista = (Button) findViewById(R.id.salvarLista);

        //envia para a tela de listas
        salvarLista.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                salvar();

            }
        });
    }

    private void salvar (){
        ListaCompra lista = new ListaCompra();
        lista.setNovaLista(etnovaLista.getText().toString());
        this.finish();

    }
}

