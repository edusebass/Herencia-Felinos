public class Puma extends Felinos{
    private int velocidadMaxima;
    private String ubicacion;

    //constructor
    public Puma(String raza, String nombre, int edad, String habitat, int peso, int velocidadMaxima, String ubicacion) {
        super(raza, nombre, edad, habitat, peso);
        this.velocidadMaxima = velocidadMaxima;
        this.ubicacion = ubicacion;
    }

    //getters and setters


    public int getVelocidadMaxima() {
        return velocidadMaxima;
    }

    public void setVelocidadMaxima(int velocidadMaxima) {
        this.velocidadMaxima = velocidadMaxima;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    //metodos
    public void velocidadPuma() {
        System.out.println("Velocidad del puma");
    }

    //
    public void imprimirPuma() {
        System.out.println("=== Información del Puma ===");
        System.out.println("Raza: " + getRaza());
        System.out.println("Nombre: " + getNombre());
        System.out.println("Edad: " + getEdad());
        System.out.println("Hábitat: " + getHabitat());
        System.out.println("Peso: " + getPeso());
        System.out.println("Ubicacion: " + ubicacion);
        System.out.println("Velocidad maxima: " + velocidadMaxima);
        velocidadPuma();
        cazar();
        rugir();
    }
}
