package br.com.stefanini.projetostruts.io;

import java.io.FileWriter;

import br.com.stefafani.projetostruts.entity.Pessoa;

public class PessoaFile implements IPessoaFile {
	
	FileWriter fileWriter;

	@Override
	public void open() throws Exception {
		fileWriter =  new FileWriter("c:/temp/strutsfile.txt", true);
		
	}

	@Override
	public void close() throws Exception {
		fileWriter.close();
		
	}

	@Override
	public void write(Pessoa pessoa) throws Exception {
		fileWriter.write(pessoa.getNome() + ";" + pessoa.getIdade()+ "\n");
		fileWriter.flush();
		
	}

	@Override
	public String read(Pessoa pessoa) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}
	
	

}
