
package quiniela;

import java.util.function.Function;


public class Arrays {
    public Partido[] arrayPartidos = new Partido[100];
    private Usuario[] arrayUsuario = new Usuario[30];
    private Marcadores[] usuarioPartidos = new Marcadores[3000];
    private Equipos[] arrayEquipos = new Equipos[40];
    private Curiosidad[] curiosidades = new Curiosidad[10];
    private Campeon[] campeonesUsuario = new Campeon[30];
    private Goleador[] goleadoresUsuario = new Goleador[30];
    
    public void add( Partido data ){
        for (int count = 0; count < this.arrayPartidos.length; count++){
            if ( this.arrayPartidos[count] == null ){
              this.arrayPartidos[count] = data;
              break;
            }
        }
    }
    
    public Partido get( int index){
        return this.arrayPartidos[index];
    }
            
    public void add( Usuario data ){
        for (int count = 0; count < this.arrayUsuario.length; count++){
            if ( this.arrayUsuario[count] == null ){
              this.arrayUsuario[count] = data;
              break;
            }
        }
    }
    
    public void add( Marcadores data ){
        for (int count = 0; count < this.usuarioPartidos.length; count++){
            if ( this.usuarioPartidos[count] == null ){
              this.usuarioPartidos[count] = data;
              break;
            }
        }
    }
    public void add( Equipos data ){
        for (int count = 0; count < this.arrayEquipos.length; count++){
            if ( this.arrayEquipos[count] == null ){
              this.arrayEquipos[count] = data;
              break;
            }
        }
    }
    
    public void add( Curiosidad data ){
        for (int count = 0; count < this.curiosidades.length; count++){
            if ( this.curiosidades[count] == null ){
              this.curiosidades[count] = data;
              break;
            }
        }
    }
    
    
    public void add( Campeon data ){
        for (int count = 0; count < this.campeonesUsuario.length; count++){
            if ( this.campeonesUsuario[count] == null ){
              this.campeonesUsuario[count] = data;
              break;
            }
        }
    }
    
    public void add( Goleador data ){
        for (int count = 0; count < this.goleadoresUsuario.length; count++){
            if ( this.goleadoresUsuario[count] == null ){
              this.goleadoresUsuario[count] = data;
              break;
            }
        }
    }
}



