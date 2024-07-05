public class RutaMasEconomica implements Strategy {
    @Override
    public String calcularRuta(String puntoA, String puntoB) {

        return "Ruta más económica entre " + puntoA + " y " + puntoB;
    }
}