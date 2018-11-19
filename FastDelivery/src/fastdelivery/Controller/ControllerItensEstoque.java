/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fastdelivery.Controller;

import fastdelivery.DAO.DAO_ItensEstoque_Memory;
import fastdelivery.Model.ItensEstoque;
import java.util.ArrayList;

/**
 *
 * @author Thiago
 */
public class ControllerItensEstoque {
    
    private DAO_ItensEstoque_Memory dao = new DAO_ItensEstoque_Memory();
    
    public void insert(ItensEstoque o){
        dao.insert(o);
    }
    
    public void delete(ItensEstoque o){
        dao.delete(o);
    }
    
    public void update(ItensEstoque o){
        dao.update(o);
    }
    
    public ItensEstoque search(int o){
        return dao.search(o);
    }
    
    public ArrayList<ItensEstoque> list_products(){
        
        return dao.list_products();
    }
    
}
