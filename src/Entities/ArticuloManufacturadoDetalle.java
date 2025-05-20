package Entities;

public class ArticuloManufacturadoDetalle extends Base{
    private Integer cantidad;
    private ArticuloInsumo insumo;

    public ArticuloManufacturadoDetalle() {

    }

    public ArticuloManufacturadoDetalle(Long ID, Integer cantidad) {
        super(ID);
        this.cantidad = cantidad;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }

    public ArticuloInsumo getInsumo() {
        return insumo;
    }

    public void setInsumo(ArticuloInsumo insumo) {
        this.insumo = insumo;
    }
}
