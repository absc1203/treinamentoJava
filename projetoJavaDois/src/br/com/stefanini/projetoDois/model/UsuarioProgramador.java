package br.com.stefanini.projetoDois.model;

public class UsuarioProgramador extends Usuario {

	private Integer nivelPermissao;

	public UsuarioProgramador() {
	}

	public UsuarioProgramador(Integer idUsuario, String nome, String email, String cpf, Integer nivelPermissao) {
		super(idUsuario, nome, email, cpf);
		this.nivelPermissao = nivelPermissao;
	}

	@Override
	public String toString() {
		return "UsuarioProgramador [nivelPermissao=" + nivelPermissao + "]";
	}

	public Integer getNivelPermissao() {
		return nivelPermissao;
	}

	public void setNivelPermissao(Integer nivelPermissao) {
		this.nivelPermissao = nivelPermissao;
	}

	@Override
	public void gerarCriptografia() {
		// TODO Auto-generated method stub
		
	}

}
