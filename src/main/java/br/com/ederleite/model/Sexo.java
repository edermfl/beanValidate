package br.com.ederleite.model;

/**
 * Created by eml on 16/11/16.
 */
public enum Sexo {

    MASCULINO("Masculino"),
    FEMININO("Feminino");

    private String descricao;

    Sexo(String descricao) {
	this.descricao = descricao;
    }

    public String getDescricao() {
	return this.descricao;
    }

}