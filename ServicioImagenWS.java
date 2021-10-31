/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.me.ServicioImagen;

import BaseDatos.ModificacionyConsulta;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author alumne
 */
@WebService(serviceName = "ServicioImagenWS")
public class ServicioImagenWS {



    /**
     * Web service operation
     * @return 
     */
    @WebMethod(operationName = "ListImages")
    public List ListImages() {
        
        ModificacionyConsulta con = new ModificacionyConsulta();
        ResultSet rs = con.list();
        List<Image> result = new ArrayList<Image>();
        try {
            while (rs.next()){
                Image aux = new Image();
                aux.setid(rs.getInt("id"));
                aux.settitle(rs.getString("title"));
                aux.setdescription(rs.getString("description"));
                aux.setkeywords(rs.getString("keywords"));
                aux.setauthor(rs.getString("author"));
                aux.setcapture_date(rs.getString("capture_date"));
                aux.setstorage_date(rs.getString("storage_date"));
                aux.setcreator(rs.getString("creator"));
                aux.setfilename(rs.getString("filename"));
                
                result.add(aux);
            }
        } catch (SQLException ex) {
            Logger.getLogger(ServicioImagenWS.class.getName()).log(Level.SEVERE, null, ex);
        }
        finally{
            con.cerrarconexion();
        }   
       return result;
    }


    /**
     * Web service operation
     * @param id
     * @return 
     */
    @WebMethod(operationName = "SearchbyId")
    public Image SearchbyId(@WebParam(name = "id") int id) {
       ModificacionyConsulta con = new ModificacionyConsulta();
       ResultSet rs = con.searchById(id);
       Image result = new Image();
        try {
            result.setid(rs.getInt("id"));
            result.settitle(rs.getString("title"));
            result.setdescription(rs.getString("description"));
            result.setkeywords(rs.getString("keywords"));
            result.setauthor(rs.getString("author"));
            result.setcapture_date(rs.getString("capture_date"));
            result.setstorage_date(rs.getString("storage_date"));
            result.setcreator(rs.getString("creator"));
            result.setfilename(rs.getString("filename"));
        } catch (SQLException ex) {
            Logger.getLogger(ServicioImagenWS.class.getName()).log(Level.SEVERE, null, ex);
        }
        con.cerrarconexion();
        return result;
    }
    
    /**
     * Web service operation
     * @param title
     * @return 
     */
    @WebMethod(operationName = "searchByTitle")
    public List searchByTitle(@WebParam(name = "title") String title) {
        ModificacionyConsulta con = new ModificacionyConsulta();
        ResultSet rs = con.search(title, "", "", "", "");
        List<Image> result = new ArrayList<Image>();
        try {
            while (rs.next()){
                Image aux = new Image();
                aux.setid(rs.getInt("id"));
                aux.settitle(rs.getString("title"));
                aux.setdescription(rs.getString("description"));
                aux.setkeywords(rs.getString("keywords"));
                aux.setauthor(rs.getString("author"));
                aux.setcapture_date(rs.getString("capture_date"));
                aux.setstorage_date(rs.getString("storage_date"));
                aux.setcreator(rs.getString("creator"));
                aux.setfilename(rs.getString("filename"));
                
                result.add(aux);
            }
        } catch (SQLException ex) {
            Logger.getLogger(ServicioImagenWS.class.getName()).log(Level.SEVERE, null, ex);
        }
        finally{
            con.cerrarconexion();
        }
        return result;

    }

    /**
     * Web service operation
     * @param creaDate
     * @return 
     */
    @WebMethod(operationName = "searchByCreaDate")
    public List searchByCreaDate(@WebParam(name = "creaDate") String creaDate) {
        ModificacionyConsulta con = new ModificacionyConsulta();
        ResultSet rs = con.search("", "", "", "", creaDate);
        List<Image> result = new ArrayList<Image>();
        try {
            while (rs.next()){
                Image aux = new Image();
                aux.setid(rs.getInt("id"));
                aux.settitle(rs.getString("title"));
                aux.setdescription(rs.getString("description"));
                aux.setkeywords(rs.getString("keywords"));
                aux.setauthor(rs.getString("author"));
                aux.setcapture_date(rs.getString("capture_date"));
                aux.setstorage_date(rs.getString("storage_date"));
                aux.setcreator(rs.getString("creator"));
                aux.setfilename(rs.getString("filename"));
                
                result.add(aux);
            }
        } catch (SQLException ex) {
            Logger.getLogger(ServicioImagenWS.class.getName()).log(Level.SEVERE, null, ex);
        }
        finally{
            con.cerrarconexion();
        }
        return result;
    }

