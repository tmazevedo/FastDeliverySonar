/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fastdelivery.View;

import fastdelivery.Controller.ControllerItensEstoque;
import fastdelivery.Model.ItensEstoque;
import java.util.Scanner;

/**
 *
 * @author Thiago
 */
public class ProdutoFornecedor {
    
    public void menu(){
        
        Scanner entrada = new Scanner(System.in);
        int opcao,cod;
        AdicionarProduto add_produto = new AdicionarProduto();
        ControllerItensEstoque control_ItensEstoque = new ControllerItensEstoque();
        AlterarProduto alterarProduto = new AlterarProduto();
        ItensEstoque itens_estoque;
        
        
        do{
            System.out.println("1 - Adicionar novo produto");
            System.out.println("2 - Alterar um produto");
            System.out.println("3 - Visualizar valor investido de um produto");
            System.out.println("4 - Visualizar o valor investido de todos os produtos");
            System.out.println("5 - Voltar para a tela anterior");
            opcao = entrada.nextInt();
            switch(opcao){
                case 1:
                    add_produto.menu_add_produto();
                    break;
                case 2:
                    alterarProduto.menu_alterarProduto();
                    break;
                case 3:
                    System.out.println("Digite o codigo do produto:");
                    cod = entrada.nextInt();
                    itens_estoque = control_ItensEstoque.search(cod);
                    if(itens_estoque != null){
                        System.out.println("Valor investivo do produto: "+ itens_estoque.produto().getCodigo()+",foi de R$"+itens_estoque.getValorInvestido_Produto(cod));
                    }
                    else{
                        System.out.println("Não existe um produto com este codigo!");
                    }
                    break;
                case 4:
                    //Pedir para listar todos valores de produtos e quantidades e fazer o somatorio depois.
                     
            }
        }while(opcao != 5);
    }
    
}
