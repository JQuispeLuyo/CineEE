
package Controller;

import dao.PersonalImpl;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import modelo.Personal;

@Named(value = "personalC")
@SessionScoped
public class PersonalC implements Serializable {

    private Personal personal;
    private PersonalImpl dao;
    private List<Personal> listadoPer;
    
    public PersonalC() {
        
        dao = new PersonalImpl();
        personal = new Personal();
        listadoPer = new ArrayList();
        
    }
    
    
    public void regitrar () throws Exception{
        try {
            dao.regitrar(personal);
            limpiar();
            FacesContext.getCurrentInstance().addMessage(null, 
                        new FacesMessage(FacesMessage.SEVERITY_INFO,"Registro","Completado"));
        } catch (Exception e) {
        }
    }
    
    public void modificar () throws Exception{
         try {
            dao.modificar(personal);
            limpiar();
            FacesContext.getCurrentInstance().addMessage(null, 
                        new FacesMessage(FacesMessage.SEVERITY_INFO,"Actualizacion","Competado"));
        } catch (Exception e) {
        }
    }
    
    public void eliminar (Personal per) throws Exception {
         try {
            dao.eliminar(per);
            limpiar();
            FacesContext.getCurrentInstance().addMessage(null, 
                        new FacesMessage(FacesMessage.SEVERITY_INFO,"Eliminacion","Completado"));
        } catch (Exception e) {
        }
    }
    
    public void limpiar() throws Exception{
         try {
             
        } catch (Exception e) {
        }
    }
    
    public void listar() throws Exception {
        try {
            listadoPer = dao.listaper(personal);
        } catch (Exception e) {
            throw e;
        }

    }
    
    public List<Personal> getListadoPer() {
        return listadoPer;
    }
    
    public void setListadoPer(List<Personal> listadoPer) {
        this.listadoPer = listadoPer;
    }
    
    
    public Personal getPersonal() {
        return personal;
    }

    public void setPersonal(Personal personal) {
        this.personal = personal;
    }

    
    
}
