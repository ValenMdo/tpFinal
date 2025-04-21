package modelos;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Ticket {

    private static int contadorId = 1;
    private int id;
    private String titulo;
    private String descripcion;
    private EstadoTicket estado;
    private List<Tecnico> tecnicos;
    private Trabajador trabajador;
    private final Date fecha;

    // Constructor
    public Ticket(String titulo, String descripcion, Trabajador trabajador) {
        this.id = contadorId++;
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.trabajador = trabajador;
        this.estado = EstadoTicket.NO_ATENDIDO;  // Estado inicial
        this.tecnicos = new ArrayList<>();       // Lista de técnicos vacía
        this.fecha = new Date();                 // Fecha de creación del ticket
    }

    // Getters y Setters para título
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    // Getters y Setters para descripción
    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    // Getters para ID y fecha
    public int getId() {
        return id;
    }

    public Date getFecha() {
        return fecha;
    }

    // Método para asignar un técnico al ticket
    public boolean setTecnico(Tecnico tecnico) throws Exception {
        if (!tecnicos.contains(tecnico)) {
            tecnicos.add(tecnico);
            tecnico.atenderTicket(this);
            return true;
        }
        return false;

    }

    // Método para des-asignar un técnico del ticket
    public boolean desasignarTecnico(Tecnico tecnico) {
        if (tecnicos.contains(tecnico)) {
            tecnicos.remove(tecnico);
            if (tecnicos.isEmpty()) {
                this.setEstado(EstadoTicket.NO_ATENDIDO);
            }
            tecnico.DejarTicket(this);
            return true;
        }
        return false;
    }

    // Método para cambiar el estado del ticket
    public void setEstado(EstadoTicket nuevoEstado) {
        this.estado = nuevoEstado;
    }

    // Getters y Setters para estado
    public EstadoTicket getEstado() {
        return estado;
    }

    // Método para verificar si un técnico está asignado
    public boolean tieneTecnico(Tecnico tecnico) {
        return tecnicos.contains(tecnico);
    }

    public List<Tecnico> getTecnicos() {
        return tecnicos;
    }

    public Trabajador getTrabajador() {
        return trabajador;
    }

    public void mostrarTicket() {
        System.out.println("🔹 Ticket ID: " + id);
        System.out.println("   📌 Título: " + titulo);
        System.out.println("   📝 Descripción: " + descripcion);
        System.out.println("   📅 Fecha de creación: " + fecha);
        System.out.println("   🔄 Estado: " + estado);
        System.out.println("   👤 Trabajador: " + trabajador.getNombre());
        System.out.println("   🔧 Técnicos asignados:");
        if (tecnicos.isEmpty()) {
            System.out.println("   ❌ No hay técnicos asignados.");
        } else {
            for (Tecnico tecnico : tecnicos) {
                System.out.println("   - " + tecnico.getNombre());
            }
        }
        System.out.println("--------------------------------------");
    }

    @Override
    public String toString() {
        return "Ticket{"
                + "\nid=" + id
                + "\ntitulo='" + titulo + '\''
                + "\ndescripcion='" + descripcion + '\''
                + "\nestado=" + estado
                + "\ntecnicos=" + tecnicos
                + "\ntrabajador=" + trabajador
                + "\nfecha=" + fecha + " }";
    }

}
