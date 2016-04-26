package br.com.locadora.noturno.entidade;

import javax.persistence.*;
import javax.validation.constraints.NotNull;


@Entity
public class Usuario {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Short idUsuario;
	
	@NotNull(message="Informe o e-mail")
	private String email;
	
	@NotNull(message="Informe a senha")
	private String senha;
	
	
	//Get's e Set's

	public Short getIdUsuario() {
		return idUsuario;
	}

	public String getEmail() {
		return email;
	}

	public String getSenha() {
		return senha;
	}

	public void setIdUsuario(Short idUsuario) {
		this.idUsuario = idUsuario;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}
	
	

}
