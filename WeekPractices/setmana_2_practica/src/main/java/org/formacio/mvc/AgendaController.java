package org.formacio.mvc;


import org.formacio.repositori.AgendaService;
import org.formacio.repositori.Persona;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.awt.*;

@Controller
public class AgendaController {

    @Autowired
    private AgendaService agenda;

    @RequestMapping(path = "/nombre")
    @ResponseBody
    public String nombreTelefonsAgenda(){
        return String.valueOf(agenda.nombreContactes());
    }

    @RequestMapping(path = "/telefon")
    @ResponseBody
    public String nombreTelefon(@RequestParam(name = "id") String id){
        return agenda.recupera(id).getTelefon();
    }


    @RequestMapping(path = "/contacte/{id}")
    @ResponseBody
    @ResponseStatus(code = HttpStatus.NOT_FOUND)
    public Persona contacte(@PathVariable String id){
        return agenda.recupera(id);
    }
}
