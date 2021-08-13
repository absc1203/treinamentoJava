package br.com.stefanini.libraryusuario.entity;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class Usuario {

	private Integer idUsuario;
	private String nome;
	private String uuId;
	private String email;
	private String senha;
	private String status;

	private List<Tarefa> tarefas;

	{
		this.uuId = UUID.randomUUID().toString();
	}

	public Usuario() {
	}

	public Usuario(Integer idUsuario, String nome, String uuId, String email, String senha, String status) {
		super();
		this.idUsuario = idUsuario;
		this.nome = nome;
		this.uuId = uuId;
		this.email = email;
		this.senha = senha;
		this.status = status;
	}

	public Usuario(String email, String senha) {
		super();
		this.email = email;
		this.senha = senha;
	}

	@Override
	public String toString() {
		return "Usuario [idUsuario=" + idUsuario + ", nome=" + nome + ", uuId=" + uuId + ", email=" + email + ", senha="
				+ senha + ", status=" + status + "]";
	}

	public Integer getIdUsuario() {
		return idUsuario;
	}

	public void setIdUsuario(Integer idUsuario) {
		this.idUsuario = idUsuario;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getUuId() {
		return uuId;
	}

	public void setUuId(String uuId) {
		this.uuId = uuId;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public List<Tarefa> getTarefas() {
		return tarefas;
	}

	public void setTarefas(List<Tarefa> tarefas) {
		this.tarefas = tarefas;
	}

	public void adicionar(Tarefa tarefa) {
		if (tarefas == null) {
			this.tarefas = new ArrayList<Tarefa>();
		}

		this.tarefas.add(tarefa);
	}

	public void gerarCriptografia() throws Exception {
		
		String chave = "profedsonbelem@gmail.com;www.blogedsonbelem.com.@=1=1;*123+;";
		MessageDigest md5 = MessageDigest.getInstance("MD5");
		this.setSenha(this.getSenha() + chave);
		byte[] messageDigest = md5.digest(this.senha.getBytes());
		BigInteger no = new BigInteger(1, messageDigest);
		String hashText = no.toString(16);
		while (hashText.length() < 32) {
			hashText = "0" + hashText;
		}
		
		String chave2 = "profedsonbelem@gmail.com;www.blogedsonbelem.com.@=1=1;*123+;";
		MessageDigest md52 = MessageDigest.getInstance("MD5");
		this.setSenha("continuacao" + chave2);
		byte[] messageDigest2 = md52.digest(this.senha.getBytes());
		BigInteger no2 = new BigInteger(1, messageDigest2);
		String hashText2 = no2.toString(16);
		while (hashText2.length() < 32) {
			hashText2 = "0" + hashText2;
		}
		
		String chave3 = "profedsonbelem@gmail.com;www.blogedsonbelem.com.@=1=1;*123+;";
		MessageDigest md53 = MessageDigest.getInstance("MD5");
		this.setSenha("fim" + chave3);
		byte[] messageDigest3 = md53.digest(this.senha.getBytes());
		BigInteger no3 = new BigInteger(1, messageDigest3);
		String hashText3 = no3.toString(16);
		while (hashText3.length() < 32) {
			hashText3 = "0" + hashText3;
		}
		
		this.setSenha(hashText + hashText2 + hashText3);
	}

}
