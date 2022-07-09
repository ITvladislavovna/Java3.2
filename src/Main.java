public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double m = 57;
        double h = 167;
        double i = service.calculate(57, 167);
        System.out.printf("Индекс массы тела:%.3f", i);
    }
}
