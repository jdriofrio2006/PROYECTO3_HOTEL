import udla.hernansanchez.edu.ec.Habitaciones;
import udla.hernansanchez.edu.ec.Reservaciones;

import javax.swing.*;

public class Hotel {
    public static void main(String[] args) {
        Habitaciones habitaciones = new Habitaciones();
        int eleccion;

        do {
            eleccion = Integer.parseInt(JOptionPane.showInputDialog(
                    null,
                    "INGRESE EL TIPO DE HABITACIÓN A RESERVAR:\n" +
                            "1) SUITE\n" +
                            "2) HABITACIÓN DOBLE\n" +
                            "3) HABITACIÓN SIMPLE\n" +
                            "4) HABITACIÓN DELUXE\n" +
                            "5) VER LISTADO DE RESERVAS\n" +
                            "6) SALIR\n",
                    "---Bienvenido a HOTEL HACKATÓN---",
                    JOptionPane.INFORMATION_MESSAGE));

            if (eleccion >= 1 && eleccion <= 4) {
                String nombre = JOptionPane.showInputDialog("Ingrese su nombre:");
                String apellido = JOptionPane.showInputDialog("Ingrese su apellido:");
                int id = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el ID de su reserva:"));
                int numeroHabitacion = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número de habitación:"));

                Reservaciones reserva = new Reservaciones(id, nombre, apellido, eleccion, numeroHabitacion);
                habitaciones.agregarReserva(reserva);

                JOptionPane.showMessageDialog(null, "¡Reserva realizada con éxito!");
            } else if (eleccion == 5) {
                JOptionPane.showMessageDialog(null, habitaciones.mostrarReservas());
            }
        } while (eleccion != 6);

        JOptionPane.showMessageDialog(null, "¡Gracias por usar el sistema de reservas del Hotel Hackatón!");
    }
}