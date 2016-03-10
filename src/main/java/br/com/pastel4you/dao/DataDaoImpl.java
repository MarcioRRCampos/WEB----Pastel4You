package br.com.pastel4you.dao;

import java.util.List;

import javax.management.Query;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.StoredProcedureQuery;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;

import br.com.pastel4you.model.Cliente;
import br.com.pastel4you.model.Employee;
import br.com.pastel4you.model.Ingrediente;
import br.com.pastel4you.model.Pastel;

public class DataDaoImpl implements DataDao {

	@Autowired
	SessionFactory sessionFactory;

	Session session = null;
	Transaction tx = null;
	Query query = null;

	@Override
	public boolean addEntity(Employee employee) throws Exception {

		session = sessionFactory.openSession();
		tx = session.beginTransaction();
		session.save(employee);
		tx.commit();
		session.close();

		return false;
	}

	@Override
	public Employee getEntityById(long id) throws Exception {
		session = sessionFactory.openSession();
		Employee employee = (Employee) session.load(Employee.class,
				new Long(id));
		tx = session.getTransaction();
		session.beginTransaction();
		tx.commit();
		return employee;
	}


	
	@Override
	public boolean deleteEntity(long id)
			throws Exception {
		session = sessionFactory.openSession();
		Object o = session.load(Employee.class, id);
		tx = session.getTransaction();
		session.beginTransaction();
		session.delete(o);
		tx.commit();
		return false;
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public List<Cliente> getClienteList() throws Exception {
		session = sessionFactory.openSession();
		tx = session.beginTransaction();
		List<Cliente> listClient = session.createCriteria(Cliente.class)
				.list();
		tx.commit();
		session.close();
		return listClient;	
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public List<Employee> getEntityList() throws Exception {
		session = sessionFactory.openSession();
		tx = session.beginTransaction();
		List<Employee> employeeList = session.createCriteria(Employee.class)
				.list();
		tx.commit();
		session.close();
		return employeeList;
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public List<Ingrediente> getIngredienteList() throws Exception {
		session = sessionFactory.openSession();
		tx = session.beginTransaction();
		List<Ingrediente> list = session.createCriteria(Ingrediente.class)
				.list();
		tx.commit();
		session.close();
		return list;
	}
	
	
	@PersistenceContext
	private EntityManager manager;
	
	@SuppressWarnings("unchecked")
	@Override
	public List<Pastel> getPastelList() throws Exception {
		session = sessionFactory.openSession();
		tx = session.beginTransaction();
		StoredProcedureQuery proc =  ((EntityManager) getEntityList()).createStoredProcedureQuery("SP_CONSULTA_PASTEIS", Pastel.class);
		List<Pastel> list; 
		//= manager.createNamedQuery("SP_CONSULTA_PASTEIS", Pastel.class).getResultList();
		list = proc.getResultList();
		tx.commit();
		session.close();
		return list;
	}
	
	@Override
	public Cliente getClienteId(long id) throws Exception{
		session = sessionFactory.openSession();
		Cliente cliente = (Cliente) session.load(Cliente.class,
				new Long(id));
		tx = session.getTransaction();
		session.beginTransaction();
		tx.commit();
		return cliente;	
	}



}
