package Entities;

public class DetallePedido extends Base{
    private Integer cantidad;
    private Double subTotal;
    private Articulo articulo;

    public DetallePedido() {
    }

    public DetallePedido(Long ID, Integer cantidad, Double subTotal, Articulo articulo) {
        super(ID);
        this.cantidad = cantidad;
        this.subTotal = subTotal;
        this.articulo = articulo;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }

    public Double getSubTotal() {
        return subTotal;
    }

    public void setSubTotal(Double subTotal) {
        this.subTotal = subTotal;
    }

    public Articulo getArticulo() {
        return articulo;
    }

    public void setArticulo(Articulo articulo) {
        this.articulo = articulo;
    }

    @Override
    public String toString() {
        return "DetallePedido{" +
                "cantidad=" + cantidad +
                ", subTotal=" + subTotal +
                '}';
    }
}
