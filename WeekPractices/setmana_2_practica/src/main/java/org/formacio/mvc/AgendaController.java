package org.formacio.mvc;


import org.formacio.repositori.AgendaService;
import org.formacio.repositori.Persona;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

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
    public Persona contacte(@PathVariable String id) throws Exception{
        if(!agenda.getBbdd().containsKey(id)){
            Exception contacteDesconegut  = new Exception();
            throw contacteDesconegut;
        }else{
            return agenda.recupera(id);
        }
    }

    @ResponseStatus(code = HttpStatus.NOT_FOUND)
    @ExceptionHandler()
    private void error(Exception contacteDesconegut){}

    @RequestMapping(path = "/afegir", method = RequestMethod.POST)
    @ResponseBody
    public void afegirContacte(String id, String nom, String telefon){
        this.agenda.inserta(id, nom, telefon);
    }
}

