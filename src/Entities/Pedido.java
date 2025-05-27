package Entities;

import Entities.Enums.Estado;
import Entities.Enums.FormaPago;
import Entities.Enums.TipoEnvio;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Set;

public class Pedido extends Base{
    private LocalTime horaEstimadaFinalizacion;
    private Double total;
    private Estado estado;
    private TipoEnvio tipoEnvio;
    private FormaPago formaPago;
    private LocalDate FechaPedido;
    private Factura factura;
    private Set<DetallePedido> detallePedidos;

    public Pedido() {

    }

    public Pedido(Long ID, LocalTime horaEstimadaFinalizacion, Double total, Estado estado, TipoEnvio tipoEnvio, FormaPago formaPago, LocalDate FechaPedido) {
        super(ID);
        this.horaEstimadaFinalizacion = horaEstimadaFinalizacion;
        this.total = total;
        this.estado = estado;
        this.tipoEnvio = tipoEnvio;
        this.formaPago = formaPago;
        this.FechaPedido = FechaPedido;
        this.detallePedidos = detallePedidos;
    }

    public LocalTime getHoraEstimadaFinalizacion() {
        return horaEstimadaFinalizacion;
    }

    public void setHoraEstimadaFinalizacion(LocalTime horaEstimadaFinalizacion) {
        this.horaEstimadaFinalizacion = horaEstimadaFinalizacion;
    }

    public Double getTotal() {
        return total;
    }

    public void setTotal(Double total) {
        this.total = total;
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    public TipoEnvio getTipoEnvio() {
        return tipoEnvio;
    }

    public void setTipoEnvio(TipoEnvio tipoEnvio) {
        this.tipoEnvio = tipoEnvio;
    }

    public FormaPago getFormaPago() {
        return formaPago;
    }

    public void setFormaPago(FormaPago formaPago) {
        this.formaPago = formaPago;
    }

    public LocalDate getFechaPedido() {
        return FechaPedido;
    }

    public void setFechaPedido(LocalDate fechaPedido) {
        FechaPedido = fechaPedido;
    }

    public void agregarFactura(Factura factura){
        this.factura = factura;
    }

    public void agregarDetalle(DetallePedido d) {
        detallePedidos.add(d);
    }

    public void mostrarDetallePedido() {
        for(DetallePedido d : detallePedidos) {
            System.out.println(d);
        }
    }

}
