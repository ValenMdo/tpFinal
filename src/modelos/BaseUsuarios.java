package modelos;

import java.util.HashMap;
import java.util.Map;

public class BaseUsuarios {

    private Map<Integer, Usuario> usuarios;
    private Map<Integer, Boolean> usuariosBloqueados;

    public BaseUsuarios() {
        this.usuarios = new HashMap<>();
        this.usuariosBloqueados = new HashMap<>();
    }

    public void agregarUsuario(Usuario usuario) {
        usuarios.put(usuario.getId(), usuario);
        usuariosBloqueados.put(usuario.getId(), false); // Se inicializa como no bloqueado
    }

    public Usuario getUsuario(Integer id) {
        return usuarios.get(id);
    }

    public void bloquearUsuario(Integer id) {
        if (usuarios.containsKey(id) && !usuariosBloqueados.getOrDefault(id, false)) {
            usuariosBloqueados.put(id, true);
        }
    }

    public void desbloquearUsuario(Integer id) {
        if (usuarios.containsKey(id) && usuariosBloqueados.getOrDefault(id, false)) {
            //Si el id existe, devuelve su valor (true o false).
            // Si el id NO existe, devuelve false por defecto.
            usuariosBloqueados.put(id, false); //actualiza su valor de bloqueado a FALSE
            System.out.println("el Usuario: " + usuarios.get(id).toString() + " se desbloqueo");
        }
    }

    public boolean esUsuarioBloqueado(Integer id) {
        return usuariosBloqueados.getOrDefault(id, false);
    }

    public void eliminarUsuario(Integer id) {
        if (usuarios.containsKey(id)) {
            System.out.println("Usuario: " + usuarios.get(id).getNombre() + " se eliminó.");
            usuarios.remove(id);
            usuariosBloqueados.remove(id); // También eliminamos su estado de bloqueo si existe
        } else {
            System.out.println("No se encontró un usuario con ID: " + id);
        }
    }

    public void mostrarBase() {
        if (usuarios.isEmpty()) {
            System.out.println("No hay usuarios registrados en el sistema.");
            return;
        }

        System.out.println("Lista de usuarios en el sistema:");
        for (Usuario usuario : usuarios.values()) {
            System.out.println(usuario);
        }
    }

    public Map<Integer, Usuario> getUsuarios() {
        return usuarios;
    }
    
    

}
