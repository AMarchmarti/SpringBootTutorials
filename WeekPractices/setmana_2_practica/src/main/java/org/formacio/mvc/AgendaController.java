package org.formacio.mvc;


import org.formacio.mvc.Exceptions.IdNoExisteix;
import org.formacio.repositori.AgendaService;
import org.formacio.repositori.Persona;
import org.springframework.beans.factory.annotation.Autowired;
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
            throw new IdNoExisteix();
        }else{
            return agenda.recupera(id);
        }
    }

    @RequestMapping(path = "/afegir", method = RequestMethod.POST)
    @ResponseBody
    public void afegirContacte(@RequestParam  String id, @RequestParam  String nom, @RequestParam String telefon){
        this.agenda.inserta(id, nom, telefon);
    }
}

