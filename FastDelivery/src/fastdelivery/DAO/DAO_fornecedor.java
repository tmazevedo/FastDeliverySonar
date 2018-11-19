/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fastdelivery.DAO;

import fastdelivery.Model.Fornecedor;

/**
 *
 * @author Thiago
 */
public interface DAO_fornecedor {
     public void insert(Fornecedor o);
    public void update(Fornecedor o);
    public void delete(Fornecedor o);
    public Fornecedor search(String o);
}
