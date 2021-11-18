/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.gm.web;

import lombok.extern.slf4j.Slf4j;
import mx.com.gm.service.IPersonaService;
import org.springframework.beans.factory.annotation.Autowired;
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

    @Autowired
    private IPersonaService personaService;

    @GetMapping("/")
    public String inicio(Model model) {

        var personal = personaService.listarPersonas();
        log.info("Ejecutando el controlador tipo Spring MVC");

        model.addAttribute("personal", personal);
        return "index";
    }
}
