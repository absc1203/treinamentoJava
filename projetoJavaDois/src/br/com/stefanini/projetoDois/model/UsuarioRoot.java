package br.com.stefanini.projetoDois.model;

public class UsuarioRoot extends Usuario {

	private String acesso;
	private String status;

	public UsuarioRoot() {
	}

	public UsuarioRoot(Integer idUsuario, String nome, String email, String cpf, String acesso, String status) {
		super(idUsuario, nome, email, cpf);
		this.acesso = acesso;
		this.status = status;
	}

	@Override
	public String toString() {
		return "UsuarioRoot [acesso=" + acesso + ", status=" + status + "]";
	}

	public String getAcesso() {
		return acesso;
	}

	public void setAcesso(String acesso) {
		this.acesso = acesso;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Override
	public void gerarCriptografia() {
		// TODO Auto-generated method stub
		
	}

}
