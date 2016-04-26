package br.com.locadora.noturno.dao;

import javax.persistence.*;

import java.io.Serializable;
import java.util.List;

public class GenericDAO<T> {

	@PersistenceContext
	protected EntityManager em;
	
	protected Class<T> classe;
	
	public GenericDAO(Class<T> classe){
		this.classe = classe;
	}
	
	public String salvar(T entidade){
		try{
			em.merge(entidade);//Insere ou Altera
		}catch(Exception ex){
			return "Ocorreu o erro "+ex.getMessage();
		}
		
		return null;
	}
	
	public String excluir(Serializable id){
		
		try{
			
			T entidade = obter(id);
			em.remove(entidade);
			
		}catch(Exception ex){
			return "Erro ao excluir: "+ex.getMessage();
		}
		
		return null;
	}
	
	public T obter(Serializable id){
		T entidade = em.find(classe, id);
		return entidade;
	}
	
	public List<T> todos(){
		
		TypedQuery<T> query 
			= em.createQuery("select x from "
						+classe.getSimpleName()+" as x",
					classe);
		
		return query.getResultList();
		
	}
	
}
