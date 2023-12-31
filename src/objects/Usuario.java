/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objects;

/**
 *
 * @author Airam
 */
public class Usuario {
       
    private int id;
    private String nombre;
    private String ap_paterno;
    private String ap_materno;
    private String username;
    private String pass;
    private boolean rango;
    
    public Usuario(int id, String nombre, String ap_paterno, String ap_materno, boolean rango, String username, String pass) {
        this.id = id;
        this.nombre = nombre;
        this.ap_paterno = ap_paterno;
        this.ap_materno = ap_materno;
        this.rango = rango;
        this.username = username;
        this.pass = pass;
    }
    
    public Usuario(int id, String nombre, String ap_paterno, String ap_materno, boolean rango, String username) {
        this.id = id;
        this.nombre = nombre;
        this.ap_paterno = ap_paterno;
        this.ap_materno = ap_materno;
        this.rango = rango;
        this.username = username;
    }
    
     public Usuario( String nombre, String ap_paterno, String ap_materno, boolean rango, String username, String pass) {
        this.nombre = nombre;
        this.ap_paterno = ap_paterno;
        this.ap_materno = ap_materno;
        this.rango = rango;
        this.username = username;
        this.pass= pass;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setAp_paterno(String ap_paterno) {
        this.ap_paterno = ap_paterno;
    }

    public void setAp_materno(String ap_materno) {
        this.ap_materno = ap_materno;
    }

    public String getNombre() {
        return nombre;
    }

    public String getAp_paterno() {
        return ap_paterno;
    }

    public String getAp_materno() {
        return ap_materno;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }
        
    public void setRango (boolean rango){
        this.rango = rango;
    }

    public int getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    public String getPass() {
        return pass;
    }
    
    public boolean getRango(){
        return rango;
    }
}
