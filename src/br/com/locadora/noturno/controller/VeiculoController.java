package br.com.locadora.noturno.controller;

import javax.faces.bean.*;
import br.com.locadora.noturno.dao.VeiculoDAO;
import br.com.locadora.noturno.entidade.*;
import br.com.locadora.noturno.util.Mensagem;

import java.util.List;

import javax.ejb.*;

@ManagedBean
public class VeiculoController {
	
	private Veiculo veiculo;
	
	@EJB
	private VeiculoDAO veiculoDAO;
	
	public VeiculoController(){
		this.veiculo = new Veiculo();
	}

	public void salvar(){
		String erro = veiculoDAO.salvar(veiculo);
		if(erro != null){
			Mensagem.erro("Ocorreu um erro: "+erro);
		}else{
			Mensagem.sucesso("Salvo com sucesso.");
			this.veiculo = new Veiculo(); //Limpar os campos
		}	
	}
	

	
	public void excluir(Veiculo veiculo){
		String erro = veiculoDAO.excluir(veiculo.getIdVeiculo());				
	
		if(erro != null){
			Mensagem.erro("Ocorreu um erro: "+erro);
		}else{
			Mensagem.sucesso("Excluído com sucesso.");
		}
	}
	
	public void editar(Veiculo veiculoEditado){
		this.veiculo = veiculoEditado;
	}
	
	public List<Veiculo> consultar(){
		return veiculoDAO.todos();
	}
	
	// Get e Set
	public Veiculo getVeiculo() {
		return veiculo;
	}

	public void setVeiculo(Veiculo veiculo) {
		this.veiculo = veiculo;
	}
	
	

}
