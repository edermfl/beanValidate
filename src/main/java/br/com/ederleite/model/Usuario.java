package br.com.ederleite.model;

import org.hibernate.validator.constraints.NotBlank;
import org.hibernate.validator.constraints.br.CPF;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 * Created by eml on 16/11/16.
 */
public class Usuario {
    @NotBlank(message = "Nome � obrigat�rio")
    private String nome;

    @CPF(message = "CPF inv�lido")
    private String cpf;

    @NotNull(message = "Informe o sexo")
    private Sexo sexo;

    @NotNull(message = "Idade � obrigat�ria")
    @Min(value = 18, message = "Idade deve ser maior ou igual que 18")
    private Integer idade;

    @Size(max = 50, message = "A observa��o n�o pode ter mais que 50 caracteres")
    private String observacao;

    public String getNome() {
	return nome;
    }

    public void setNome(String nome) {
	this.nome = nome;
    }

    public String getCpf() {
	return cpf;
    }

    public void setCpf(String cpf) {
	this.cpf = cpf;
    }

    public Sexo getSexo() {
	return sexo;
    }

    public void setSexo(Sexo sexo) {
	this.sexo = sexo;
    }

    public Integer getIdade() {
	return idade;
    }

    public void setIdade(Integer idade) {
	this.idade = idade;
    }

    public String getObservacao() {
	return observacao;
    }

    public void setObservacao(String observacao) {
	this.observacao = observacao;
    }

}
