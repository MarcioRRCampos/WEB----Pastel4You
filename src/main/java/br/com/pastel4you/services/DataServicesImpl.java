package br.com.pastel4you.services;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import br.com.pastel4you.dao.DataDao;
import br.com.pastel4you.model.Cliente;
import br.com.pastel4you.model.Employee;
import br.com.pastel4you.model.Ingrediente;
import br.com.pastel4you.model.Pastel;


@Service
public class DataServicesImpl implements DataServices {

	@Autowired
	DataDao dataDao;
	
	@Override
	public boolean addEntity(Employee employee) throws Exception {
		return dataDao.addEntity(employee);
	}

	@Override
	public Employee getEntityById(long id) throws Exception {
		return dataDao.getEntityById(id);
	}

	@Override
	public List<Employee> getEntityList() throws Exception {
		return dataDao.getEntityList();
	}

	@Override
	public boolean deleteEntity(long id) throws Exception {
		return dataDao.deleteEntity(id);
	}

	@Override
	public List<Cliente> getClienteList() throws Exception {
		return dataDao.getClienteList();
	}

	@Override
	public List<Ingrediente> getIngredienteList() throws Exception {
		return dataDao.getIngredienteList();
	}

	@Override
	public List<Pastel> getPastelList() throws Exception {
		return dataDao.getPastelList();
	}

	@Override
	public List getClienteSimpleList() throws Exception {
		return dataDao.getClienteSimpleList();
	}

	@Override
	public boolean addIngrediente(Ingrediente ingrediente) throws Exception {
		return dataDao.addIngrediente(ingrediente);
		
	}
}
