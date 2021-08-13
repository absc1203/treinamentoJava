package br.com.stefanini.manytomany.entity;

import java.io.Serializable;
import java.util.List;
import java.util.Objects;

public class Funcionario implements Serializable, Comparable<Funcionario> {
	private static final long serialVersionUID = 1L;
	
	
	private Integer idFuncionario;
	private String nomeFuncionario;
	private List<Tarefa> tarefas;
	
	public Funcionario() {
	
	}

	public Funcionario(Integer idFuncionario) {
		super();
		this.idFuncionario = idFuncionario;
	}

	public Funcionario(Integer idFuncionario, String nomeFuncionario) {
		super();
		this.idFuncionario = idFuncionario;
		this.nomeFuncionario = nomeFuncionario;
	}

	public Funcionario(Integer idFuncionario, String nomeFuncionario, List<Tarefa> tarefas) {
		super();
		this.idFuncionario = idFuncionario;
		this.nomeFuncionario = nomeFuncionario;
		this.tarefas = tarefas;
	}

	@Override
	public String toString() {
		return "Funcionario (idFuncionario=" + idFuncionario + ", nomeFuncionario=" + nomeFuncionario + ")";
	}

	public Integer getIdFuncionario() {
		return idFuncionario;
	}

	public void setIdFuncionario(Integer idFuncionario) {
		this.idFuncionario = idFuncionario;
	}

	public String getNomeFuncionario() {
		return nomeFuncionario;
	}

	public void setNomeFuncionario(String nomeFuncionario) {
		this.nomeFuncionario = nomeFuncionario;
	}

	public List<Tarefa> getTarefas() {
		return tarefas;
	}

	public void setTarefas(List<Tarefa> tarefas) {
		this.tarefas = tarefas;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public int compareTo(Funcionario funcionario) {
		return this.idFuncionario.compareTo(funcionario.getIdFuncionario());
	}

	@Override
	public int hashCode() {
		return Objects.hash(idFuncionario);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Funcionario other = (Funcionario) obj;
		return Objects.equals(idFuncionario, other.idFuncionario);
	}
	
	
	
	
	
	
 
}
