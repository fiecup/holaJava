public class holaJava {
    public static void main(String[] args) {
        holaJava decirHola = new holaJava();
        decirHola.a("Faustino!");
        decirHola.a("Cristian!");
        decirHola.a("Mundo!");
        decirHola.a("Java!");
    }

    public void a(String nombre) {
        System.out.println("¡Hola " + nombre);
    }
}
