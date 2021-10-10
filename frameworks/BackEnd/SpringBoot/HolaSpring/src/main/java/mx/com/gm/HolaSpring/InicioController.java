/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.gm.HolaSpring;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Guest
 */
@RestController
@Slf4j
public class InicioController {
    
    @GetMapping("/")
    public String inicio(){
        log.info("Ejecutando el controlador tipo REST");
        log.debug("Controlador: InicioController");
        return "Hola Mundo con Spring";
    }
}
