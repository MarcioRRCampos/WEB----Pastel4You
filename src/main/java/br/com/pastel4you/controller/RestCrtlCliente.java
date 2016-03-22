package br.com.pastel4you.controller;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import br.com.pastel4you.dao.DataDao;
import br.com.pastel4you.model.Cliente;

@Controller
@RequestMapping("/cliente")
public class RestCrtlCliente {
	
	@Autowired
	DataDao dataServices;
	
	static final Logger logger = Logger.getLogger(RestCrtlCliente.class);
	
	@RequestMapping(value = "/listCliente", method = RequestMethod.GET)
	public @ResponseBody 
	List<Cliente> getListCliente(){
		
		List<Cliente> clienteList = null;
		try{
			clienteList = dataServices.getClienteList();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return clienteList;
	}
	
	@RequestMapping(value = "/listClienteSimple", method = RequestMethod.GET)
	public @ResponseBody 
	List getClienteSimpleList(){
		
		List<Cliente> clienteList = null;
		try{
			clienteList = dataServices.getClienteSimpleList();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return clienteList;
	}
	
	
	
}
