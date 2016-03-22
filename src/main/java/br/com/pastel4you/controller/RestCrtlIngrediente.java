package br.com.pastel4you.controller;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import br.com.pastel4you.model.Employee;
import br.com.pastel4you.model.Ingrediente;
import br.com.pastel4you.model.Status;
import br.com.pastel4you.services.DataServices;


@Controller
@RequestMapping("/ingrediente")
public class RestCrtlIngrediente {

	@Autowired
	DataServices dataServices;

	static final Logger logger = Logger.getLogger(RestController.class);

	@RequestMapping(value = "/list", method = RequestMethod.GET)
	public @ResponseBody 
	List<Ingrediente> getListIngrediente(){
		
		List<Ingrediente> list = null;
		try{
			list = dataServices.getIngredienteList();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}
	
	@RequestMapping(value = "/create", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody
	Status addEmployee(@RequestBody Ingrediente ingrediente) {
		try {
			dataServices.addIngrediente(ingrediente);
			return new Status(1, "Successfully !");
		} catch (Exception e) {
			// e.printStackTrace();
			return new Status(0, e.toString());
		}
	}
	
	
}
