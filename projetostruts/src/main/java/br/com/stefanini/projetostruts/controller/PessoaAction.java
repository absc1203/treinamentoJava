package br.com.stefanini.projetostruts.controller;

import com.opensymphony.xwork2.ActionSupport;

import br.com.stefafani.projetostruts.entity.Pessoa;
import br.com.stefanini.projetostruts.io.IPessoaFile;
import br.com.stefanini.projetostruts.io.PessoaFile;

public class PessoaAction extends ActionSupport {

	private static final long serialVersionUID = 1L;
	
	private Pessoa pessoa;
	
	public PessoaAction() {
	pessoa = new Pessoa();
	}
	
	public String execute() {
		if(this.pessoa.getNome().equals("Belem") && this.pessoa.getIdade()> 18) {
			return "success";
		}else {
			return "error";
		}
	}
	
	public String gravar() {
		
		try {

			IPessoaFile arq = new PessoaFile();
			arq.open();
			arq.write(this.pessoa);
			arq.close();
			
			return "success";
		} catch (Exception e) {
			
			return "error";
		}
		
	}

	public Pessoa getPessoa() {
		return pessoa;
	}

	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}
	
	

}
