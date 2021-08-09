package br.com.stefanini.projetoDois.model;

public abstract class Usuario {

	private Integer idUsuario;
	private String nome;
	private String email;
	private String cpf;
	private String senha;

	public Usuario() {
	}

	public Usuario(Integer idUsuario, String nome, String email, String cpf) {
		super();
		this.idUsuario = idUsuario;
		this.nome = nome;
		this.email = email;
		this.cpf = cpf;
	}

	@Override
	public String toString() {
		return "Usuario [idUsuario=" + idUsuario + ", nome=" + nome + ", email=" + email + ", cpf=" + cpf + "]";
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

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}
	
	public abstract void gerarCriptografia();

}
