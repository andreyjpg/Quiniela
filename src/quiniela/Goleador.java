
package quiniela;


public class Goleador {
    private int usuario;
    private String jugador;
    private int puntos;
    
    public Goleador(){
        usuario = 0;
        jugador = "";
        puntos = 0;
    }

    public int getUsuario() {
        return usuario;
    }

    public void setUsuario(int usuario) {
        this.usuario = usuario;
    }

    public String getJugador() {
        return jugador;
    }

    public void setJugador(String jugador) {
        this.jugador = jugador;
    }

    public int getPuntos() {
        return puntos;
    }

    public void setPuntos(int puntos) {
        this.puntos = puntos;
    }
    
}
