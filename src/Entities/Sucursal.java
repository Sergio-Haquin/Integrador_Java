package Entities;

import java.time.LocalTime;

public class Sucursal extends Base {
    private String nombre;
    private LocalTime horarioApertura;
    private LocalTime horarioCierre;
    private Domicilio domicilio;

    public Sucursal(Long ID, String nombre, LocalTime horarioApertura, LocalTime horarioCierre, Domicilio domicilio) {
        super(ID);
        this.nombre = nombre;
        this.horarioApertura = horarioApertura;
        this.horarioCierre = horarioCierre;
        this.domicilio = domicilio;
    }
}
