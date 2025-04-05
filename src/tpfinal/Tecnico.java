package tpfinal;

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

    public void atenderTicket(Ticket ticket) throws Exception {
        if (puedeAtenderMásTickets()) {
            ticketsAtendidos.add(ticket);
            ticket.setEstado(EstadoTicket.ATENDIDO);
            ticket.setTecnico(this);
        } else {
            throw new Exception("No puedes atender más de 3 tickets.");
        }
    }

    public void ReAbrirTicket(Ticket ticket) throws Exception {
        if (puedeAtenderMásTickets()) {
            ticketsAtendidos.add(ticket);
            ticket.setEstado(EstadoTicket.REABIERTO);
            ticket.setTecnico(this);
        } else {
            throw new Exception("No puedes atender más de 3 tickets.");
        }
    }

    public void resolverTicket(Ticket ticket) {
        if (ticket.getTecnicos().contains(this) == true && ticketsAtendidos.contains(ticket)) {
            ticket.setEstado(EstadoTicket.RESUELTO);
            ticketsAtendidos.remove(ticket);
            ticketsResueltos.add(ticket);
        } else {
            System.out.println("\nEl tecnico no tiene este ticket a resolver.");
        }
    }

    public void DejarTicket(Ticket ticket) {
        if (ticket.getEstado() == EstadoTicket.ATENDIDO && ticketsAtendidos.contains(ticket)) {
            ticketsAtendidos.remove(ticket);
            ticket.desasignarTecnico(this);
            ticket.setEstado(EstadoTicket.NO_ATENDIDO);
        }else {
            System.out.println("\nEl tecnico no tiene este ticket a resolver.");
        }
    }

    public void incrementarFallas() {
        fallas++;
    }

    public int obtenerFallas() {
        return fallas;
    }
}
