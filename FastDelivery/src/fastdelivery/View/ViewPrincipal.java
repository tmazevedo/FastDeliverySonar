/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fastdelivery.View;
import java.util.Scanner;

/**
 *
 * @author Thiago
 */
public class ViewPrincipal {
    
    public void menu_principal(){
    ClienteCadastro view_cliente = new ClienteCadastro(); 
    FornecedorCadastro view_fornecedo = new FornecedorCadastro();
    int opcao;
    Scanner entrada = new Scanner(System.in);
     
     do{
         System.out.println("--------------------------------------------------------");
         System.out.println("-----------------------1 - CLIENTE----------------------");
         System.out.println("-----------------------2 - FORNECEDOR--------------------");
         System.out.println("-----------------------3 - SAIR--------------------------");
         System.out.println("--------------------------------------------------------");
         
         System.out.println("Digite a opção desejada:");
         opcao = entrada.nextInt();
         
         switch(opcao){
             case 1:
                 view_cliente.menu();
                 break;
             case 2:
                 view_fornecedo.menu();
                 
                 
         }
     
     }while(opcao != 3 || opcao == 3);
    }
}
