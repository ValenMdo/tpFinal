package controlador;

import modelos.Trabajador;
import modelos.Ticket;

public class TrabajadorControlador {

    private Trabajador trabajador;

    public TrabajadorControlador(Trabajador trabajador) {
        this.trabajador = trabajador;
    }

    public void crearTicket(String titulo, String descripcion) {
        Ticket nuevoTicket = trabajador.crearTicket(titulo, descripcion);
        System.out.println("Ticket creado: " + nuevoTicket);
    }

    public void getTicketsCreados() {
        if (trabajador.getTicketsCreados().isEmpty()) {
            System.out.println("No hay tickets registrados en el sistema.");
        }

        System.out.println("Lista de tickets creados por " + trabajador.getNombre() + ": ");
        for (Ticket ticket : trabajador.getTicketsCreados()) {
            System.out.println(ticket);
        }
    }

}
