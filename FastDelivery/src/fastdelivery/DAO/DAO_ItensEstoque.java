/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fastdelivery.DAO;

import fastdelivery.Model.ItensEstoque;

/**
 *
 * @author Thiago
 */
public interface DAO_ItensEstoque {
    
    public void insert(ItensEstoque o);
    public void update(ItensEstoque o);
    public void delete(ItensEstoque o);
    public ItensEstoque search(int o); // Fazer busca de um produto
    
}
