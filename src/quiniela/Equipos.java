
package quiniela;


public class Equipos {
    private int idEquipo;
    private String nombreEquipo;

    public int getIdEquipo() {
        return idEquipo;
    }

    public void setIdEquipo(int idEquipo) {
        this.idEquipo = idEquipo;
    }

    public String getNombreEquipo() {
        return nombreEquipo;
    }

    public void setNombreEquipo(String nombreEquipo) {
        this.nombreEquipo = nombreEquipo;
    }
    
    public Equipos(){
        idEquipo = 0;
        nombreEquipo = "";
    }
}
