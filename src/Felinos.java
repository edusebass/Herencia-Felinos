public class Felinos {
    //Atributos clase Felinos
    private String raza;
    private String nombre;
    private int edad;
    private String habitat;
    private int peso;

    //constructor clase Felino

    public Felinos(String raza, String nombre, int edad, String habitat, int peso) {
        this.raza = raza;
        this.nombre = nombre;
        this.edad = edad;
        this.habitat = habitat;
        this.peso = peso;
    }

    //getters and setters clase felinos

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getHabitat() {
        return habitat;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    //metodos felinos
    public void rugir() {
        System.out.println("Este es el metodo rugir de la clase felino");
    }
    public void cazar() {
        System.out.println("Este es el metodo cazar de la clase felino");
    }
}
