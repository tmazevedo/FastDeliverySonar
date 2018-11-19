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
public class ItensVenda {
    
    public float getValor(int codigo){
        ArrayList <Produto> Lista = new ArrayList<>(); // Lebrar de chamar o controler e colocar todos os objetos dentro do Array
        float preco=0;
        int flag = 0;
        
        for(int x =0 ;x<Lista.size();x++){
            if(codigo == Lista.get(x).getCodigo()){
                preco = Lista.get(x).getPreco();
                flag =1;
                break;
            }
        }
        if(flag == 1){
            return preco;
        }
        else{
            throw new NullPointerException();
        }
    }
   
    
}
