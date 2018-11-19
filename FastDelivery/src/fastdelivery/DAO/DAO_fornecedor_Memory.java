/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fastdelivery.DAO;

import fastdelivery.Model.Fornecedor;
import java.util.ArrayList;

/**
 *
 * @author Thiago
 */
public class DAO_fornecedor_Memory implements DAO_fornecedor{

    static ArrayList<Fornecedor> list_fornecedor;
    
    public DAO_fornecedor_Memory(){
    }
    
    @Override
    public void insert(Fornecedor o) {
        list_fornecedor.add(o);
        
    }

    @Override
    public void update(Fornecedor o) {
        int i;
        for(i=0;i<list_fornecedor.size();i++){
            if(list_fornecedor.get(i).getCnpj().equals(o)){
                list_fornecedor.set(i, o);
                break;
            }
        }
    }

    @Override
    public void delete(Fornecedor o) {
        list_fornecedor.remove(o);
    }

    @Override
    public Fornecedor search(String o) {
       int i;
        int flag =0;
        for(i=0;i<list_fornecedor.size();i++){
            if((list_fornecedor.get(i).getCnpj().equals(o))){
                return list_fornecedor.get(i);
            }
        }
        return null;
    }
    
    public static ArrayList getInstance(){
        if(list_fornecedor == null){
            list_fornecedor = new ArrayList<>();
        }
        return list_fornecedor;
    }
    
    
    
}
