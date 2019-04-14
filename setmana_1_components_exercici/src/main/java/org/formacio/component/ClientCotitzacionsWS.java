package org.formacio.component;

import org.springframework.stereotype.Component;

//aquesta classe ha de ser detectada com un component
@Component
public class ClientCotitzacionsWS implements IntegradorCotitzacions {

	public int nombreInvocacions = 0;
	
	public float obteMitjanaDiariaCotitzacions() {
		nombreInvocacions++; // per controls del test
		return 20f;
	}
	
	@Override
	public float obteCotitzacio(String empresa) {
		switch (empresa) {
		     case "cervesses.sa": return 30f;
		     case "shandies.sa": return 10f;
		     default : return 20f;
		}
	}
	
	//Per tal de fer el darrer apartat de l'exercici hem de guardar la variable cridades per tenir constancia de cuantes vegades l'hem cridada.
	public Integer getNombreInvocacions() {
		return nombreInvocacions;
	}

}
