package com.example.appestoque.persistence;

import com.example.appestoque.model.Produto;

import java.util.ArrayList;

public class ProdutoDao {

    private static ArrayList<Produto> banco = new ArrayList<>();

    public static boolean adicionar (Produto produto){
        boolean codigoDuplicado = false;
    for(Produto p: banco){
        if(p.getCodigo().equalsIgnoreCase(produto.getCodigo())){
            codigoDuplicado = true;
            break;
        }
    }
        if(!codigoDuplicado){
        banco.add(produto);
        return true;
    }
    else{
        return false;
    }


    }

    public static ArrayList<Produto> getBanco(){

        return banco;
    }



}
