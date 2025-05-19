package Entities;

public class Provincia extends Base {
    private String nombre;
    private Pais pais;

    public Provincia(Long ID, String nombre, Pais pais) {
        super(ID);
        this.nombre = nombre;
        this.pais = pais;
    }
}
