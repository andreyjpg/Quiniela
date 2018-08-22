
package quiniela;

import java.util.function.Function;
import quiniela.Usuario;

public class Arrays {
    public Partido[] arrayPartidos = new Partido[100];
    public  Usuario[] arrayUsuario = new Usuario[30];
    private Marcadores[] usuarioPartidos = new Marcadores[3000];
    private Equipos[] arrayEquipos = new Equipos[40];
    private Curiosidad[] curiosidades = new Curiosidad[10];
    private Campeon[] campeonesUsuario = new Campeon[30];
    private Goleador[] goleadoresUsuario = new Goleador[30];
    

   /* public Arrays() {
        
        arrayUsuario[0].setNombre("Administrador");
        arrayUsuario[0].setCorreo("AndreyAdmin@gmail.com");
        arrayUsuario[0].setContraseña("Administrador");
        arrayUsuario[0].setEsAdmin(true);
    }*/
    
       

    
    public void add( Partido data ){
        for (int count = 0; count < this.arrayPartidos.length; count++){
            if ( this.arrayPartidos[count] == null ){
              this.arrayPartidos[count] = data;
              this.arrayPartidos[count].setIdPartido(count+1);
              break;
            }
        }
    }
    
    // METODOS PARA AÑADIR Y OBTENER LOS PARTIDOS REGISTRADOS POR EL ADMIN
    public Partido get( int index){
        return this.arrayPartidos[index];
    }
    
    public Partido[] getArray(){
        return arrayPartidos;
    }

    public void setArray(Partido[] arrayPartidos) {
        this.arrayPartidos = arrayPartidos;
    }
            
    
      public Usuario getUsuario( int index){
        return this.arrayUsuario[index];
    }
    
    public Usuario[] getArrayUsuario(){
        return arrayUsuario;
    }

    public void setArray(Usuario[] data) {
        this.arrayUsuario = data;
    }
    public void add( Usuario data ){
        for (int count = 0; count < this.arrayUsuario.length; count++){
            if ( this.arrayUsuario[count] == null ){
              this.arrayUsuario[count] = data;
              break;
            }
        }
    }
    
    /*METODOS PARA OBTENER Y AGREGAR DATOS DE LOS MARCADORES 
    PUESTOS POR LOS USUARIOS*/
    public Marcadores getMarcadores( int index){
        return this.usuarioPartidos[index];
    }
    
    public Marcadores[] getArrayMarcadores(){
        return usuarioPartidos;
    }

    public void setArray(Marcadores[] data) {
        this.usuarioPartidos = data;
    }
    
    public void add( Marcadores data ){
        for (int count = 0; count < this.usuarioPartidos.length; count++){
            if ( this.usuarioPartidos[count] == null ){
              this.usuarioPartidos[count] = data;
              break;
            }
        }
    }
    
    /*METODOS PARA OBTENER Y AGREGAR A LOS EQUIPOS REGISTRADOS*/
    public Equipos getEquipos( int index){
        return this.arrayEquipos[index];
    }
    
    public Equipos[] getArrayEquipos(){
        return arrayEquipos;
    }

    public void setArray(Equipos[] data) {
        this.arrayEquipos = data;
    }
    public void add( Equipos data ){
        for (int count = 0; count < this.arrayEquipos.length; count++){
            if ( this.arrayEquipos[count] == null ){
              this.arrayEquipos[count] = data;
              break;
            }
        }
    }
    /* METODOS PARA AGREGAR Y OBTENER DATOS DE LAS CURIOSIDADES AGREGADAS*/
    
    public Curiosidad getCuriosidad( int index){
        return this.curiosidades[index];
    }
    
    public Curiosidad[] getArrayCuriosidad(){
        return curiosidades;
    }

    public void setArray(Curiosidad[] data) {
        this.curiosidades = data;
    }
    public void add( Curiosidad data ){
        for (int count = 0; count < this.curiosidades.length; count++){
            if ( this.curiosidades[count] == null ){
              this.curiosidades[count] = data;
              this.curiosidades[count].setIdCuriosidad(count+1);
              break;
            }
        }
    }
    
    /* METODOS PARA OBTENER Y AGREGAR LOS CAMPEONES REGISTRADOS POR EL USUARIO*/
    public Campeon getCampeon( int index){
        return this.campeonesUsuario[index];
    }
    
    public Campeon[] getArrayCampeon(){
        return campeonesUsuario;
    }

    public void setArray(Campeon[] data) {
        this.campeonesUsuario = data;
    }
    public void add( Campeon data ){
        for (int count = 0; count < this.campeonesUsuario.length; count++){
            if ( this.campeonesUsuario[count] == null ){
              this.campeonesUsuario[count] = data;
              break;
            }
        }
    }
    
    /*METODOS PARA OBTENER Y AGREGAR GOLEADORES REGISTRADOS*/
    public Goleador getGoleador( int index){
        return this.goleadoresUsuario[index];
    }
    
    public Goleador[] getArrayGoleador(){
        return goleadoresUsuario;
    }

    public void setArray(Goleador[] data) {
        this.goleadoresUsuario = data;
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



