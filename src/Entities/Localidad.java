package Entities;

public class Localidad extends Base {
    private String nombre;
    private Provincia provincia;

    public Localidad(Long ID, String nombre, Provincia provincia) {
        super(ID);
        this.nombre = nombre;
        this.provincia = provincia;
    }
}
