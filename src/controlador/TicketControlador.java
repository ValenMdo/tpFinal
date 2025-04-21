package controlador;

import modelos.Ticket;
import modelos.Tecnico;

public class TicketControlador {

    private Ticket ticket;

    public TicketControlador(Ticket ticket) {
        this.ticket = ticket;
    }

    public void AsignarTecnico(Tecnico tecnico) throws Exception {
        try {
            if (ticket.setTecnico(tecnico)) {
                System.out.println("tecnico asignado correctamente");
            } else {
                System.out.println("el tecnico ya estaba asignado a este ticket");
            }
        } catch (Exception e) {
            System.out.println("❌ Error al asignar técnico: " + e.getMessage());
        }
    }

    public void DesasignarTecnico(Tecnico tecnico) {
        if (ticket.desasignarTecnico(tecnico)) {
            System.out.println("Técnico desasignado correctamente.");
        } else {
            System.out.println("El técnico no estaba asignado.");
        }
    }

    public void mostrarTicket() {
        System.out.println("Ticket ID: " + ticket.getId());
        System.out.println("Título: " + ticket.getTitulo());
        System.out.println("Descripción: " + ticket.getDescripcion());
        System.out.println("Fecha de creación: " + ticket.getFecha());
        System.out.println("Estado: " + ticket.getEstado());
        System.out.println("Trabajador: " + ticket.getTrabajador().getNombre());
        System.out.println("Técnicos asignados:");

        if (ticket.getTecnicos().isEmpty()) {
            System.out.println("No hay técnicos asignados.");
        } else {
            for (Tecnico tecnico : ticket.getTecnicos()) {
                System.out.println("   - " + tecnico.getNombre());
            }
        }
        System.out.println("--------------------------------------");
    }
}
