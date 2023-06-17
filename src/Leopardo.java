public class Leopardo extends Felinos{
    private int num_lunares;
    private int presas_capturadas;

    //constructor con la extension de la clase Felinos
    public Leopardo(String raza, String nombre, int edad, String habitat, int peso, int num_lunares, int presas_capturadas) {
        super(raza, nombre, edad, habitat, peso);
        this.num_lunares = num_lunares;
        this.presas_capturadas = presas_capturadas;
    }

    //getters and setters


    public int getNum_lunares() {
        return num_lunares;
    }

    public void setNum_lunares(int num_lunares) {
        this.num_lunares = num_lunares;
    }

    public int getPresas_capturadas() {
        return presas_capturadas;
    }

    public void setPresas_capturadas(int presas_capturadas) {
        this.presas_capturadas = presas_capturadas;
    }

    //Metodo
    public void trepar() {
        System.out.println("EL leoardo tiene una gran facilidad de trepar");
    }

    public void imprimirleopardo() {
        System.out.println("=== Información del Leopardo ===");
        System.out.println("Raza: " + getRaza());
        System.out.println("Nombre: " + getNombre());
        System.out.println("Edad: " + getEdad());
        System.out.println("Hábitat: " + getHabitat());
        System.out.println("Peso: " + getPeso());
        System.out.println("Número de Lunares: " + num_lunares);
        System.out.println("Presas Capturadas: " + presas_capturadas);
        trepar();
        cazar();
        rugir();
    }

}
