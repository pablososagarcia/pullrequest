public class Personaje {
    private String nom;
    private int dinero;
    private int nivel;

    public Personaje(String nom, int dinero) {
        this.nom = nom;
        this.dinero = dinero;
        this.nivel = 1;
    }

    public void mostrarInfo() {
        System.out.println(nom + " tiene " + dinero + "$ y está en el nivel " + nivel + ".");
    }

    public void subirNivel() {
        nivel++;
        System.out.println(nom + " sube al nivel " + nivel + " !");
    }

    public static void main(String[] args) {
        Personaje jugador = new Personaje("Trevor", 500);
        jugador.mostrarInfo();
        
        jugador.subirNivel(); // Ejemplo de subida de nivel
    }
}
