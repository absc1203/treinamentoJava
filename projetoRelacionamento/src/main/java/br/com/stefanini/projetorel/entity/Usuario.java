package br.com.stefanini.projetorel.entity;

import java.io.Serializable;

public abstract class Usuario  implements Serializable{
 	private static final long serialVersionUID = 1L;
  //transformar a classe Objeto ...
 	
 	private Long id;
 	private String nome;
 	private String email;
 	private String senha;
 	public Usuario() {
		// TODO Auto-generated constructor stub
	}
 	
	public Usuario(Long id, String nome, String email, String senha) {
		super();
		this.id = id;
		this.nome = nome;
		this.email = email;
		this.senha = senha;
	}

	@Override
	public String toString() {
		return "Usuario [id=" + id + ", nome=" + nome + ", email=" + email + ", senha=" + senha + "]";
	}

	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
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
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
 	
 	
	
	 
}
