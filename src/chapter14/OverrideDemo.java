package chapter14;

// Переопрделение обобщенного метода в обобщенном классе
class Gen8<T> {
    T ob; // объявить объект типа T

    // передать конструктору ссылку на объект типа T
    Gen8(T ob) {
        this.ob = ob;
    }

    // возвратить объект ob
    public T getOb() {
        System.out.print("Метод getob() из класса Gen: ");
        return ob;
    }
}


class Gen9<T> extends Gen8<T> {

    Gen9(T o) {
        super(o);
    }

    // переопределить метод getob()
    @Override
    public T getOb() {
        System.out.print("Метод getob() из класса Gen2: ");
        return ob;
    }
}

// продемонстрировать переопределение обобщенных методов
public class OverrideDemo {
    public static void main(String[] args) {
        // создать объект типа Gen8 для целых чисел
        Gen8<Integer> iOb = new Gen8<>(88);

        // создать объект типа Gen9 для целых чисел
        Gen9<Integer> iOb2 = new Gen9<>(99);

        Gen9<String> strOb2 = new Gen9<>("Тест обобщений");
        System.out.println(iOb.getOb());
        System.out.println(iOb2.getOb());
        System.out.println(strOb2.getOb());
    }
}
