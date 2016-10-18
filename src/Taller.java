/**
 * Created by DAM on 13/10/16.
 */
import java.util.Comparator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;


public class Taller {
    //hashet no permite tener duplicados, va muy rápido (en la búsqueda del map).
    //Set con equals comprueba que no hayan objetos duplicados.

    private Map <Persona,Coche> reparaciones = new TreeMap<>(Comparator.comparing(Persona::getNumSS));

    public void registrarReparacion(Persona persona, Coche coche){
        reparaciones.put(persona, coche);

    }

    public Coche obtenerCoche(Persona persona){
        return reparaciones.get(persona);
    }

    public Set <Persona> obtenerClientes(){
        return reparaciones.keySet();

    }
}
