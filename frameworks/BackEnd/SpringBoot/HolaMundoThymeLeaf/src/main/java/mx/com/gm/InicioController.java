/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.gm;

import java.util.Arrays;
import lombok.extern.slf4j.Slf4j;
import mx.com.gm.domain.Persona;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

/**
 *
 * @author Guest
 */
@Controller
@Slf4j
public class InicioController {
    
    @Value("${index.saludoApp}")
    private String saludoApp;
    @GetMapping("/")
    public String inicio(Model model){
        var mensaje="Hola Mundo con spring";
        var persona = new Persona();
        persona.setNombre("Juan");
        persona.setApellido("Perez");
        persona.setEmail("jperez@correo.com");
        persona.setTelefono("3003003000");
        
        var persona2 = new Persona();
        persona2.setNombre("Juana");
        persona2.setApellido("Gomez");
        persona2.setEmail("jgomez@correo.com");
        persona2.setTelefono("4004004000");
        
        var personal = Arrays.asList(persona, persona2);
        log.info("Ejecutando el controlador tipo Spring MVC");
        //log.debug("Controlador: InicioController");
        model.addAttribute("mensaje",mensaje);
        model.addAttribute("saludoApp", saludoApp);
        //model.addAttribute("persona", persona);
        model.addAttribute("personal", personal);
        return "index";
    }
}
