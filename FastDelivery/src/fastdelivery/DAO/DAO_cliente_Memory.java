/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fastdelivery.DAO;

import fastdelivery.DAO.DAO_cliente;
import fastdelivery.Model.cliente;
import java.util.ArrayList;

/**
 *
 * @author Thiago
 */
public class DAO_cliente_Memory implements DAO_cliente{
    
    static ArrayList<cliente> lista_cliente;
    
    @Override
    public void insert(cliente o) {
        lista_cliente.add(o);
    }

    @Override
    public void update(cliente o) {
        int i;
        
        for(i=0;i<lista_cliente.size();i++){
            if(lista_cliente.get(i).getCpf().equals(o.getCpf())){
                lista_cliente.set(i, o);
                break;
            }
        }
    }

    @Override
    public void delete(cliente o) {
        lista_cliente.remove(o);
    }

    @Override
    public cliente search(String o) {
        int i;
        int flag =0;
        for(i=0;i<lista_cliente.size();i++){
            if((lista_cliente.get(i).getCpf().equals(o))){
                return lista_cliente.get(i);
            }
        }
        return null;
    }
    
    public static ArrayList getInstance(){
        if(lista_cliente == null){
            lista_cliente = new ArrayList<>();
        }
        return lista_cliente;
    }
}
