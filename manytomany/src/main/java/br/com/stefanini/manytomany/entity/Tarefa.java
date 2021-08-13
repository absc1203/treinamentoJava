package br.com.stefanini.manytomany.entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Tarefa implements Serializable {
	private static final long serialVersionUID = 1L;

	private Integer idTarefa;
	private String nomeTarefa;
	private java.util.Date dataCriacao;

	private List<Funcionario> funcionarios;

	public Tarefa() {

	}

	public Tarefa(Integer idTarefa, String nomeTarefa, Date dataCriacao, List<Funcionario> funcionarios) {
		super();
		this.idTarefa = idTarefa;
		this.nomeTarefa = nomeTarefa;
		this.dataCriacao = dataCriacao;
		this.funcionarios = funcionarios;
	}

	
	

	@Override
	public String toString() {
		return "Tarefa (idTarefa=" + idTarefa + ", nomeTarefa=" + nomeTarefa + ", dataCriacao=" + dataCriacao + ")";
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

	public java.util.Date getDataCriacao() {
		return dataCriacao;
	}

	public void setDataCriacao(java.util.Date dataCriacao) {
		this.dataCriacao = dataCriacao;
	}

	public List<Funcionario> getFuncionarios() {
		return funcionarios;
	}

	public void setFuncionarios(List<Funcionario> funcionarios) {
		this.funcionarios = funcionarios;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	public void addFuncionario(Funcionario funcionarios) {
		if(this.funcionarios==null) {
			this.funcionarios = new ArrayList<Funcionario>();
		}
		this.funcionarios.add(funcionarios);
		
		
	}
	

}
