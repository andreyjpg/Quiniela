
package quiniela;

public class Curiosidad {
   private int idCuriosidad;
   private String descripcion;
   
   public Curiosidad() {
       idCuriosidad = 0;
       descripcion = "";
   }

    public int getIdCuriosidad() {
        return idCuriosidad;
    }

    public void setIdCuriosidad(int idCuriosidad) {
        this.idCuriosidad = idCuriosidad;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
