package Entities;

public class Provincia extends Base {
    private String nombre;
    private Pais pais;

    public Provincia() {

    }

    public Provincia(Long ID, String nombre) {
        super(ID);
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Pais getPais() {
        return pais;
    }

    public void setPais(Pais pais) {
        this.pais = pais;
    }
}
