public class Temperature extends Subject {

    private double value = 0.0;

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
        notifyObservers();
    }

}