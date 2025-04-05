package tpfinal;

import java.util.Scanner;

public class Administrador extends Usuario {

    private BaseUsuarios sistemaUsuarios;

    public Administrador(Integer id, String nombre, String email, BaseUsuarios sistemaUsuarios) {
        super(id, nombre, email);
        this.sistemaUsuarios = sistemaUsuarios;
    }

    @Override
    public String obtenerTipoUsuario() {
        return "Administrador";
    }

    public void crearUsuario(Integer id, String nombre, String tipoUsuario) {
        if (sistemaUsuarios == null) {
            System.out.println("Error: El sistema de usuarios no está inicializado.");
            return;
        }

        String email;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese mail del usuario: ");
        email = scanner.nextLine();
        scanner.close();

        switch (tipoUsuario.toLowerCase()) {
            case "trabajador":
                Trabajador trabajador = new Trabajador(id, nombre, email);
                sistemaUsuarios.agregarUsuario(trabajador);
                System.out.println("Trabajador " + nombre + " creado.");
                break;

            case "tecnico":
                Tecnico tecnico = new Tecnico(id, nombre, email);
                sistemaUsuarios.agregarUsuario(tecnico);
                System.out.println("Técnico " + nombre + " creado.");
                break;

            default:
                System.out.println(" Error: Tipo de usuario no válido. Debe ser 'trabajador' o 'tecnico'.");
                break;
        }
    }

    public void bloquearUsuario(Integer id) {
        
        
        Usuario usuario = sistemaUsuarios.getUsuario(id);
        if (usuario != null && usuario instanceof Usuario) {
            sistemaUsuarios.bloquearUsuario(id);
            System.out.println("Usuario " + usuario.getNombre() + " bloqueado.");
        } else {
            System.out.println("ID no corresponde a un usuario.");
        }
    }

    public void incrementarFallas(Tecnico tecnico) {
        tecnico.incrementarFallas();
        tecnico.obtenerFallas();
    }
}
