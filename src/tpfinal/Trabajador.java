package tpfinal;

import java.util.List;
import java.util.ArrayList;

public class Trabajador extends Usuario {

    private List<Ticket> ticketsCreados;

    public Trabajador(Integer id, String nombre, String email) {
        super(id, nombre, email);
        this.ticketsCreados = new ArrayList<>();
    }

    @Override
    public String obtenerTipoUsuario() {
        return "Trabajador";
    }

    public Ticket crearTicket(String titulo, String descripcion, Trabajador trabajador) {
        Ticket nuevoTicket = new Ticket(titulo, descripcion, trabajador);
        ticketsCreados.add(nuevoTicket);
        return nuevoTicket;
    }

    public void getTicketsCreados() {
        if(ticketsCreados.isEmpty()) {
            System.out.println("No hay tickets registrados en el sistema.");
            return;
        }

        System.out.println("Lista de tickets creados por: " + this.getNombre());
        for (Ticket ticket: ticketsCreados) {
            System.out.println(ticket);
        }
    }
}
