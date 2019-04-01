package com.asasfracas.ListaCompras;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText novaLista;
    private Button buttonSalvar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    novaLista = (EditText) findViewById(R.id.etnovaLista);
    buttonSalvar = (Button) findViewById(R.id.salvarLista);

    buttonSalvar.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            salvar();
        }
    });

    private void salvar (){
        ListaCompra item = new ListaCompra();
        item.setNovaLista(etnovaLista.getText().toString());
        this.finish();

    }


}
