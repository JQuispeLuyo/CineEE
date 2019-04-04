
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
            FacesContext.getCurrentInstance().addMessage(null, 
                        new FacesMessage(FacesMessage.SEVERITY_INFO,"Registro","Completado"));
        } catch (Exception e) {
        }
    }
    
    public void modificar () throws Exception{
         try {
            dao.regitrar(personal);
            FacesContext.getCurrentInstance().addMessage(null, 
                        new FacesMessage(FacesMessage.SEVERITY_INFO,"Actualizacio","Competado"));
        } catch (Exception e) {
        }
    }
    
    public void eliminar () throws Exception {
         try {
            dao.regitrar(personal);
            FacesContext.getCurrentInstance().addMessage(null, 
                        new FacesMessage(FacesMessage.SEVERITY_INFO,"Elimicacion","Completado"));
        } catch (Exception e) {
        }
    }
    
    public void limpiar () throws Exception{
         try {
            dao.regitrar(personal);
            FacesContext.getCurrentInstance().addMessage(null, 
                        new FacesMessage(FacesMessage.SEVERITY_INFO,"Listado","Completado"));
        } catch (Exception e) {
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
