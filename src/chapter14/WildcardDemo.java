package chapter14;

// Продемонстрировать применение метасимвола подстановки
public class WildcardDemo {
    public static void main(String[] args) {
        Integer[] inums = {1, 2, 3, 4, 5};
        Stats<Integer> iob = new Stats<>(inums);
        double v = iob.average();
        System.out.println("Среднее значение iob равно " + v);

        Double[] dnums = {1.1, 2.2, 3.3, 4.4, 5.5};
        Stats<Double> dob = new Stats<>(dnums);
        double w = dob.average();
        System.out.println("Среднее значение dob равно " + w);

        Float[] fnums = {1.0F, 2.0F, 3.0F, 4.0F, 5.0F};
        Stats<Float> fob = new Stats<>(fnums);
        double x = fob.average();
        System.out.println("Среднее значение fob равно " + x);

        // выяснить, какие массивы имеют
        // одинаковые средние значения
        System.out.print("Средние значения iob и dob ");
        if(iob.saveAvg(dob)) {
            System.out.println("Равны");
        } else {
            System.out.println("Отличаются");
        }

        System.out.print("Средние значения iob и fob ");
        if(iob.saveAvg(fob)) {
            System.out.println("одинаковы.");
        } else {
            System.out.println("отличаются");
        }
    }
}
