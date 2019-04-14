public class Main {

    public static void main(String[] args) {
        Temperature t = new Temperature();

        t.addObserver(new ThermometerCelsius());
        t.addObserver(new ThermometerFahrenheit());

        t.setValue(100);
    }

}