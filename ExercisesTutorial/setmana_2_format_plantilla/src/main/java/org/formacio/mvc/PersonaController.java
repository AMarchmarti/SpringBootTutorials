package org.formacio.mvc;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.awt.*;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;

@Controller
public class PersonaController {

	
	/**
	 * Arrancau l'aplicació i accediu a:
	 *
	 * http://localhost:8080/persona
	 * http://localhost:8080/persona.xml
	 * http://localhost:8080/persona.json
	 * 
	 * Llavors provau les mateixes peticions canviant el RequestMapping a:
	 * 	@RequestMapping(path="/persona", produces=MediaType.APPLICATION_JSON_VALUE) i
	 *  @RequestMapping(path="/persona", produces=MediaType.APPLICATION_XML_VALUE)
	 */
	@RequestMapping(path="/persona")
	@ResponseBody
	public Persona obtePersona() throws ParseException {
		DateFormat df = new SimpleDateFormat("dd-MM-yyyy");
		return new Persona("Pere","Selva", df.parse("22-12-1980"),"somxulo");
	}

//	@RequestMapping(path="/persona", produces=MediaType.APPLICATION_JSON_VALUE)
//	@ResponseBody
//	public Persona obtePersona() throws ParseException {
//		DateFormat df = new SimpleDateFormat("dd-MM-yyyy");
//		return new Persona("Pere","Selva", df.parse("22-12-1980"),"somxulo");
//	}

//	@RequestMapping(path="/persona", produces= MediaType.APPLICATION_XML_VALUE)
//	@ResponseBody
//	public Persona obtePersona() throws ParseException {
//		DateFormat df = new SimpleDateFormat("dd-MM-yyyy");
//		return new Persona("Pere","Selva", df.parse("22-12-1980"),"somxulo");
//	}
}
