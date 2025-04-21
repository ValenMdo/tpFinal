package modelos;

import java.util.ArrayList;
import java.util.List;

public class Tecnico extends Usuario {

    private List<Ticket> ticketsResueltos = new ArrayList<>();
    private List<Ticket> ticketsAtendidos = new ArrayList<>();
    private int fallas = 0;

    public Tecnico(Integer id, String nombre, String email) {
        super(id, nombre, email);
    }

    @Override
    public String obtenerTipoUsuario() {
        return "Técnico";
    }

    public boolean puedeAtenderMásTickets() {
        return ticketsAtendidos.size() < 3;
    }

    public boolean atenderTicket(Ticket ticket) throws Exception {
        if (puedeAtenderMásTickets()) {
            ticketsAtendidos.add(ticket);
            ticket.setEstado(EstadoTicket.ATENDIDO);
            ticket.setTecnico(this);
            return true;
        } else {
            throw new Exception("No puedes atender más de 3 tickets.");
        }
    }

    public boolean ReAbrirTicket(Ticket ticket) throws Exception {
        if (puedeAtenderMásTickets()) {
            ticketsAtendidos.add(ticket);
            ticket.setEstado(EstadoTicket.REABIERTO);
            ticket.setTecnico(this);
            return true;
        } else {
            throw new Exception("No puedes atender más de 3 tickets.");
        }
    }

    public boolean resolverTicket(Ticket ticket) {
        if (ticket.getTecnicos().contains(this) == true && ticketsAtendidos.contains(ticket)) {
            ticket.setEstado(EstadoTicket.RESUELTO);
            ticketsAtendidos.remove(ticket);
            ticketsResueltos.add(ticket);
            return true;
        } else {
            return false;
        }
    }

    public boolean DejarTicket(Ticket ticket) {
        if (ticket.getEstado() == EstadoTicket.ATENDIDO && ticketsAtendidos.contains(ticket)) {
            ticketsAtendidos.remove(ticket);
            ticket.desasignarTecnico(this);
            ticket.setEstado(EstadoTicket.NO_ATENDIDO);
            return true;
        } else {
            return false;
        }
    }

    public void incrementarFallas() {
        fallas++;
    }

    public int obtenerFallas() {
        return fallas;
    }

    public List<Ticket> getTicketsResueltos() {
        return ticketsResueltos;
    }

    public void setTicketsResueltos(List<Ticket> ticketsResueltos) {
        this.ticketsResueltos = ticketsResueltos;
    }

    public List<Ticket> getTicketsAtendidos() {
        return ticketsAtendidos;
    }

    public void setTicketsAtendidos(List<Ticket> ticketsAtendidos) {
        this.ticketsAtendidos = ticketsAtendidos;
    }

    public int getFallas() {
        return fallas;
    }

    public void setFallas(int fallas) {
        this.fallas = fallas;
    }

}
