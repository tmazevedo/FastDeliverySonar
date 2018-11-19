/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fastdelivery.View;
import fastdelivery.Controller.ControllerCliente;
import fastdelivery.DAO.DAO_cliente_Memory;
import fastdelivery.Model.cliente;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Thiago
 */
public class ClienteCadastro {
    
    void menu(){
        Scanner entrada = new Scanner(System.in);
        String cpf; // Informacoes especiais
        String nome; // Informacoes especiais
        String telefone; // Informacoes especiais
        String rua,complemento,bairro; // Endereco
        int numero; // Endereco
        ArrayList<cliente> lista_cliente = new ArrayList<cliente>();
        cliente cliente;
        ControllerCliente control_cliente = new ControllerCliente();
        ClientePedido cliente_pedido = new ClientePedido();
        
        System.out.println("Digite o seu CPF:");
        cpf = entrada.next();
        cliente = control_cliente.search(cpf);
        
        //Validar se o usuário existe no sistema
        
        if(cliente != null){
            System.out.println("nome:"+cliente.getNome());
            // verificar e ir para a parte de o cliente escolher os produtos
        } 
        else{
            System.out.println("Cliente não existente");
            System.out.println("--------------------------------------------------------");
            System.out.println("Digite o seu nome:");
            nome = entrada.next();
            System.out.println("Digite o telefone:");
            telefone = entrada.next();
            System.out.println("Digite o seu CPF:");
            cpf = entrada.next();
            System.out.println("Digite o nome da sua rua:");
            rua = entrada.next();
            System.out.println("Digite o bairro:");
            bairro = entrada.next();
            System.out.println("Digite o numero do Apartamento/Casa:");
            numero = entrada.nextInt();
            System.out.println("Digite o Complemento");
            complemento = entrada.next();
            cliente = new cliente(cpf,telefone,nome,rua,bairro,numero,complemento);
            control_cliente.insert(cliente);
            System.out.println("Cliente cadastrado com sucesso!");
            cliente_pedido.pedidoCliente();
        }
    
    }
   
   
    
}
