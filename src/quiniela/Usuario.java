
package quiniela;
import JFrame.AñadirPartidos;
import quiniela.Arrays;
import JFrame.CrearUsuario;
import JFrame.IniciarSesion;
import JFrame.MenuUsuarios;
import javax.swing.JOptionPane;
public class Usuario {
    public int x=0,y=0,opc;
    private int idUsuario;
    private String nombreUsuario;
    private String nombre;
    private String apellido;
    private String contraseña;
    private String carrera;
    private String correo;
    private int puntos;
    private boolean esAdmin;
    
   
    
    public Usuario() {
        
        idUsuario = 0;
        nombreUsuario = "";
        nombre = "";
        apellido = "";
        contraseña = "";
        carrera = "";
        correo = "";
        puntos = 0;
        
    }

    public boolean isEsAdmin() {
        return esAdmin;
    }

    public void setEsAdmin(boolean esAdmin) {
        this.esAdmin = esAdmin;
    }

    

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public int getPuntos() {
        return puntos;
    }

    public void setPuntos(int puntos) {
        this.puntos = puntos;
    }
    
    public void RegistrarUsuario(){
        if(x<Arrays.arrayUsuario.length){
        Usuario user=new Usuario();
        user.nombre=CrearUsuario.Nombre.getText();
        user.apellido=CrearUsuario.Apellidos.getText();
        user.correo=CrearUsuario.Correo.getText();
        user.contraseña=CrearUsuario.Password.getText();
        user.carrera=CrearUsuario.Carrera.getText();
        user.idUsuario=(int)(Math.random()*9999999);
        Arrays.arrayUsuario[x]=user;
        JOptionPane.showMessageDialog(null,
         "***DATOS GUARDADOS DEL PERFIL***\n\nNombre: "
         +Arrays.arrayUsuario[x].getNombre()+"\nApellidos: "
         +Arrays.arrayUsuario[x].getApellido()+"\nCorreo: "
         +Arrays.arrayUsuario[x].getCorreo()+"\nContraseña: "
         +Arrays.arrayUsuario[x].getContraseña()+"\nCarrera: "
                 +Arrays.arrayUsuario[x].getCarrera()+"\nId.: "
                 +Arrays.arrayUsuario[x].getIdUsuario());
        x++;
        }else{
            JOptionPane.showMessageDialog(null,
                    "Límite de usuarios permitidos alcanzado");
        }
    }
    public void Login(){
        String contraIng;
        String correoIng;
        correoIng=IniciarSesion.correo_is.getText();
        contraIng=IniciarSesion.contraseña_is.getText();
        for(y=0;y<x;y++){

             if(correoIng.equals(Arrays.arrayUsuario[x].getCorreo())){
                if(contraIng.equals(Arrays.arrayUsuario[x].getContraseña())){
                    if(Arrays.arrayUsuario[y].esAdmin==true){
                        AñadirPartidos a=new AñadirPartidos();
                        a.setVisible(true);
                        break;
                    }else{
                       MenuUsuarios m=new MenuUsuarios();
                       m.setVisible(true);
                       break;
                    }
                }
            }
        }//Fin for
        
    }
    public void ordenarRanking(){
    Usuario aux=new Usuario();
    int i=0;
        for(i=0;i<Arrays.arrayUsuario.length;i++){
            if(Arrays.arrayUsuario[y].getPuntos()<Arrays.arrayUsuario[y+1].getPuntos()){
                aux=Arrays.arrayUsuario[y+1];
                Arrays.arrayUsuario[y+1]=Arrays.arrayUsuario[y];
                Arrays.arrayUsuario[x]=aux;
            }
        }
    }
    
    public void mostrarRanking(){
        String s="";
        int posicion=1;
        int i=0;
        for(i=0;i<Arrays.arrayUsuario.length;i++){
            s=s+posicion+" "+Arrays.arrayUsuario[i].getNombre()+" "
              +Arrays.arrayUsuario[y].getApellido()+" "+Arrays.arrayUsuario[y].getPuntos();
            posicion++;
        }
        JOptionPane.showMessageDialog(null,
                "   ***TABLA DE POSICIONES***   \n\n"+s);
    }
   }

