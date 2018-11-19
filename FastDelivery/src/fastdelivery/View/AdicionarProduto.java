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
public class AdicionarProduto {
    
    public void menu_add_produto(){
        Scanner entrada = new Scanner(System.in);
        int codigo_produto,estoque;
        String nome,descricao;
        float preco;
        Produto produto;
        ItensEstoque item_estoque;
        ControllerItensEstoque control = new ControllerItensEstoque();
        
        System.out.println("Digite o nome do produto:");
        nome = entrada.next();
        System.out.println("Digite o codigo do produto:");
        codigo_produto = entrada.nextInt();
        if(control.search(codigo_produto) == null){
            System.out.println("Digite a descriçao do produto");
            descricao = entrada.next();
            System.out.println("Digite o preco do produto:");
            preco = entrada.nextFloat();
            produto = new Produto(nome,codigo_produto,preco,descricao);
            System.out.println("Digite a quantidade desse produto em estoque:");
            estoque = entrada.nextInt();
            item_estoque = new ItensEstoque(estoque, produto);
            control.insert(item_estoque);
        }
        else{
            System.out.println("Já existe um produto com este código!");
        }
    }
    
}
