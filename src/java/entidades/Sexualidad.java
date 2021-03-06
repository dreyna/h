package entidades;
// Generated 06-sep-2015 6:46:45 by Hibernate Tools 4.3.1


import java.util.Date;

/**
 * Sexualidad generated by hbm2java
 */
public class Sexualidad  implements java.io.Serializable {


     private Integer idSexualidad;
     private Persona persona;
     private Usuario usuario;
     private String flujoVaginal;
     private Integer edadInicio;
     private Integer parejasSex;
     private Integer sexHijosvivos;
     private String menarquia;
     private Date sexUltimaregla;
     private String rc;
     private String dismonorrea;
     private Date fechaReg;

    public Sexualidad() {
    }

	
    public Sexualidad(Persona persona, Usuario usuario) {
        this.persona = persona;
        this.usuario = usuario;
    }
    public Sexualidad(Persona persona, Usuario usuario, String flujoVaginal, Integer edadInicio, Integer parejasSex, Integer sexHijosvivos, String menarquia, Date sexUltimaregla, String rc, String dismonorrea, Date fechaReg) {
       this.persona = persona;
       this.usuario = usuario;
       this.flujoVaginal = flujoVaginal;
       this.edadInicio = edadInicio;
       this.parejasSex = parejasSex;
       this.sexHijosvivos = sexHijosvivos;
       this.menarquia = menarquia;
       this.sexUltimaregla = sexUltimaregla;
       this.rc = rc;
       this.dismonorrea = dismonorrea;
       this.fechaReg = fechaReg;
    }
   
    public Integer getIdSexualidad() {
        return this.idSexualidad;
    }
    
    public void setIdSexualidad(Integer idSexualidad) {
        this.idSexualidad = idSexualidad;
    }
    public Persona getPersona() {
        return this.persona;
    }
    
    public void setPersona(Persona persona) {
        this.persona = persona;
    }
    public Usuario getUsuario() {
        return this.usuario;
    }
    
    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
    public String getFlujoVaginal() {
        return this.flujoVaginal;
    }
    
    public void setFlujoVaginal(String flujoVaginal) {
        this.flujoVaginal = flujoVaginal;
    }
    public Integer getEdadInicio() {
        return this.edadInicio;
    }
    
    public void setEdadInicio(Integer edadInicio) {
        this.edadInicio = edadInicio;
    }
    public Integer getParejasSex() {
        return this.parejasSex;
    }
    
    public void setParejasSex(Integer parejasSex) {
        this.parejasSex = parejasSex;
    }
    public Integer getSexHijosvivos() {
        return this.sexHijosvivos;
    }
    
    public void setSexHijosvivos(Integer sexHijosvivos) {
        this.sexHijosvivos = sexHijosvivos;
    }
    public String getMenarquia() {
        return this.menarquia;
    }
    
    public void setMenarquia(String menarquia) {
        this.menarquia = menarquia;
    }
    public Date getSexUltimaregla() {
        return this.sexUltimaregla;
    }
    
    public void setSexUltimaregla(Date sexUltimaregla) {
        this.sexUltimaregla = sexUltimaregla;
    }
    public String getRc() {
        return this.rc;
    }
    
    public void setRc(String rc) {
        this.rc = rc;
    }
    public String getDismonorrea() {
        return this.dismonorrea;
    }
    
    public void setDismonorrea(String dismonorrea) {
        this.dismonorrea = dismonorrea;
    }
    public Date getFechaReg() {
        return this.fechaReg;
    }
    
    public void setFechaReg(Date fechaReg) {
        this.fechaReg = fechaReg;
    }




}


