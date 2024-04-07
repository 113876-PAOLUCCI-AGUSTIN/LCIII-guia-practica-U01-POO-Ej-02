public class Punto {
    private Integer valorEjeX;
    private Integer valorEjeY;

    // CONSTRUCTORS.
    public Punto(Integer valorEjeX, Integer valorEjeY) {
        this.valorEjeX = valorEjeX;
        this.valorEjeY = valorEjeY;
    }

    public Punto() {
    }

    // GETTERS & SETTERS
    public Integer getValorEjeX() {
        return valorEjeX;
    }

    public void setValorEjeX(Integer valorEjeX) {
        this.valorEjeX = valorEjeX;
    }

    public Integer getValorEjeY() {
        return valorEjeY;
    }

    public void setValorEjeY(Integer valorEjeY) {
        this.valorEjeY = valorEjeY;
    }

    @Override
    public String toString() {
        return "Punto{" +
                "valorEjeX=" + valorEjeX +
                ", valorEjeY=" + valorEjeY +
                '}';
    }
}
