package finalProjectCS141;

public class Recyclable {
    private String name;
    private double grams;
    private double carbonOutput;

    public Recyclable(String n, double c) {
        name = n;
        carbonOutput = c;
        grams = 0;
    }

    public void add(double amount) {
        grams += amount;
    }

    public double getWeight() {
        return grams;
    }

    public double getCarbonSaved() {
        return grams * carbonOutput * 0.001;
    }

    public double getCarbonOutput() {
        return carbonOutput;
    }

    public String getName() {
        return name;
    }
}