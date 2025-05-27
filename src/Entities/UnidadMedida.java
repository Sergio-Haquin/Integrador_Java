package Entities;

public class UnidadMedida extends Base {
    private String denominacion;

    public UnidadMedida() {

    }

    public UnidadMedida(Long ID, String denominacion) {
        super(ID);
        this.denominacion = denominacion;
    }

    public String getDenominacion() {
        return denominacion;
    }

    public void setDenominacion(String denominacion) {
        this.denominacion = denominacion;
    }
}
