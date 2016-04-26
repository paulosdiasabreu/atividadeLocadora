package br.com.locadora.noturno.controller;

import javax.faces.bean.*;
import br.com.locadora.noturno.entidade.*;
import br.com.locadora.noturno.dao.*;
import javax.ejb.*;
import java.util.*;
import br.com.locadora.noturno.util.*;

@ManagedBean
public class ModeloController {

	private Modelo modelo;
	
	@EJB
	private ModeloDAO modeloDAO;
	
	
	public ModeloController(){
		this.modelo = new Modelo();
	}
	
	public void salvar(){
		String erro = modeloDAO.salvar(modelo);
		if(erro != null){
			Mensagem.erro("Ocorreu um erro: "+erro);
		}else{
			Mensagem.sucesso("Salvo com sucesso.");
			this.modelo = new Modelo(); //Limpar os campos
		}	
	}
	
	public void excluir(Modelo modelo){
		String erro = modeloDAO.excluir(modelo.getIdModelo());				
	
		if(erro != null){
			Mensagem.erro("Ocorreu um erro: "+erro);
		}else{
			Mensagem.sucesso("Excluído com sucesso.");
		}
	}
	
	public void editar(Modelo modeloEditado){
		this.modelo = modeloEditado;
	}
	
	public List<Modelo> consultar(){
		return modeloDAO.todos();
	}
	

	public Modelo getModelo() {
		return modelo;
	}

	public void setModelo(Modelo modelo) {
		this.modelo = modelo;
	}
	
	
}
