package br.com.stefanini.treinamento.entity;

import java.util.Date;

public class Usuario {

	private Integer idUsuario;
	private String nome;
	private String email;
	private java.util.Date dataCriacao;
	
	private Endereco endereco;

	public Usuario() {
	}

	public Usuario(Integer idUsuario, String nome, String email, Date dataCriacao) {
		super();
		this.idUsuario = idUsuario;
		this.nome = nome;
		this.email = email;
		this.dataCriacao = dataCriacao;
	}

	@Override
	public String toString() {
		return "Usuario [idUsuario=" + idUsuario + ", nome=" + nome + ", email=" + email + ", dataCriacao="
				+ dataCriacao + "]";
	}

	public Integer getIdUsuario() {
		return idUsuario;
	}

	public void setIdUsuario(Integer idUsuario) {
		this.idUsuario = idUsuario;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public java.util.Date getDataCriacao() {
		return dataCriacao;
	}

	public void setDataCriacao(java.util.Date dataCriacao) {
		this.dataCriacao = dataCriacao;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}


}
