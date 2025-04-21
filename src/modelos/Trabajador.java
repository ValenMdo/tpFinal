package modelos;

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

    public Ticket crearTicket(String titulo, String descripcion) {
        Ticket nuevoTicket = new Ticket(titulo, descripcion, this);
        ticketsCreados.add(nuevoTicket);
        return nuevoTicket;
    }

    public List<Ticket> getTicketsCreados() {
        return ticketsCreados;
    }

}
