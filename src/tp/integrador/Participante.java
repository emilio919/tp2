
package tp.integrador;


public class Participante {
    private String nombre;
    private Pronostico Pronosticos[];

    public Participante(String nombre, Pronostico[] Pronosticos) {
        this.nombre = nombre;
        this.Pronosticos = Pronosticos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Pronostico[] getPronosticos() {
        return Pronosticos;
    }

    public void setPronosticos(Pronostico[] Pronosticos) {
        this.Pronosticos = Pronosticos;
    }

    @Override
    public String toString() {
        return "Participante{" + "nombre=" + nombre + ", Pronosticos=" + Pronosticos + '}';
    }
    
}
