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
public class Fornecedor {
    
    private String nomeEstabelecimento;
    private String telefone;
    private String cnpj;
    private Endereco endereco;

    public Fornecedor(String nomeEstabelecimento, String telefone, String cnpj,String rua,String bairro,int numero,String complemento) {
        this.nomeEstabelecimento = nomeEstabelecimento;
        this.telefone = telefone;
        this.cnpj = cnpj;
        this.endereco = new Endereco(rua, bairro, complemento, numero);
    }

    public String getNomeEstabelecimento() {
        return nomeEstabelecimento;
    }

    public String getTelefone() {
        return telefone;
    }

    public String getCnpj() {
        return cnpj;
    }

    
}
