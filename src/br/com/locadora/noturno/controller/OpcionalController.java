package br.com.locadora.noturno.controller;

import javax.faces.bean.*;
import br.com.locadora.noturno.dao.OpcionalDAO;
import br.com.locadora.noturno.entidade.*;
import javax.ejb.*;
import java.util.*;

@ManagedBean
@RequestScoped
public class OpcionalController {
	
	private Opcional opcional;
	
	@EJB
	private OpcionalDAO opcionalDAO;
	
	public OpcionalController(){
		this.opcional = new Opcional();
	}

	public List<Opcional> consultar(){
		
		return opcionalDAO.todos();
	}
	
	
	//get e set
	public Opcional getOpcional() {
		return opcional;
	}

	public void setOpcional(Opcional opcional) {
		this.opcional = opcional;
	}
	
	

}
