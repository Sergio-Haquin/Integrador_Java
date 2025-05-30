package Entities;

import java.util.ArrayList;
import java.util.List;

public abstract class Articulo extends Base {
    protected String denominacion;
    protected Double precioVenta;
    protected UnidadMedida unidadMedida;
    protected List<Imagen> imagenes;

    public Articulo() {

    }

    public Articulo(Long ID, String denominacion, Double precioVenta, UnidadMedida unidadMedida, List<Imagen> imagenes) {
        super(ID);
        this.denominacion = denominacion;
        this.precioVenta = precioVenta;
        this.unidadMedida = unidadMedida;
        this.imagenes = new ArrayList<>();
    }
}
