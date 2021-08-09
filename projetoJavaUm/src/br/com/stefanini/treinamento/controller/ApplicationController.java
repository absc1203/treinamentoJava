package br.com.stefanini.treinamento.controller;

import java.util.Date;

import br.com.stefanini.treinamento.dto.UsuarioRequest;
import br.com.stefanini.treinamento.dto.UsuarioResponse;
import br.com.stefanini.treinamento.entity.Endereco;
import br.com.stefanini.treinamento.entity.Usuario;

public class ApplicationController {

	private Usuario usuario;
	private Endereco endereco;
	private UsuarioRequest request;
	private UsuarioResponse response;

	// inicializando um usuário e um endereço
	public void init() {
		this.usuario = new Usuario(100, "jose", "jose@gmail.com", new Date());
		this.endereco = new Endereco(200, "Rua a", "centro", "Rio de Janeiro", "RJ", "28000100");
	}

	//recebendo dados enviados (usuario e endereço)
	public UsuarioRequest requestUsuario() {
		this.request = new UsuarioRequest(this.usuario, this.endereco);
		return this.request;
	}

	public ApplicationController() {
		this.init();
	}

	//resposta com os dados pedidos
	public UsuarioResponse mostraDadosUsuario(UsuarioRequest request) {
		this.response = new UsuarioResponse();
		this.response.setIdUsuario(this.request.getUsuario().getIdUsuario());
		this.response.setNome(this.request.getUsuario().getNome());
		this.response.setDataCriacao(this.request.getUsuario().getDataCriacao());
		this.response.setCep(this.request.getEndereco().getCep());
		
		return response;
	}
	
	public static void main(String[] args) {
		
		ApplicationController applicationController = new ApplicationController();
		
		System.out.println(applicationController.mostraDadosUsuario(applicationController.requestUsuario()));
	}

}
