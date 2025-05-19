package Entities;

public class Domicilio extends Base {
    private String calle;
    private Integer numero;
    private Integer cp;
    private Localidad localidad;

    public Domicilio(Long ID,String calle, Integer numero, Integer cp) {
        super(ID);
        this.calle = calle;
        this.numero = numero;
        this.cp = cp;
    }
}
