package br.com.pastel4you.dao;

import java.util.List;

import br.com.pastel4you.model.Cliente;
import br.com.pastel4you.model.Employee;
import br.com.pastel4you.model.Ingrediente;
import br.com.pastel4you.model.Pastel;

public interface DataDao {

	public boolean addEntity(Employee employee) throws Exception;
	public Employee getEntityById(long id) throws Exception;
	public Cliente getClienteId(long id) throws Exception;
	public List<Employee> getEntityList() throws Exception;
	public boolean deleteEntity(long id) throws Exception;
	public List<Cliente> getClienteList() throws Exception;
	// Ingrediente	
	public List<Ingrediente> getIngredienteList() throws Exception;
	//pPastel
	public List<Pastel> getPastelList() throws Exception;
}
