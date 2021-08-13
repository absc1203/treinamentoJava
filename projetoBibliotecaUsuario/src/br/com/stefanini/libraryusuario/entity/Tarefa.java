package br.com.stefanini.libraryusuario.entity;

public class Tarefa {

	private Integer idTarefa;
	private String nomeTarefa;

	private Usuario usuario;

	public Tarefa() {
		// TODO Auto-generated constructor stub
	}

	public Tarefa(Integer idTarefa, String nomeTarefa, Usuario usuario) {
		super();
		this.idTarefa = idTarefa;
		this.nomeTarefa = nomeTarefa;
		this.usuario = usuario;
	}

	@Override
	public String toString() {
		return "Tarefa [idTarefa=" + idTarefa + ", nomeTarefa=" + nomeTarefa + ", usuario=" + usuario + "]";
	}

	public Integer getIdTarefa() {
		return idTarefa;
	}

	public void setIdTarefa(Integer idTarefa) {
		this.idTarefa = idTarefa;
	}

	public String getNomeTarefa() {
		return nomeTarefa;
	}

	public void setNomeTarefa(String nomeTarefa) {
		this.nomeTarefa = nomeTarefa;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

}
