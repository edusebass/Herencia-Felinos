public class Leon extends Felinos{
    private int medida_melena;
    private String rugido;

    //constructor


    public Leon(String raza, String nombre, int edad, String habitat, int peso, int medida_melena, String rugido) {
        super(raza, nombre, edad, habitat, peso);
        this.medida_melena = medida_melena;
        this.rugido = rugido;
    }

    public int getMedida_melena() {
        return medida_melena;
    }

    public void setMedida_melena(int medida_melena) {
        this.medida_melena = medida_melena;
    }

    public String getRugido() {
        return rugido;
    }

    public void setRugido(String rugido) {
        this.rugido = rugido;
    }

    //metodo
    public void rugir() {
        System.out.println("Rugir del metodo leon");
    }

    public void imprimirleon() {
        System.out.println("=== Información del Leon ===");
        System.out.println("Raza: " + getRaza());
        System.out.println("Nombre: " + getNombre());
        System.out.println("Edad: " + getEdad());
        System.out.println("Hábitat: " + getHabitat());
        System.out.println("Peso: " + getPeso());
        System.out.println("Medida de melena: " + medida_melena);
        System.out.println("Intesidad de rugido: " + rugido);
        rugir();
        cazar();
        rugir();
    }
}
