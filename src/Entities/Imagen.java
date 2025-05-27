package Entities;

public class Imagen extends Base{
    private String denomination;

    public Imagen() {
    }

    public Imagen(Long ID, String denomination) {
        super(ID);
        this.denomination = denomination;
    }

    public String getDenomination() {
        return denomination;
    }

    public void setDenomination(String denomination) {
        this.denomination = denomination;
    }
}
