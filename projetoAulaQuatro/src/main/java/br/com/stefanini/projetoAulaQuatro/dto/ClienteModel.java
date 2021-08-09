package br.com.stefanini.projetoAulaQuatro.dto;

import java.util.Date;

public class ClienteModel {

	private final Integer id;
	private final String nome;
	private final String email;
	private final String senha;
	private final java.util.Date dataCriacao;

	public ClienteModel(ClienteBuilder cliente) {
		this.id = cliente.id;
		this.nome = cliente.nome;
		this.email = cliente.email;
		this.senha = cliente.senha;
		this.dataCriacao = new Date();
	}

	public Integer getId() {
		return id;
	}

	public String getNome() {
		return nome;
	}

	public String getEmail() {
		return email;
	}

	public String getSenha() {
		return senha;
	}

	public java.util.Date getDataCriacao() {
		return dataCriacao;
	}

	public static class ClienteBuilder {
		private Integer id;
		private String nome;
		private String email;
		private String senha;
		private java.util.Date dataCriacao;

		public ClienteBuilder() {
		}

		public ClienteBuilder(String email, String senha) {
			this.email = email;
			this.senha = senha;
			this.setDataCriacao(new Date());
		}
		
		public ClienteBuilder setNome(String nome) {
			this.nome = nome;
			return this;
		}
		
		public ClienteBuilder setId(Integer id) {
			this.id = id;
			return this;
		}
		
		private void validacaoCliente() {
			if(this.id<=0) {
				throw new IllegalArgumentException("Id inválido");
			}else if (this.nome.length()<=2) {
				throw new IllegalArgumentException("Nome inválido");
			}else if (this.senha.length()<=5) {
				throw new IllegalArgumentException("Senha inválida");
			}
		}
		
		public ClienteModel build() {
			ClienteModel model = new ClienteModel(this);
			validacaoCliente();
			return model;
		}

		public java.util.Date getDataCriacao() {
			return dataCriacao;
		}

		public void setDataCriacao(java.util.Date dataCriacao) {
			this.dataCriacao = dataCriacao;
		}

	}

}
