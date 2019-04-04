
package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import modelo.Personal;

public class PersonalImpl extends Conexion implements IPersonal {

    @Override
    public void regitrar(Personal personal) throws Exception {
        String sql = "insert into personal "
                + "(nomPer, apePer, dniPer, dirPer, tipPer, sexPer, usuPer, pwdPer, codubi) "
                + "values (?,?,?,?,?,?,?,?,?)";
        
         try {
            PreparedStatement ps = this.conectar().prepareStatement(sql);
            ps.setString(1, personal.getNomPer());
            ps.setString(2, personal.getApePer());
            ps.setString(3, personal.getDniPer());
            ps.setInt(4, personal.getTipPer());
            ps.setString(5, personal.getDirPer());
            ps.setString(6, personal.getSexPer());
            ps.setString(7, personal.getUsuPer());
            ps.setString(8, personal.getPwdPer());
            ps.setString(9, personal.getCodubi());
         
            ps.executeUpdate();
            ps.close();
            
        } catch (Exception e) {
             System.out.println("Error en insertar" + e.getMessage());
        }finally{
            this.cerrar();
        }
        
    }

    @Override
    public void modificar(Personal personal) throws Exception {
        String sql = "update personal set "
                + "nomPer = ?, apePer = ?, dniPer = ?, dirPer = ?, tipPer = ?, sexPer = ?, usuPer = ?, pwdPer = ?, codubi = ? where idPer = ?";
        
         try {  
            PreparedStatement ps = this.conectar().prepareStatement(sql);
            ps.setString(1, personal.getNomPer());
            ps.setString(2, personal.getApePer());
            ps.setString(3, personal.getDniPer());
            ps.setInt(4, personal.getTipPer());
            ps.setString(5, personal.getDirPer());
            ps.setString(6, personal.getSexPer());
            ps.setString(7, personal.getUsuPer());
            ps.setString(8, personal.getPwdPer());
            ps.setString(9, personal.getCodubi());
            ps.setInt(10, personal.getIdPer());
         
            ps.executeUpdate();
            ps.close();
             
        } catch (Exception e) {
            System.out.println("Error en modificar" + e.getMessage());
        }finally{
            this.cerrar();
        }
        
    }

    @Override
    public void eliminar(Personal personal) throws Exception {
        String sql = "delete personal idPer=?";
        
         try {
             
            PreparedStatement ps = this.conectar().prepareStatement(sql);
            ps.setInt(1, personal.getIdPer());
            ps.executeUpdate();
            ps.close();
               
        } catch (Exception e) {
             System.out.println("Error en eliminar" + e.getMessage());
        }finally{
            this.cerrar();
        }
        
    }

    @Override
    public List<Personal> listaper(Personal personal) throws Exception {
        List <Personal> listado = null;
        Personal pers;
        String sql = "select * form personal";
        
         try {
            listado = new ArrayList();
            
            Statement st = this.conectar().createStatement();
            ResultSet rs = st.executeQuery(sql);
             
            while(rs.next()){
                 
                 pers = new Personal();
                 pers.setIdPer(rs.getInt("inPer"));
                 pers.setNomPer(rs.getString("nomPer"));
                 pers.setApePer(rs.getString("apePer"));
                 pers.setDniPer(rs.getString("dniPer"));
                 pers.setTipPer(rs.getInt("tipPer"));
                 pers.setDirPer(rs.getString("dirPer"));
                 pers.setSexPer(rs.getString("sexPer"));
                 pers.setUsuPer(rs.getString("usuPer"));
                 pers.setPwdPer(rs.getString("pwdPer"));
                 pers.setCodubi(rs.getString("codubi"));
                 listado.add(pers);
             }
            
        } catch (Exception e) {
            
        }finally{
          this.cerrar();
        }
        
        return listado;
    }
    
}
