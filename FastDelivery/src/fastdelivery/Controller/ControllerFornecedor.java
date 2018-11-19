/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fastdelivery.Controller;

import fastdelivery.DAO.DAO_fornecedor_Memory;
import fastdelivery.Model.Fornecedor;

/**
 *
 * @author Thiago
 */
public class ControllerFornecedor {
    private DAO_fornecedor_Memory dao = new DAO_fornecedor_Memory();
    
    public void insert(Fornecedor o){
        dao.insert(o);
    }
    
    public void update(Fornecedor o){
        dao.update(o);
    }
    
    public void delete(Fornecedor o){
        dao.delete(o);
    }
    
    public Fornecedor search(String o){
        return dao.search(o);
    }
    
}
