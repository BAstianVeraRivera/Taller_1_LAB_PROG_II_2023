import java.util.ArrayList;

public class Launcher {
    public static void main(String[] args) {
        inicializar();
    }

    public static void inicializar() {
        Tienda techy = new Tienda("Techy", "San martin 2034");
        techy.mostrarMenu();
    }
}
