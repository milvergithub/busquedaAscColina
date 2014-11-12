package busqueda;

import java.util.ArrayList;
import java.util.List;
/**
 * @author milver
 */
public class Nodo {

    private String elemento;
    private List<Nodo> hijos;

    public Nodo(String elemento) {
            this.elemento = elemento;
            hijos = new ArrayList<Nodo>();
    }
    public String getElemento() {
            return elemento;
    }
    public void addHijo(Nodo hijo) {
            hijos.add(hijo);
    }
    public List<Nodo> getHijos() {
            return hijos;
    }
    public boolean esNodoHoja() {
            return hijos.size() > 0;
    }
}
