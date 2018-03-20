
package Domain;


public class Zapato {
    
    private int numCalzado;

    public Zapato() {
        this.numCalzado = 0;
    }

    public Zapato(int numCalzado) {
        this.numCalzado = numCalzado;
    }

    public int getNumCalzado() {
        return numCalzado;
    }

    public void setNumCalzado(int numCalzado) {
        this.numCalzado = numCalzado;
    }

    @Override
    public String toString() {
        return "Zapato{" + "numCalzado=" + numCalzado + '}';
    }
    
    
    
}
