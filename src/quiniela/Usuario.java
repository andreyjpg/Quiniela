
package quiniela;
import JFrame.CrearUsuario;
import JFrame.IniciarSesion;
import javax.swing.JOptionPane;
public class Usuario {
    private int x,y=0,opc;
    private int idUsuario;
    private String nombreUsuario;
    private String nombre;
    private String apellido;
    private String contraseña;
    private String carrera;
    private String correo;
    private int puntos;
    
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
        
    }
    public void Login(){
        String contraIng;
        String correoIng;
        correoIng=IniciarSesion.correo_is.getText();
        contraIng=IniciarSesion.contraseña_is.getText();
        for(y=0;y<Arrays.arrayUsuario.length;y++){
            if(correoIng.equals(Arrays.arrayUsuario[x].getCorreo())){
                if(contraIng.equals(Arrays.arrayUsuario[x].getContraseña())){
                    //MenúparaUsuarios
                    JOptionPane.showMessageDialog(null,"Sesión Iniciada");
                    break;
                }
            }
        }//Fin for
        
    }
   
    
}
