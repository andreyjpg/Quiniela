
package quiniela;


public class Campeon {
    private int usuario;
    private String equipo;
    private int puntos;
    
    public Campeon(){
        usuario = 0;
        equipo = "";
        puntos = 0;
    }

    public int getUsuario() {
        return usuario;
    }

    public void setUsuario(int usuario) {
        this.usuario = usuario;
    }

    public String getEquipo() {
        return equipo;
    }

    public void setEquipo(String equipo) {
        this.equipo = equipo;
    }

    public int getPuntos() {
        return puntos;
    }

    public void setPuntos(int puntos) {
        this.puntos = puntos;
    }
    
    
}
