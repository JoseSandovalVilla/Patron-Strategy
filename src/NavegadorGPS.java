public class NavegadorGPS {
    private Strategy strategy;

    public NavegadorGPS(Strategy strategy) {
        this.strategy = strategy;
    }

    public void setRutaStrategy(Strategy strategy) {
        this.strategy = strategy;
    }

    public void calcularRuta(String puntoA, String puntoB) {
        System.out.println(strategy.calcularRuta(puntoA, puntoB));
    }
}