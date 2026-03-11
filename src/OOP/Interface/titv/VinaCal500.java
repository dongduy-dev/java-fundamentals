package OOP.Interface.titv;

public class VinaCal500 implements Calculator{
    @Override
    public double add(double a, double b) {
        return a + b;
    }

    @Override
    public double sub(double a, double b) {
        return a - b;
    }

    @Override
    public double mul(double a, double b) {
        return a * b;
    }

    @Override
    public double div(double a, double b) {
        if (b == 0) {
            return 0;
        }
        return a / b;
    }
}
