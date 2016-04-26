package br.com.locadora.noturno.dao;

import javax.ejb.*;
import br.com.locadora.noturno.entidade.*;

@Stateless
public class OpcionalDAO extends GenericDAO<Opcional>{
	
	public OpcionalDAO(){
		super(Opcional.class);
	}

}
