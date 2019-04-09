package com.asasfracas.ListaCompras;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class BancoProdutos extends SQLiteOpenHelper {

    private static final String NOME_BANCO = "listas-produtos";
    private static final int VERSAO_BANCO = 1;

    public BancoProdutos(Context context){
        super(context, NOME_BANCO, null, VERSAO_BANCO);
    }

    //criação do banco de produto
    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("CREATE TABLE IF NOT EXISTS anotacoes ( " +
                "  idProduto INTEGER NOT NULL PRIMARY KEY AUTOINCREMENT , " +
                "  produto TEXT , " +
                "  quantidade NUMBER , " +
                "  preco decimal  ) " );
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}

