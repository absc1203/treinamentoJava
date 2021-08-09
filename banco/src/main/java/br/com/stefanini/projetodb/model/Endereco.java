package br.com.stefanini.projetodb.model;

public class Endereco {
	
	private Integer idEndereco;
	private String bairro;
	private String cidade;
	private Usuario usuario;
	
	
	public Endereco() {
	}


	public Endereco(Integer idEndereco, String bairro, String cidade) {
		super();
		this.idEndereco = idEndereco;
		this.bairro = bairro;
		this.cidade = cidade;
	}


	@Override
	public String toString() {
		return "Endereco [idEndereco=" + idEndereco + ", bairro=" + bairro + ", cidade=" + cidade + "]";
	}


	public Integer getIdEndereco() {
		return idEndereco;
	}


	public void setIdEndereco(Integer idEndereco) {
		this.idEndereco = idEndereco;
	}


	public String getBairro() {
		return bairro;
	}


	public void setBairro(String bairro) {
		this.bairro = bairro;
	}


	public String getCidade() {
		return cidade;
	}


	public void setCidade(String cidade) {
		this.cidade = cidade;
	}


	public Usuario getUsuario() {
		return usuario;
	}


	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	
	
	
	

}
