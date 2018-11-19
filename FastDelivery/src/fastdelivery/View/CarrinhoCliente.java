/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fastdelivery.View;

import fastdelivery.Controller.ControllerItensEstoque;
import fastdelivery.Model.ItensEstoque;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Thiago
 */
public class CarrinhoCliente {
    
    public void menu_carrinho(){
        int opcao,opcao_carrinho,cod_produto,i;
        Scanner entrada = new Scanner(System.in);
        ListaProdutosCarrinho listProdutos = new ListaProdutosCarrinho();
        ArrayList<Integer> list_carrinho = new ArrayList<>();
        ControllerItensEstoque control = new ControllerItensEstoque();
        float valor_total = 0;
        ItensEstoque produto;
        
        do{
            System.out.println("1 - Adicionar produtos no carrinho");
            System.out.println("2 - Ir ao carrinho");
            System.out.println("3 - Finalizar pedido");
            opcao = entrada.nextInt();
            
            switch(opcao){
                case 1:
                    listProdutos.menu_list_produtos();
                    do{
                        System.out.println("1 - Digite o codigo do produto:");
                        System.out.println("2 - Finalizar o pedido:");
                        opcao_carrinho = entrada.nextInt();
                        if(opcao_carrinho == 1){
                            System.out.println("Digite o código:");
                            cod_produto = entrada.nextInt();
                            if(control.search(cod_produto) != null){
                                list_carrinho.add(cod_produto);
                            }
                        }
                    }while(opcao_carrinho !=2);
                    break;
                case 2:
                    System.out.println("PRODUTOS NO CARRINHO:");
                    for(i=0;i<list_carrinho.size();i++){
                        produto = control.search(list_carrinho.get(i));
                        System.out.println("Nome do produto:"+produto.produto().getNome());
                        System.out.println("Descricao do Produto:"+produto.produto().getDescricao());
                        System.out.println("Preço:"+produto.produto().getPreco());
                        System.out.println("Código do produto:"+produto.produto().getCodigo());
                        valor_total = valor_total + produto.produto().getPreco();
                    }
                    System.out.println("Valor total dos produtos carrinho ficou de "+valor_total);
                    break;
                case 3:
                    System.out.println("O valor total a pagar é de "+valor_total);
                    System.out.println("Muito Obrigado por escolher a Fast Delivery, um abaraço!!! :]");
                    System.exit(0);
            }
        }while(opcao != 4);
    }
    
}
