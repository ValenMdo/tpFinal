package modelos;

public class Main {

    public static void main(String[] args) throws Exception {
        Trabajador trabajador1 = new Trabajador(101, "Carlos", "carlos@gmail.com");
        Trabajador trabajador2 = new Trabajador(102, "Ana", "ana@gmail.com");

        Ticket ticket1 = new Ticket("Error en la red", "No hay conexión a internet", trabajador1);
        Ticket ticket2 = new Ticket("Fallo en impresora", "No imprime correctamente", trabajador2);

        Tecnico tecnico1 = new Tecnico(108, "Juan", "juan@gmail.com");
        Tecnico tecnico2 = new Tecnico(109, "Jorge", "jorge@gmail.com");
        
        BaseUsuarios sistemaUs1 = new BaseUsuarios();

        Administrador admin1 = new Administrador(99, "Cesar", "cesar@gmail.com", sistemaUs1);
        
        //admin1.crearUsuario(66, "Juli", "Tecnico");
        sistemaUs1.agregarUsuario(trabajador1);
        
        sistemaUs1.mostrarBase();
        
        trabajador2.crearTicket("no anda la pc", "dejo de andar", trabajador2);
        trabajador2.getTicketsCreados();
        
        ticket2.mostrarTicket();
        
        

    }
}
