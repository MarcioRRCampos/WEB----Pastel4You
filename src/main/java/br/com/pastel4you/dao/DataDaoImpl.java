package br.com.pastel4you.dao;

import java.util.List;

import javax.management.Query;

import org.hibernate.Criteria;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.ProjectionList;
import org.hibernate.criterion.Projections;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;

import br.com.pastel4you.model.Cliente;
import br.com.pastel4you.model.Employee;
import br.com.pastel4you.model.Ingrediente;
import br.com.pastel4you.model.Pastel;

@Configuration
//@ComponentScan(basePackages = "br.com.pastel4you")
//@ImportResource("classpath:spring-config.xml")
public class DataDaoImpl implements DataDao {
	
  // ApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");

	
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
	public boolean addIngrediente(Ingrediente ingrediente) throws Exception {

		session = sessionFactory.openSession();
		tx = session.beginTransaction();
		session.save(ingrediente);
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
	
//	@SuppressWarnings("unchecked")
//	@Override
//	public List<Ingrediente> getIngredienteList() throws Exception {
//		session = sessionFactory.openSession();
//		tx = session.beginTransaction();
//		
//		SQLQuery callStoredProcedure_MYSQL = session.createSQLQuery("CALL SP_CONSULTA_INGREDIENTES").addEntity(Ingrediente.class);
//		//List<Ingrediente> list; 
//		List<Ingrediente> retorno = callStoredProcedure_MYSQL.list();
//		
//		tx.commit();
//		session.close();
//		return retorno;
//	}
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

	
//	@SuppressWarnings("unchecked")
//	@Override
//	public List<Pastel> getPastelList() throws Exception {
//		session = sessionFactory.openSession();
//		tx = session.beginTransaction();
//		SQLQuery callStoredProcedure_MYSQL = session.createSQLQuery("CALL SP_CONSULTA_PASTEIS").addEntity(Pastel.class);
//		List<Pastel> list = callStoredProcedure_MYSQL.list();
//		tx.commit();
//		session.close();
//		return list;
//	}


	@SuppressWarnings("unchecked")
	@Override
	public List<Pastel> getPastelList() throws Exception {
		session = sessionFactory.openSession();
		tx = session.beginTransaction();
		List<Pastel> pastel = session.createCriteria(Pastel.class)
				.list();
		tx.commit();
		session.close();
		return pastel;
	}

	
	@SuppressWarnings("unchecked")
	@Override
	public List getClienteSimpleList() throws Exception {
		session = sessionFactory.openSession();
		tx = session.beginTransaction();

		Criteria crit = session.createCriteria(Cliente.class);
		  ProjectionList projList = Projections.projectionList();
		  projList.add(Projections.property("id"));
		  projList.add(Projections.property("nome"));
		  crit.setProjection(projList);
		  List results = crit.list(); 
		
		tx.commit();
		session.close();
		return results;
	}

//	@Override
//	public List<Pastel> getPastelList() throws Exception {
//		// TODO Auto-generated method stub
//		return null;
//	}
		
}
