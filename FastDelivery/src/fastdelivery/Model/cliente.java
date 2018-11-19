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
public class cliente extends Pessoa {
    
    
        private Pessoa pessoa;
        private String cpf;
        private Endereco endereco;
        
        public cliente(String cpf,String telefone,String nome,String rua,String bairro,int numero,String complemento){ // Contrutor ele serve para quando cria o objeto criea automaticamente esses atriburos e tem que passar esses atributos por parametro
            cpf = this.cpf;
            pessoa.setTelefone(telefone);
            pessoa.setNome(nome);
            endereco = new Endereco(rua,bairro,complemento,numero);
            
            
        }
        
        //Aqui nos get e setters tem alguns que nao precisamos mas eu nao sei qual que precisa agente fala com TJ para tirar a dúvida

    public String getCpf() {
        return cpf;
    }
   
}
