package entidades;
// Generated 25-ago-2015 21:41:00 by Hibernate Tools 4.3.1


import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Rol generated by hbm2java
 */
public class Rol  implements java.io.Serializable {


     private Integer idRol;
     private String rol;
     private Date fechaReg;
     private Set<UsuarioRol> usuarioRols = new HashSet<UsuarioRol>(0);
     private Set<RolServicio> rolServicios = new HashSet<RolServicio>(0);

    public Rol() {
    }

    public Rol(String rol, Date fechaReg, Set<UsuarioRol> usuarioRols, Set<RolServicio> rolServicios) {
       this.rol = rol;
       this.fechaReg = fechaReg;
       this.usuarioRols = usuarioRols;
       this.rolServicios = rolServicios;
    }
   
    public Integer getIdRol() {
        return this.idRol;
    }
    
    public void setIdRol(Integer idRol) {
        this.idRol = idRol;
    }
    public String getRol() {
        return this.rol;
    }
    
    public void setRol(String rol) {
        this.rol = rol;
    }
    public Date getFechaReg() {
        return this.fechaReg;
    }
    
    public void setFechaReg(Date fechaReg) {
        this.fechaReg = fechaReg;
    }
    public Set<UsuarioRol> getUsuarioRols() {
        return this.usuarioRols;
    }
    
    public void setUsuarioRols(Set<UsuarioRol> usuarioRols) {
        this.usuarioRols = usuarioRols;
    }
    public Set<RolServicio> getRolServicios() {
        return this.rolServicios;
    }
    
    public void setRolServicios(Set<RolServicio> rolServicios) {
        this.rolServicios = rolServicios;
    }




}

