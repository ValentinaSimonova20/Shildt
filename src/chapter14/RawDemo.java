package chapter14;

// продемонстрировать базовый тип
class Gen2<T> {
    T ob; // объявить объект типа T

    // передать конструктору ссылку на объект типа T
    Gen2(T ob) {
        this.ob = ob;
    }

    T getob() {
        return ob;
    }
}

// Продемонстрировать применение базового типа
public class RawDemo {
    public static void main(String[] args) {

        // Создать объект типа Gen для целых чисел
        Gen2<Integer> iOb = new Gen2<>(88);

        // создать объект типа Gen и присвоить ему значение типа Double
        Gen2<String> strOb = new Gen2<>("Тест обобщений");

        // создать объект типа Gen и присвоить ему
        // значение типа Double
        Gen2 raw = new Gen2(new Double(98.6));

        //Требуется приведение типов, поскольку тип неизвестен
        double d = (Double) raw.getob();
        System.out.println("Значние: " + d);
        strOb = raw;
        raw = iOb;
    }
}
