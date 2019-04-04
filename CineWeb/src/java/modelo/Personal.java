/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author PC
 */
public class Personal {
    
    private int idPer;
    private String nomPer;
    private String apePer;
    private String dniPer;
    private String dirPer;
    private int tipPer; // administrador: 0; usuario: 1; cliente: 2
    private String sexPer; //M: Masculino; F: Femenino
    private String usuPer;
    private String pwdPer;
    private String codubi;

    public String getCodubi() {
        return codubi;
    }

    public void setCodubi(String codubi) {
        this.codubi = codubi;
    }

    public int getIdPer() {
        return idPer;
    }

    public int getTipPer() {
        return tipPer;
    }

    public void setTipPer(int tipPer) {
        this.tipPer = tipPer;
    }

    public void setIdPer(int idPer) {
        this.idPer = idPer;
    }

    public String getNomPer() {
        return nomPer;
    }

    public void setNomPer(String nomPer) {
        this.nomPer = nomPer;
    }

    public String getApePer() {
        return apePer;
    }

    public void setApePer(String apePer) {
        this.apePer = apePer;
    }

    public String getDniPer() {
        return dniPer;
    }

    public void setDniPer(String dniPer) {
        this.dniPer = dniPer;
    }

    public String getDirPer() {
        return dirPer;
    }

    public void setDirPer(String dirPer) {
        this.dirPer = dirPer;
    }

    public String getSexPer() {
        return sexPer;
    }

    public void setSexPer(String sexPer) {
        this.sexPer = sexPer;
    }

    public String getUsuPer() {
        return usuPer;
    }

    public void setUsuPer(String usuPer) {
        this.usuPer = usuPer;
    }

    public String getPwdPer() {
        return pwdPer;
    }

    public void setPwdPer(String pwdPer) {
        this.pwdPer = pwdPer;
    }


    
    
    
}
