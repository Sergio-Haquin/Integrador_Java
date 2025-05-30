package Entities;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Categoria extends Base{
    private String denominacion;
    private Categoria categoriaPadre;
    private Set<Categoria> subCategorias = new HashSet<>();
    private List<Articulo> articulos = new ArrayList<>();

    public Categoria() {

    }

    public Categoria(Long ID, String denominacion) {
        super(ID);
        this.denominacion = denominacion;
    }

    public String getDenominacion() {
        return denominacion;
    }

    public void setDenominacion(String denominacion) {
        this.denominacion = denominacion;
    }

    public Categoria getCategoriaPadre() {
        return categoriaPadre;
    }

    public void setCategoriaPadre(Categoria categoriaPadre) {
        this.categoriaPadre = categoriaPadre;
    }

    public Set<Categoria> getSubCategorias() {
        return subCategorias;
    }

    public void setSubCategorias(Set<Categoria> subCategorias) {
        this.subCategorias = subCategorias;
    }

    public List<Articulo> getArticulos() {
        return articulos;
    }

    public void setArticulos(Articulo a) {
        articulos.add(a);
    }
}
