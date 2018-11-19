/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fastdelivery.Model;

import java.util.ArrayList;

/**
 *
 * @author Thiago
 */
public class Estoque {
    
    private ArrayList<ItensEstoque> lista;
    
    
   public Estoque(ArrayList<ItensEstoque> lista){
       this.lista = new ArrayList<>();    
   } 

    public ArrayList<ItensEstoque> getLista() {
        return lista;
    }
   
    
}
