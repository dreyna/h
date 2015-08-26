package entidades;
// Generated 25-ago-2015 21:41:00 by Hibernate Tools 4.3.1



/**
 * PersonaTipoPersona generated by hbm2java
 */
public class PersonaTipoPersona  implements java.io.Serializable {


     private Integer idPersonaTipoPersona;
     private Persona persona;
     private ServicioEspecialidad servicioEspecialidad;
     private TipoEmpleado tipoEmpleado;
     private TipoPersona tipoPersona;

    public PersonaTipoPersona() {
    }

    public PersonaTipoPersona(Persona persona, ServicioEspecialidad servicioEspecialidad, TipoEmpleado tipoEmpleado, TipoPersona tipoPersona) {
       this.persona = persona;
       this.servicioEspecialidad = servicioEspecialidad;
       this.tipoEmpleado = tipoEmpleado;
       this.tipoPersona = tipoPersona;
    }
   
    public Integer getIdPersonaTipoPersona() {
        return this.idPersonaTipoPersona;
    }
    
    public void setIdPersonaTipoPersona(Integer idPersonaTipoPersona) {
        this.idPersonaTipoPersona = idPersonaTipoPersona;
    }
    public Persona getPersona() {
        return this.persona;
    }
    
    public void setPersona(Persona persona) {
        this.persona = persona;
    }
    public ServicioEspecialidad getServicioEspecialidad() {
        return this.servicioEspecialidad;
    }
    
    public void setServicioEspecialidad(ServicioEspecialidad servicioEspecialidad) {
        this.servicioEspecialidad = servicioEspecialidad;
    }
    public TipoEmpleado getTipoEmpleado() {
        return this.tipoEmpleado;
    }
    
    public void setTipoEmpleado(TipoEmpleado tipoEmpleado) {
        this.tipoEmpleado = tipoEmpleado;
    }
    public TipoPersona getTipoPersona() {
        return this.tipoPersona;
    }
    
    public void setTipoPersona(TipoPersona tipoPersona) {
        this.tipoPersona = tipoPersona;
    }




}

