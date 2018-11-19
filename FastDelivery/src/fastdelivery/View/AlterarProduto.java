/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fastdelivery.View;

import fastdelivery.Controller.ControllerItensEstoque;
import fastdelivery.Model.ItensEstoque;
import fastdelivery.Model.Produto;
import java.util.Scanner;

/**
 *
 * @author Thiago
 */
public class AlterarProduto {
    
    public void menu_alterarProduto(){
        Scanner entrada = new Scanner(System.in);
        int codigo_produto,qtd;
        String nome,descricao;
        float preco;
        ControllerItensEstoque control_estoque = new ControllerItensEstoque();
        Produto produto;
        ItensEstoque itens_estoque;
        
        
        System.out.println("Digite o codigo do produto:");
        codigo_produto = entrada.nextInt();
        if(control_estoque.search(codigo_produto) != null){
            System.out.println("Digite o nome do novo produto:");
            nome = entrada.next();
            System.out.println("Digite a nova descrição do produto:");
            descricao = entrada.next();
            System.out.println("Digite o novo preco do produto:");
            preco = entrada.nextFloat();
            System.out.println("Digite a nova quantidade deste produto:");
            qtd = entrada.nextInt();
            produto = new Produto(nome, codigo_produto, preco, descricao);
            itens_estoque = new ItensEstoque(qtd, produto);
            control_estoque.update(itens_estoque);
        }
        else{
            System.out.println("Não existe um produto com este código!");
        }
        
        
    }
}
