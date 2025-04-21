package modelos;

public abstract class Usuario {

    private Integer id;
    private String nombre;
    private String contraseña;
    private String email;

    public Usuario(Integer id, String nombre, String email) {
        this.id = id;
        this.nombre = nombre;
        this.email = email;
        this.contraseña = nombre; // Inicialmente igual al nombre
    }

    public Integer getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setContraseña(String nuevaContraseña) {
        this.contraseña = nuevaContraseña;
    }

    public boolean validarContraseña(String contraseña) {
        return this.contraseña.equals(contraseña);
    }

    public String getEmail() {
        return email;
    }

    public void CambiarEmail(String email) {
        this.email = email;
    }

    public abstract String obtenerTipoUsuario();

    @Override
    public String toString() {
        return "id:" + id + ", nombre:" + nombre + ", email:" + email;
    }

}
