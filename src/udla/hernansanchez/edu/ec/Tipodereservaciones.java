package udla.hernansanchez.edu.ec;

public abstract class Tipodereservaciones {
    protected int id;
    protected String nombre;
    protected String apellido;
    protected int tipoHabitacion; // 1: Suite, 2: Doble, 3: Simple, 4: Deluxe
    protected int numeroHabitacion;

    public Tipodereservaciones(int id, String nombre, String apellido, int tipoHabitacion, int numeroHabitacion) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.tipoHabitacion = tipoHabitacion;
        this.numeroHabitacion = numeroHabitacion;
    }

    public abstract void reservar();

    @Override
    public String toString() {
        String tipo = switch (tipoHabitacion) {
            case 1 -> "Suite";
            case 2 -> "Habitación Doble";
            case 3 -> "Habitación Simple";
            case 4 -> "Habitación Deluxe";
            default -> "Desconocido";
        };

        return "ID: " + id +
                ", Nombre: " + nombre +
                ", Apellido: " + apellido +
                ", Tipo de Habitación: " + tipo +
                ", Número de Habitación: " + numeroHabitacion;
    }
}