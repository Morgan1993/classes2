public class Main {
    public static void main(String[] args) {
        BmiService bmiService = new BmiService();
        int heightSm = 190;
        int weightKg = 85;
        System.out.printf("BMI = %.2f", bmiService.calculate(heightSm, weightKg));
    }
}