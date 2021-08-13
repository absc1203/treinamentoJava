package br.com.stefanini.exercicioTres.entity;

public class Cliente {

	private Integer idCliente;
	private String nomeCliente;
	private String email;
	private String senha;

	public Cliente() {

	}

	public Cliente(Integer idCliente, String nomeCliente, String email, String senha) {
		super();
		this.idCliente = idCliente;
		this.nomeCliente = nomeCliente;
		this.email = email;
		this.senha = senha;
	}

	public Cliente(String nomeCliente, String email, String senha) {
		super();
		this.nomeCliente = nomeCliente;
		this.email = email;
		this.senha = senha;
	}

	@Override
	public String toString() {
		return "Cliente [idCliente=" + idCliente + ", nomeCliente=" + nomeCliente + ", email=" + email + ", senha="
				+ senha + "]";
	}

	public Integer getIdCliente() {
		return idCliente;
	}

	public void setIdCliente(Integer idCliente) {
		this.idCliente = idCliente;
	}

	public String getNomeCliente() {
		return nomeCliente;
	}

	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

}
