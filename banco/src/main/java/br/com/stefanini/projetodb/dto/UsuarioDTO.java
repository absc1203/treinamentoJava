package br.com.stefanini.projetodb.dto;

public class UsuarioDTO {
	
	private Integer id;
	private String nome;
	private String email;
	private String bairro;
	private String cidade;
	
	public UsuarioDTO() {
	}

	public UsuarioDTO(Integer id, String nome, String email, String bairro, String cidade) {
		super();
		this.id = id;
		this.nome = nome;
		this.email = email;
		this.bairro = bairro;
		this.cidade = cidade;
	}

	@Override
	public String toString() {
		return "UsuarioDTO [id=" + id + ", nome=" + nome + ", email=" + email + ", bairro=" + bairro + ", cidade="
				+ cidade + "]";
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
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

}
