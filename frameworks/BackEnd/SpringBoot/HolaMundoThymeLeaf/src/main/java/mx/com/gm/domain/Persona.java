/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.gm.domain;

import lombok.Data;

/**
 *
 * @author Guest
 */
@Data
public class Persona {
    private String nombre;
    private String apellido;
    private String correo;
    private String telefono;
}
