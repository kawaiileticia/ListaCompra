package com.asasfracas.ListaCompras;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class AdicaoProdutos extends AppCompatActivity {

    private EditText etProduto, etPreco, etQuantidade;
    private Button btnSalvar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.adicao_produtos);

        etProduto = (EditText) findViewById(R.id.etProduto);
        etQuantidade = (EditText) findViewById(R.id.etQuantidade);
        etPreco = (EditText) findViewById(R.id.etPreco);
        btnSalvar = (Button) findViewById(R.id.btnSalvar);

        btnSalvar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                salvar();
            }
        });
    }

    private void salvar (){
        Produto item = new Produto();
        item.setProduto(etProduto.getText().toString());
        item.setPreco(etPreco.getText().toString());
        item.setQuantidade(etQuantidade.getText());
        this.finish();

}
}
