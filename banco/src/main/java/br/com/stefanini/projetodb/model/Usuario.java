package br.com.stefanini.projetodb.model;

import java.math.BigInteger;
import java.security.MessageDigest;

public class Usuario {

	private Integer idUsuario;
	private String nome;
	private String email;
	private String senha;
	private String uuId;

	private Endereco endereco;

	public Usuario() {
	}

	public Usuario(Integer idUsuario, String nome, String email, String senha, String uuId) {
		super();
		this.idUsuario = idUsuario;
		this.nome = nome;
		this.email = email;
		this.senha = senha;
		this.uuId = uuId;
	}

	@Override
	public String toString() {
		return "Usuario [idUsuario=" + idUsuario + ", nome=" + nome + ", email=" + email + ", senha=" + senha
				+ ", uuId=" + uuId + "]";
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

	public String getUuId() {
		return uuId;
	}

	public void setUuId(String uuId) {
		this.uuId = uuId;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	public void gerarCriptografia() throws Exception {

		String chave = "profesonbelem@gmail.com;www.blogedonbelem.com.@=1=1";
		MessageDigest md5 = MessageDigest.getInstance("MD5");
		this.setSenha(this.getSenha() + chave);
		byte[] messageDigest = md5.digest(this.senha.getBytes());
		BigInteger no = new BigInteger(1, messageDigest);
		String hashText = no.toString();
		while (hashText.length() < 32) {
			hashText = "0" + hashText;
		}
		this.setSenha(hashText);
	}

}
