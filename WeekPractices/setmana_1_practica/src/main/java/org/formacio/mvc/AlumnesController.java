package org.formacio.mvc;

import org.formacio.component.ServeiAlumnat;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AlumnesController {
	
	@Autowired
	private ServeiAlumnat alumnat;
	
	public ServeiAlumnat getAlumnat() {
		return alumnat;
	}
	
	@RequestMapping(value="/alumnes")
	public Integer nombreAlumnes() {
		return getAlumnat().getRepositori().llistaAlumnes().size();
	}
	
	

	
	

}
