public class RutaMasRapida implements Strategy {
    @Override
    public String calcularRuta(String puntoA, String puntoB) {

        return "Ruta más rápida entre " + puntoA + " y " + puntoB;
    }
}