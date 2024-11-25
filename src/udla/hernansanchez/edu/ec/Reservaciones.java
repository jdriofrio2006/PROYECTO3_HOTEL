package udla.hernansanchez.edu.ec;

public class Reservaciones extends Tipodereservaciones {

    public Reservaciones(int id, String nombre, String apellido, int tipoHabitacion, int numeroHabitacion) {
        super(id, nombre, apellido, tipoHabitacion, numeroHabitacion);
    }

    @Override
    public void reservar() {
        // Lógica adicional para la reserva si es necesario
        System.out.println("Reserva realizada: " + this);
    }
}