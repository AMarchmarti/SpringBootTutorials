package org.formacio.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Controller
@RequestMapping(path = "/personal")
public class PersonalController {

	// no toqueu la declaracio de baseDeDades ni el metode getBaseDeDades
	// 
	// als metodes que anau afegint, tracteu aquest array com si fos la base de dades
	//
	// per exemple, obtenir la persona amb id 1 sera fer baseDeDades.get(1), etc etc 
	
	private List<String> baseDeDades = new ArrayList<>(Arrays.asList("Joana","Antonia","Pere"));
	
	public List<String> getBaseDeDades() {
		return baseDeDades;
	}

	// Poseu a partir d'aqui els vostre metodes

	@RequestMapping(path = "/info")
	@ResponseBody
	public String infoBaseDades(){
		return "Hi ha " + this.baseDeDades.size() + " persones";
	}
}
