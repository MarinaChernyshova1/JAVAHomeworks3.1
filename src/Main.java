public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();

        System.out.println("Если вес 98кг/ рост 1,87м");
        System.out.println("Индекс массы тела = " + service.calculate(98, 1.87));
        System.out.println();
        System.out.println("Если вес 68кг/ рост 1,80м");
        System.out.println("Индекс массы тела = " + service.calculate(68, 1.80));
        System.out.println();
        System.out.println("Если вес 98кг/ рост 1,95м");
        System.out.println("Индекс массы тела = " + service.calculate(98, 1.95));

    }
}