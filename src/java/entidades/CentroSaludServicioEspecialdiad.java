package entidades;
// Generated 25-ago-2015 21:41:00 by Hibernate Tools 4.3.1



/**
 * CentroSaludServicioEspecialdiad generated by hbm2java
 */
public class CentroSaludServicioEspecialdiad  implements java.io.Serializable {


     private Integer idCentroSaludEspecialidad;
     private CentroSalud centroSalud;
     private ServicioEspecialidad servicioEspecialidad;
     private String estado;

    public CentroSaludServicioEspecialdiad() {
    }

	
    public CentroSaludServicioEspecialdiad(CentroSalud centroSalud, ServicioEspecialidad servicioEspecialidad) {
        this.centroSalud = centroSalud;
        this.servicioEspecialidad = servicioEspecialidad;
    }
    public CentroSaludServicioEspecialdiad(CentroSalud centroSalud, ServicioEspecialidad servicioEspecialidad, String estado) {
       this.centroSalud = centroSalud;
       this.servicioEspecialidad = servicioEspecialidad;
       this.estado = estado;
    }
   
    public Integer getIdCentroSaludEspecialidad() {
        return this.idCentroSaludEspecialidad;
    }
    
    public void setIdCentroSaludEspecialidad(Integer idCentroSaludEspecialidad) {
        this.idCentroSaludEspecialidad = idCentroSaludEspecialidad;
    }
    public CentroSalud getCentroSalud() {
        return this.centroSalud;
    }
    
    public void setCentroSalud(CentroSalud centroSalud) {
        this.centroSalud = centroSalud;
    }
    public ServicioEspecialidad getServicioEspecialidad() {
        return this.servicioEspecialidad;
    }
    
    public void setServicioEspecialidad(ServicioEspecialidad servicioEspecialidad) {
        this.servicioEspecialidad = servicioEspecialidad;
    }
    public String getEstado() {
        return this.estado;
    }
    
    public void setEstado(String estado) {
        this.estado = estado;
    }




}

