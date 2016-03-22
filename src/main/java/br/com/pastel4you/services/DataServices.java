package br.com.pastel4you.services;

import java.util.List;

import br.com.pastel4you.model.Cliente;
import br.com.pastel4you.model.Employee;
import br.com.pastel4you.model.Ingrediente;
import br.com.pastel4you.model.Pastel;



public interface DataServices {
	public boolean addEntity(Employee employee) throws Exception;
	public Employee getEntityById(long id) throws Exception;
	public List<Employee> getEntityList() throws Exception;
	public boolean deleteEntity(long id) throws Exception;
	
	// Ingrediente
	public List<Ingrediente> getIngredienteList() throws Exception;
	public boolean addIngrediente(Ingrediente ingrediente)throws Exception;
	
	//Pastel
	public List<Pastel> getPastelList()throws Exception;
	
	//Cliente
	public List<Cliente> getClienteList() throws Exception;
	public List getClienteSimpleList() throws Exception;
}
