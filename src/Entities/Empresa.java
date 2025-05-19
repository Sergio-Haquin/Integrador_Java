package Entities;

public class Empresa extends Base {
    private String nombre;
    private String razonSocial;
    private Integer cuil;
    private Sucursal sucursal;

    public Empresa(Long ID, String nombre, String razonSocial, Integer cuil) {
        super(ID);
        this.nombre = nombre;
        this.razonSocial = razonSocial;
        this.cuil = cuil;
    }
}
