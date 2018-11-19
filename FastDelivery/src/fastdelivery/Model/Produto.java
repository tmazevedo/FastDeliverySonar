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
public class Produto {
    private String nome;
    private int codigo;
    private float preco;
    private String descricao;
    
    public Produto(String nome,int codigo,float preco,String descricao){
        this.codigo = codigo;
        this.nome = nome;
        this.preco = preco;
        this.descricao = descricao;
    }

    public String getNome() {
        return nome;
    }

    public int getCodigo() {
        return codigo;
    }

    public float getPreco() {
        return preco;
    }

    public String getDescricao() {
        return descricao;
    }

}
