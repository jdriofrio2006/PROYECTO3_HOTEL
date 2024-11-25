package udla.hernansanchez.edu.ec;

import java.util.ArrayList;
import java.util.List;

public class Habitaciones {
    private List<Tipodereservaciones> listaReservas;

    public Habitaciones() {
        listaReservas = new ArrayList<>();
    }

    public void agregarReserva(Tipodereservaciones reserva) {
        listaReservas.add(reserva);
    }

    public String mostrarReservas() {
        if (listaReservas.isEmpty()) {
            return "No hay reservas registradas.";
        }

        StringBuilder builder = new StringBuilder("Listado de Reservas:\n");
        for (Tipodereservaciones reserva : listaReservas) {
            builder.append(reserva.toString()).append("\n");
        }
        return builder.toString();
    }
}