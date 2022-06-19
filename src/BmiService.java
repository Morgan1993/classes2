public class BmiService {
    public double calculate(double height, int weight) {
        double heightM = height / 100;
        return weight / (heightM * heightM);
    }
}
