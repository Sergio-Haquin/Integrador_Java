package Entities;

public abstract class Articulo extends Base {
    protected String denominacion;
    protected Double precioVenta;

    public Articulo() {

    }

    public Articulo(Long ID, String denominacion, Double precioVenta) {
        super(ID);
        this.denominacion = denominacion;
        this.precioVenta = precioVenta;
    }
}
