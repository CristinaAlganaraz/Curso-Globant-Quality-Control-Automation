package Entidades;

public class Madre {
    private String[] hijos;

    public Madre() {
    }

    public Madre(String[] hijos) {
        this.hijos = hijos;
    }

    public String[] getHijos() {
        return hijos;
    }

    public void setHijos(String[] hijos) {
        this.hijos = hijos;
    }

    @Override
    public String toString() {
        return "Madre{" + "hijos=" + hijos + '}';
    }
}
