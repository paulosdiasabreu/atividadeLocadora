package br.com.locadora.noturno.util;

//import javax.faces.bean.*;
import javax.faces.context.*;
import javax.faces.application.*;

public class Mensagem {

	
	public static void sucesso(String msg){
		FacesContext
			.getCurrentInstance()
			.addMessage(null,
				new FacesMessage(FacesMessage.SEVERITY_INFO, msg, null));
	}
	
	public static void erro(String msg){
		FacesContext
			.getCurrentInstance()
			.addMessage(null,
				new FacesMessage(FacesMessage.SEVERITY_ERROR, msg, null));
	}
	
}
