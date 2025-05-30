package Entities;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Cliente extends Base{
    private String nombre;
    private String apellido;
    private String telefono;
    private String email;
    private LocalDate fechaNacimiento;
    private List<Pedido> pedidos;
    private Usuario usuario;
    private Domicilio domicilio;
    private Imagen imagen;

    public Cliente() {

    }

    public Cliente(Long ID, String nombre, String apellido, String telefono, String email, LocalDate fechaNacimiento, List<Pedido> pedidos, Usuario usuario, Domicilio domicilio, Imagen imagen) {
        super(ID);
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
        this.email = email;
        this.fechaNacimiento = fechaNacimiento;
        this.pedidos = new ArrayList<>();
        this.usuario = usuario;
        this.domicilio = domicilio;
        this.imagen = imagen;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public void agregarPedido(Pedido pedido){
        pedidos.add(pedido);
    }

    public void agregarUsuario(Usuario usuario) { this.usuario = usuario; }

}
