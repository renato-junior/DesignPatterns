public class ThermometerCelsius implements Observer {

    public void update(Subject s) {
        Temperature t = (Temperature) s;
        System.out.println("Temperature: "+t.getValue());
    }

}