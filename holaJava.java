public class holaJava {
    // Funcion principal
    public static void main(String[] args) {
        holaJava decirHola = new holaJava();
        decirHola.a("Faustino!");
        decirHola.a("Cristian!");
        decirHola.a("Mundo!");
        decirHola.a("Java!");
    }

    // Metodo del objeto
    public void a(String nombre) {
        System.out.println("¡Hola " + nombre);
    }
}
