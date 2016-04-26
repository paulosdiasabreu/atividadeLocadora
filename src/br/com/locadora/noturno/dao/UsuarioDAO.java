package br.com.locadora.noturno.dao;

import br.com.locadora.noturno.entidade.*;
import javax.ejb.*;
//import javax.persistence.EntityManager;
//import javax.persistence.PersistenceContext;

@Stateless
public class UsuarioDAO extends GenericDAO<Usuario> {

	public UsuarioDAO() {
		super(Usuario.class);
	}

	Usuario usuario = new Usuario();

	public Usuario getUsuario(String email, String senha) {

		try {
			em.createQuery("SELECT x from " + classe.getSimpleName() + " as x where x.email "
					+ "= 'paulo' and x.senha = '12345'").setParameter("email", email).setParameter("senha", senha);

			return usuario;
		} catch (Exception ex) {
			return null;
		}
	}

	/*
	 * @PersistenceContext private EntityManager em;
	 * 
	 * public String salvar(Usuario usuario){
	 * 
	 * 
	 * try{ em.merge(usuario);//Insere ou Altera }catch(Exception ex){ return
	 * "Ocorreu o erro "+ex.getMessage(); }
	 * 
	 * return null; }
	 */

}
