public class RutaMasCorta implements Strategy {
    @Override
    public String calcularRuta(String puntoA, String puntoB) {

        return "Ruta más corta entre " + puntoA + " y " + puntoB;
    }
}