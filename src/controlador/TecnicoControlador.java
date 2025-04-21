/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import modelos.Tecnico;
import modelos.Ticket;

public class TecnicoControlador {

    private Tecnico tecnico;

    public TecnicoControlador(Tecnico tecnico) {
        this.tecnico = tecnico;
    }

    public void atenderTicket(Ticket ticket) {
        try {
            tecnico.atenderTicket(ticket);
            System.out.println("ticket atendido por " + tecnico.getNombre());
        } catch (Exception e) {
            System.out.println("Error al atender ticket: " + e.getMessage());
        }
    }

    public void reabrirTicket(Ticket ticket) {
        try {
            tecnico.ReAbrirTicket(ticket);
            System.out.println("Ticket reabierto por " + tecnico.getNombre());
        } catch (Exception e) {
            System.out.println("Error al reabrir ticket: " + e.getMessage());
        }
    }

    public void resolverTicket(Ticket ticket) {
        if (tecnico.resolverTicket(ticket)) {
            System.out.println("Ticket resuelto con éxito por " + tecnico.getNombre());
        } else {
            System.out.println("El técnico no tiene asignado este ticket.");
        }
    }

    public void dejarTicket(Ticket ticket) {
        if (tecnico.DejarTicket(ticket)) {
            System.out.println("Ticket dejado por " + tecnico.getNombre());
        } else {
            System.out.println("El técnico no tenía este ticket en atención.");
        }
    }

    public void mostrarTicketsAtendidos() {
        if (tecnico.getTicketsAtendidos().isEmpty()) {
            System.out.println("No hay tickets siendo atendidos por " + tecnico.getNombre());
        } else {
            System.out.println("Tickets actualmente atendidos por " + tecnico.getNombre() + ":");
            for (Ticket ticket : tecnico.getTicketsAtendidos()) {
                System.out.println(ticket);
            }
        }
    }

    public void mostrarTicketsResueltos() {
        if (tecnico.getTicketsResueltos().isEmpty()) {
            System.out.println("No hay tickets resueltos por " + tecnico.getNombre() + " aún.");
        } else {
            System.out.println("Tickets resueltos por el técnico " + tecnico.getNombre() + ":");
            for (Ticket ticket : tecnico.getTicketsResueltos()) {
                System.out.println(ticket);
            }
        }
    }
}
