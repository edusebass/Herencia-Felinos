public class Gato extends Felinos{
    private Boolean mascota;
    private String nombre_dueño;

    //constructor
    public Gato(String raza, String nombre, int edad, String habitat, int peso, Boolean mascota, String nombre_dueño) {
        super(raza, nombre, edad, habitat, peso);
        this.mascota = mascota;
        this.nombre_dueño = nombre_dueño;
    }

    //getters and setters

    public Boolean getMascota() {
        return mascota;
    }

    public void setMascota(Boolean mascota) {
        this.mascota = mascota;
    }

    public String getNombre_dueño() {
        return nombre_dueño;
    }

    public void setNombre_dueño(String nombre_dueño) {
        this.nombre_dueño = nombre_dueño;
    }

    //metodo
    public void maullar() {
        System.out.println("Este es el metodo maullar de gato");
    }
}
