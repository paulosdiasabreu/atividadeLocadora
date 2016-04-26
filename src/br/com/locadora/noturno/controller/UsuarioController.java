package br.com.locadora.noturno.controller;

import javax.faces.application.FacesMessage;
import javax.faces.bean.*;
import javax.faces.context.FacesContext;

import br.com.locadora.noturno.entidade.*;
import br.com.locadora.noturno.dao.*;
import javax.ejb.*;
import java.util.*;
import br.com.locadora.noturno.util.*;

@ManagedBean
public class UsuarioController {
	
	private Usuario usuario;
	
	@EJB
	private UsuarioDAO usuarioDAO;
	
	public UsuarioController(){
		this.usuario = new Usuario();
	}
	
	public void salvar(){
		String erro = usuarioDAO.salvar(usuario);
		if(erro != null){
			Mensagem.erro("Ocorreu um erro: "+erro);
		}else{
			Mensagem.sucesso("Salvo com sucesso.");
			this.usuario = new Usuario(); //Limpar os campos
		}	
	}
	
	public void excluir(Modelo modelo){
		String erro = usuarioDAO.excluir(usuario.getIdUsuario());				
	
		if(erro != null){
			Mensagem.erro("Ocorreu um erro: "+erro);
		}else{
			Mensagem.sucesso("Excluído com sucesso.");
		}
	}
	
	public String envia() {
        
        usuario = usuarioDAO.getUsuario(usuario.getEmail(), usuario.getSenha());
        if (usuario == null) {
              usuario = new Usuario();
              FacesContext.getCurrentInstance().addMessage(null,
                         new FacesMessage(FacesMessage.SEVERITY_ERROR, "Usuário não encontrado!",
                                     "Erro no Login!"));
              return null;
        } else {
              return "/parametro/loginComSucesso.jsf";
        }
        
        
  }


	
	public void editar(Usuario usuarioEditado){
		this.usuario = usuarioEditado;
	}
	
	public List<Usuario> consultar(){
		return usuarioDAO.todos();
	}
	

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	
//...
}
