public class Tigre extends Felinos{
    private int num_rayas;
    private String salto;

    //constructor

    public Tigre(String raza, String nombre, int edad, String habitat, int peso, int num_rayas, String salto) {
        super(raza, nombre, edad, habitat, peso);
        this.num_rayas = num_rayas;
        this.salto = salto;
    }

    //getters and setters

    public int getNum_rayas() {
        return num_rayas;
    }

    public void setNum_rayas(int num_rayas) {
        this.num_rayas = num_rayas;
    }

    public String getSalto() {
        return salto;
    }

    public void setSalto(String salto) {
        this.salto = salto;
    }

    //metodo
    public void trepar_Arbol() {
        System.out.println("Metodo trapar arboles de la clase tigre");
    }

    public void imprimirtigre() {
        System.out.println("=== Información del Tigre ===");
        System.out.println("Raza: " + getRaza());
        System.out.println("Nombre: " + getNombre());
        System.out.println("Edad: " + getEdad());
        System.out.println("Hábitat: " + getHabitat());
        System.out.println("Peso: " + getPeso());
        System.out.println("Numero de rayas: " + num_rayas);
        System.out.println("Salto: " + salto);
        trepar_Arbol();
        cazar();
        rugir();
    }
}
