/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fastdelivery.DAO;

import fastdelivery.Model.ItensEstoque;
import java.util.ArrayList;

/**
 *
 * @author Thiago
 */
public class DAO_ItensEstoque_Memory implements DAO_ItensEstoque {

    public static ArrayList<ItensEstoque> lista_estoque;
    
    @Override
    public void insert(ItensEstoque o) {
      lista_estoque.add(o);
    }

    @Override
     public void update(ItensEstoque o) {
        int i;
        for(i =0;i<lista_estoque.size();i++){
            if(o.produto().getCodigo() == lista_estoque.get(i).produto().getCodigo()){
                lista_estoque.set(i, o);
                break;
            }
        }
    }

    @Override
    public void delete(ItensEstoque o) {
        lista_estoque.remove(o);
    }

    @Override
    public ItensEstoque search(int o) {
        int i;
        for(i =0;i<lista_estoque.size();i++){
            if(o == lista_estoque.get(i).produto().getCodigo()){
                return lista_estoque.get(i);
            }
        }
        return null;
    }
    
    public ArrayList<ItensEstoque> list_products(){
        
        return lista_estoque;
    }
    
    // Implementação do padrao de projeto Singleton;
        
    public static ArrayList getInstance(){
        if(lista_estoque == null){
            lista_estoque = new ArrayList<>();
        }
        return lista_estoque;
    }
    
}
