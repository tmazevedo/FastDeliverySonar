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
public class Endereco {
    private String rua;
    private String bairro;
    private String complemento;
    private int numero;

    public Endereco(String rua, String bairro, String complemento, int numero) {
        this.rua = rua;
        this.bairro = bairro;
        this.complemento = complemento;
        this.numero = numero;
    }
    
    public String getRua() {
        return rua;
    }
    
    public String getBairro() {
        return bairro;
    }

    public String getComplemento() {
        return complemento;
    }
    
    public int getNumero() {
        return numero;
    }
    
}
