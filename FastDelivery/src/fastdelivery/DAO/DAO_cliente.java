/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fastdelivery.DAO;

import fastdelivery.Model.cliente;

/**
 *
 * @author Thiago
 */
public interface DAO_cliente {
    
    public void insert(cliente o);
    public void update(cliente o);
    public void delete(cliente o);
    public cliente search(String o);
}
