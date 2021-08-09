package br.com.stefanini.treinamento.dto;

import br.com.stefanini.treinamento.entity.Endereco;
import br.com.stefanini.treinamento.entity.Usuario;

public class UsuarioRequest {

	private Usuario usuario;
	private Endereco endereco;

	public UsuarioRequest() {
	}

	public UsuarioRequest(Usuario usuario, Endereco endereco) {
		super();
		this.usuario = usuario;
		this.endereco = endereco;
	}

	@Override
	public String toString() {
		return "UsuarioRequest [usuario=" + usuario + ", endereco=" + endereco + "]";
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

}