    /**
     * Web service operation
     * @param keywords
     * @return 
     */
    @WebMethod(operationName = "searchByKeywords")
    public List searchByKeywords(@WebParam(name = "keywords") String keywords) {
         ModificacionyConsulta con = new ModificacionyConsulta();
        ResultSet rs = con.search("", "", "", keywords, "");
        List<Image> result = new ArrayList<Image>();
        try {
            while (rs.next()){
                Image aux = new Image();
                aux.setid(rs.getInt("id"));
                aux.settitle(rs.getString("title"));
                aux.setdescription(rs.getString("description"));
                aux.setkeywords(rs.getString("keywords"));
                aux.setauthor(rs.getString("author"));
                aux.setcapture_date(rs.getString("capture_date"));
                aux.setstorage_date(rs.getString("storage_date"));
                aux.setcreator(rs.getString("creator"));
                aux.setfilename(rs.getString("filename"));
                
                result.add(aux);
            }
        } catch (SQLException ex) {
            Logger.getLogger(ServicioImagenWS.class.getName()).log(Level.SEVERE, null, ex);
        }
        finally{
            con.cerrarconexion();
        }
        return result;
    }

    /**
     * Web service operation
     * @param author
     * @return 
     */
    @WebMethod(operationName = "searchByAuthor")
    public List searchByAuthor(@WebParam(name = "author") String author) {
       ModificacionyConsulta con = new ModificacionyConsulta();
        ResultSet rs = con.search("", "", author, "", "");
        List<Image> result = new ArrayList<Image>();
        try {
            while (rs.next()){
                Image aux = new Image();
                aux.setid(rs.getInt("id"));
                aux.settitle(rs.getString("title"));
                aux.setdescription(rs.getString("description"));
                aux.setkeywords(rs.getString("keywords"));
                aux.setauthor(rs.getString("author"));
                aux.setcapture_date(rs.getString("capture_date"));
                aux.setstorage_date(rs.getString("storage_date"));
                aux.setcreator(rs.getString("creator"));
                aux.setfilename(rs.getString("filename"));
                
                result.add(aux);
            }
        } catch (SQLException ex) {
            Logger.getLogger(ServicioImagenWS.class.getName()).log(Level.SEVERE, null, ex);
        }
        finally{
            con.cerrarconexion();
        }
        return result;
    }
    
            /**
     * Web service operation
     * @param Image
     * @return 
     */
    @WebMethod(operationName = "RegisterImage")
    public int RegisterImage(@WebParam(name = "Image") Image Image) {
        //TODO write your implementation code here:
        ModificacionyConsulta connection = new ModificacionyConsulta();
        
        try {
            Class.forName("org.apache.derby.jdbc.ClientDriver");
            
            //obtener parametros
            String title = Image.gettitle();
            String description = Image.getdescription();
            String keywords = Image.getkeywords();
            String author = Image.getauthor();
            String capture_date = Image.getcapture_date();
            String filename = Image.getfilename();
            String nombreUsuarioActual = Image.getcreator();
            connection.registrarImagen(title,description,keywords,author,nombreUsuarioActual, capture_date,filename);
            
            
        } catch (Exception e) {
            System.err.println(e.getMessage());
            return 1;
        } finally{
            connection.cerrarconexion();
        }
        return 0;
    }

    /**
     * Web service operation
     * @param image
     * @return 
     */
    @WebMethod(operationName = "ModifyImage")
    public int ModifyImage(@WebParam(name = "image") Image image) {
        //TODO write your implementation code here:
        ModificacionyConsulta connection = new ModificacionyConsulta();
        
        try {
            Class.forName("org.apache.derby.jdbc.ClientDriver");
            
            //obtener parametros
            String title = image.gettitle();
            String description = image.getdescription();
            String keywords = image.getkeywords();
            String author = image.getauthor();
            String capture_date = image.getcapture_date();
            String filename = image.getfilename();
            String nombreUsuarioActual = image.getcreator();
            int id = image.getid();
            boolean error = connection.updateimagen(title, description, keywords, author, capture_date, id);
            if(error) return 1;
            
            
        } catch (Exception e) {
            System.err.println(e.getMessage());
            return 1;
            
        } finally{
            connection.cerrarconexion();
        }
        return 0;
    }

    /**
     * Web service operation
     * @param id
     * @return 
     */
    @WebMethod(operationName = "DeleteImage")
    public int DeleteImage(@WebParam(name = "id") int id) {
        //TODO write your implementation code here:
        ModificacionyConsulta connection = new ModificacionyConsulta();
        
        try {
            Class.forName("org.apache.derby.jdbc.ClientDriver");
            
            String ID = Integer.toString(id);
            String error = connection.eliminarImagen(ID);
            
            if(error.equals("null")) return 1; //error al eliminar
            
        } catch (Exception e) {
            System.err.println(e.getMessage());
            return 1;
            
        } finally{
            connection.cerrarconexion();
        }
        return 0;
    }
}
