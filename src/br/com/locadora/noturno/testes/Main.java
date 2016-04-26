package br.com.locadora.noturno.testes;

import javax.persistence.*;

import br.com.locadora.noturno.entidade.Modelo;

public class Main {

	
	public static void main(String[] args){
		
		try{
			
			EntityManager em 
				= Persistence
				.createEntityManagerFactory("br.com.locadora")
				.createEntityManager();
			
			em.getTransaction().begin();
			
			Modelo modelo = new Modelo();
			
			modelo.setDescricao("Fiat");
			
			em.merge(modelo);
			
			em.getTransaction().commit();
				
		}
		catch(Exception ex){
			ex.printStackTrace();
			System.out.println(ex.getMessage());
		}
		
	}
	
}
