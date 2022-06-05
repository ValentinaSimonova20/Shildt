package chapter14;

// В этой версии класса Stats аргумент типа T должен
// быть классом Number или наследуемым от нег классом
public class Stats<T extends Number> {
    T[] nums; // массив класса Number или его подкласса

    // передать конструктору ссылку на массив элементов
    // Number или его подкласса
    public Stats(T[] nums) {
        this.nums = nums;
    }

    // возвратить значение типа double в любом случае
    double average() {
        double sum = 0.0;
        for (T num : nums) {
            sum += num.doubleValue();
        }
        return sum / nums.length;
    }

    // Определить равенство двух средних значений.
    // Обратите ванимание на применение
    // метасимвола подстановки
    boolean saveAvg(Stats<?> ob) {
        return average() == ob.average();
    }
}

// продемонстрировать применение класса Stats
class BoundsDemo {
    public static void main(String[] args) {
        Integer inums[] = {1, 2, 3, 4, 5};
        Stats<Integer> iob = new Stats<>(inums);
        double v = iob.average();
        System.out.println("Срднее значение iob равно " + v);

        Double dnums[] = {1.1, 2.2, 3.3, 4.4, 5.5};
        Stats<Double> dob = new Stats<>(dnums);
        double w = dob.average();
        System.out.println("Среднее значение dob равно " + w);
    }
}
