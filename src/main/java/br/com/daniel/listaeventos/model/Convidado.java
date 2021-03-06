package br.com.daniel.listaeventos.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity(name="convidados")
public class Convidado {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String nome;
	private String email;
	private String telefone;
		
	public Convidado() {}	

	public Convidado(String nome, String email, String telefone){
	    this.nome = nome;
	    this.email = email;
	    this.telefone = telefone;
	}
	
	public Long getId() {
		return id;
	}
	public String getNome() {
		return nome;
	}
	public String getEmail() {
		return email;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
}
