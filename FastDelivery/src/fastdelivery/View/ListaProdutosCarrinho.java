/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fastdelivery.View;

import fastdelivery.Controller.ControllerItensEstoque;
import fastdelivery.Model.ItensEstoque;
import java.util.ArrayList;

/**
 *
 * @author Thiago
 */
public class ListaProdutosCarrinho {
    
    public void menu_list_produtos(){
        ArrayList<ItensEstoque> list = new ArrayList<>();
        ControllerItensEstoque control_estoque = new ControllerItensEstoque();
        list = control_estoque.list_products();
        int i;
        
        for(i=0;i<list.size();i++){
            System.out.println("O nome do produto:"+list.get(i).produto().getNome());
            System.out.println("Descricao do produto:"+list.get(i).produto().getDescricao());
            System.out.println("O preço do produto:"+list.get(i).produto().getPreco());
            System.out.println("Quantidade no Estoque:"+list.get(i).getQuantidade());
        }
        
    }
    
}
