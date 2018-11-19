/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fastdelivery.View;

import fastdelivery.Controller.ControllerCliente;
import fastdelivery.Model.cliente;
import java.util.Scanner;

/**
 *
 * @author Thiago
 */
public class ClientePedido {
    
    public void pedidoCliente(){
        
        Scanner entrada = new Scanner(System.in);
        int opcao;
        cliente cliente;
        ControllerCliente control_cliente = new ControllerCliente();
        String cpf;
        AlterarCliente alt_cliente = new AlterarCliente();
        do{
        System.out.println("1 - Perfil");
        System.out.println("2 - Alterar Dados");
        System.out.println("3 - Listar pedidos do cardápio");
        System.out.println("4 - Voltar para a tela anterior");
        opcao = entrada.nextInt();
        
        switch(opcao){
            case 1:
                System.out.println("Digite o seu CPF:");
                cpf = entrada.next();
                cliente = control_cliente.search(cpf);
                System.out.println("Nome: "+cliente.getNome());
                System.out.println("CPF: "+cliente.getCpf());
                System.out.println("Telefone "+cliente.getTelefone());
                break;
            case 2:
                alt_cliente.menu_alterar_cliente();
                break;
            case 3:
                
                
                
        }
        
        }while(opcao!= 4);
        
    }
    
}
