package br.com.stefanini.projetoAulaQuatro.dto.response;

public class ResponseCliente {
	
	private String nome;
	private String email;
	private String numero;
	
	public ResponseCliente() {
	
	}

	public ResponseCliente(String nome, String email, String numero) {
		super();
		this.nome = nome;
		this.email = email;
		this.numero = numero;
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

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}
	
	

}
