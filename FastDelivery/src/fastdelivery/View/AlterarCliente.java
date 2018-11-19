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
public class AlterarCliente {
    
    public void menu_alterar_cliente(){
        Scanner entrada = new Scanner(System.in);
        ControllerCliente control_cliente = new ControllerCliente();
        cliente cliente;
        String cpf;
        
        System.out.println("Digite o seu CPF:");
        cpf = entrada.next();
        if(control_cliente.search(cpf) != null){
            System.out.println("Digite o seu nome:");
            String nome = entrada.next();
            System.out.println("Digite o telefone:");
            String telefone = entrada.next();
            System.out.println("Digite o nome da sua rua:");
            String rua = entrada.next();
            System.out.println("Digite o bairro:");
            String bairro = entrada.next();
            System.out.println("Digite o numero do Apartamento/Casa:");
            int numero = entrada.nextInt();
            System.out.println("Digite o Complemento");
            String complemento = entrada.next();
            cliente  = new cliente(cpf, telefone, nome, rua, bairro, numero, complemento);
            control_cliente.update(cliente);
            System.out.println("Cliente Alterado com Sucesso!");
        }
        else{
            System.out.println("Não existe um cliente com este CPF!");
        }
    }
    
}
