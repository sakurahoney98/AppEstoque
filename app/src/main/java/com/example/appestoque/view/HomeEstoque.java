package com.example.appestoque.view;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.appestoque.R;
import com.example.appestoque.model.Produto;
import com.example.appestoque.persistence.ProdutoDao;

import java.util.ArrayList;

public class HomeEstoque extends AppCompatActivity {
    ArrayList<Produto> produtoList = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_estoque);

        produtoList = ProdutoDao.getBanco();

        RecyclerView recyclerView = findViewById(R.id.RecycleView_homeListaEstoque);
        AdapterHomeEstoque adaptador = new AdapterHomeEstoque(produtoList);
        recyclerView.setAdapter(adaptador);
        recyclerView.setLayoutManager(new GridLayoutManager(this, 2));


    }

    public void sendToRealizarVenda (View view){
        Intent chamada = new Intent(this, RealizarVenda.class);
        startActivity(chamada);
    }

    public void sendToAdicionarEstoque(View view){
        Intent chamada = new Intent(this, AdicionarEstoque.class);
        startActivity(chamada);
    }
}