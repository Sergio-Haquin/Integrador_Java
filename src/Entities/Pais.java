package Entities;

public class Pais extends Base {
    private String nombre;

    public Pais(Long ID, String nombre) {
        super(ID);
        this.nombre = nombre;
    }
}
