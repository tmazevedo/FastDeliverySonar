/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fastdelivery.Model;


/**
 *
 * @author Thiago
 */
public class ItensEstoque {
    private int quantidade;
    private Produto produto;

    
    public ItensEstoque(int quantidade,Produto produto){
        this.quantidade = quantidade;
        this.produto = produto;
    }
    
    
    public int getQuantidade() {
        return quantidade;
    }
    
    public Produto produto(){
        return produto;
    }
    
    public float getValorInvestido_Produto(int codigo_estoque){
        float valor = 0;
        float valor_Investido;
        int flag=0;
        
        valor_Investido =  produto.getPreco() * getQuantidade();
        return valor_Investido;
    }
}
