package org.formacio.mvc;


import org.formacio.repositori.AgendaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

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
}
