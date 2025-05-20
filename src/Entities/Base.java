package Entities;

public abstract class Base {
    protected Long ID;

    public Base() {

    }

    public Base(Long ID) {
        this.ID = ID;
    }

    public Long getID() {
        return ID;
    }

    public void setID(Long ID) {
        this.ID = ID;
    }
}
