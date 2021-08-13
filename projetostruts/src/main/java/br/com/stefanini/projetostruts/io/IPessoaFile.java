package br.com.stefanini.projetostruts.io;

import br.com.stefafani.projetostruts.entity.Pessoa;

public interface IPessoaFile {
	
	public void open() throws Exception;
	
	public void close() throws Exception;
	
	public void write(Pessoa pessoa) throws Exception;
	
	public String read(Pessoa pessoa) throws Exception;

}
