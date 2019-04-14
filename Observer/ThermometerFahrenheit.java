public class ThermometerFahrenheit implements Observer {

    public void update(Subject s) {
        Temperature t = (Temperature) s;
        double value = 1.8 * (t.getValue()) + 32;
        System.out.println("Temperature: "+value);
    }

}