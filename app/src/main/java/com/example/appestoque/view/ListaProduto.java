package com.example.appestoque.view;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.appestoque.R;
import com.example.appestoque.model.Produto;
import com.example.appestoque.persistence.ProdutoDao;

import java.util.ArrayList;

public class ListaProduto extends AppCompatActivity {
    ArrayList<Produto> produtoList = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_produto);

        produtoList = ProdutoDao.getBanco();


        RecyclerView recyclerView = findViewById(R.id.RecycleView_listaListaProdutos);
        AdapterListaProduto adaptador = new AdapterListaProduto(produtoList);
        recyclerView.setAdapter(adaptador);
      recyclerView.setLayoutManager(new GridLayoutManager(this,1));

    }
}