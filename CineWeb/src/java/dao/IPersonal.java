/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.List;
import modelo.Personal;

/**
 *
 * @author PC
 */
public interface IPersonal {
    
    void regitrar (Personal personal) throws Exception;
    void modificar(Personal personal) throws Exception;
    void eliminar (Personal personal) throws Exception;
    
    List<Personal> listaper (Personal personal) throws Exception;
    
}
