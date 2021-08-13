package br.com.stefanini.manytomany.persistence;

import java.util.ArrayList;
import java.util.List;

import br.com.stefanini.manytomany.entity.Tarefa;

public class TarefaDAO extends DAO {
	
public List<Tarefa> findAllTarefa() throws Exception{
		
		open();
		stmt = con.prepareStatement("select idTarefa, nomeTarefa, dataCriacao from tarefa");
		rs = stmt.executeQuery();
		List<Tarefa> lista = new ArrayList<>();
		while(rs.next()) {
			Tarefa tarefa = new Tarefa();
			tarefa.setIdTarefa(rs.getInt(1));
			tarefa.setNomeTarefa(rs.getString(2));
			lista.add(tarefa);
		}
		
		close();
		return lista;
	}

}
