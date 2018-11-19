/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fastdelivery.Controller;

import fastdelivery.DAO.DAO_cliente;
import fastdelivery.DAO.DAO_cliente_Memory;
import fastdelivery.Model.cliente;

/**
 *
 * @author Thiago
 */
public class ControllerCliente {
    
    private DAO_cliente dao = new DAO_cliente_Memory();
    
    public ControllerCliente(){
    }
    
    public void insert(cliente o){
        dao.insert(o);
    }
    
    public void update(cliente o){
        dao.update(o);
    }
    
    public void delete(cliente o){
        dao.delete(o);
    }
    
    public cliente search(String o){
        return dao.search(o);
    }
    
}
