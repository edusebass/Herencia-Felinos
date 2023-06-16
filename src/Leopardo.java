public class Leopardo extends Felinos{
    int num_lunares;
    boolean cazador_nocturno;

    //constructor con la extension de la clase Felinos
    public Leopardo(String raza, String nombre, int edad, String habitat, int peso, int num_lunares, boolean cazador_nocturno) {
        super(raza, nombre, edad, habitat, peso);
        this.num_lunares = num_lunares;
        this.cazador_nocturno = cazador_nocturno;
    }

    public int getNum_lunares() {
        return num_lunares;
    }

    public void setNum_lunares(int num_lunares) {
        this.num_lunares = num_lunares;
    }

    public boolean isCazador_nocturno() {
        return cazador_nocturno;
    }

    public void setCazador_nocturno(boolean cazador_nocturno) {
        this.cazador_nocturno = cazador_nocturno;
    }

    //Metodo
    public void trepar() {
        System.out.println("EL leoardo tiene una gran facilidad de trepar");
    }

}
