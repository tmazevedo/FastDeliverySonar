/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fastdelivery.View;

import fastdelivery.Controller.ControllerFornecedor;
import fastdelivery.Model.Fornecedor;
import java.util.Scanner;

/**
 *
 * @author Thiago
 */
public class FornecedorCadastro {
    
    void menu(){
        int opcao;
        String cnpj;
        Scanner entrada = new Scanner(System.in);
        Fornecedor fornecedor;
        ControllerFornecedor control = new ControllerFornecedor();
        String nome,telefone,rua,bairro,complemento;
        int numero;
        ProdutoFornecedor produto_fornecedor = new ProdutoFornecedor();
        
        System.out.println("Digite o CNPJ");
        cnpj = entrada.next();
        fornecedor = control.search(cnpj);
        
        if(fornecedor != null){
            produto_fornecedor.menu();
        }
        
        else{
            System.out.println("Digite o nome da empresa:");
            nome = entrada.next();
            System.out.println("Digite o telefone do Estabelecimento:");
            telefone = entrada.next();
            System.out.println("Digite o CNPJ do Estabelecimento:");
            cnpj = entrada.next();
            System.out.println("Digite o nome da sua rua:");
            rua = entrada.next();
            System.out.println("Digite o bairro:");
            bairro = entrada.next();
            System.out.println("Digite o numero do Apartamento/Casa:");
            numero = entrada.nextInt();
            System.out.println("Digite o Complemento");
            complemento = entrada.next();
            fornecedor = new Fornecedor(nome, telefone, cnpj, rua, bairro, numero, complemento);
            control.insert(fornecedor);
            System.out.println("Fornecedor Criado com Sucesso");
            produto_fornecedor.menu();
            
        }
        
        
    }
}
