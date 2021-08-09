package br.com.stefanini.treinamento.dto;

import java.text.SimpleDateFormat;
import java.util.Date;

public class UsuarioResponse {

	private Integer idUsuario;
	private String nome;
	private java.util.Date dataCriacao;
	private String cep;

	public UsuarioResponse() {
	}

	public UsuarioResponse(Integer idUsuario, String nome, Date dataCriacao, String cep) {
		super();
		this.idUsuario = idUsuario;
		this.nome = nome;
		this.dataCriacao = dataCriacao;
		this.cep = cep;
	}

	@Override
	public String toString() {
		return  idUsuario + ", " + nome + ", " + new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(dataCriacao) + ", "	+ cep + "]";
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

	public java.util.Date getDataCriacao() {
		return dataCriacao;
	}

	public void setDataCriacao(java.util.Date dataCriacao) {
		this.dataCriacao = dataCriacao;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

}
