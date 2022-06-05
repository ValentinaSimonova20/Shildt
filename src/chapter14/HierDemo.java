package chapter14;

// В подкласс могут быть введены свои параметры типа
class Gen3<T> {
    T ob; // объявить объек типа T

    // передать конструктору ссылку на объект типа T
    Gen3(T ob) {
        this.ob = ob;
    }

    // возвратить ссылку ob
    T getOb() {
        return ob;
    }
}

class Gen4<T, V> extends Gen3<T> {
    V ob2;

    Gen4(T o, V o2) {
        super(o);
        ob2 = o2;
    }

    V getOb2() {
        return ob2;
    }
}

public class HierDemo {
    public static void main(String[] args) {
        // создать объекты типа Gen4 для
        // символьных строк целых чисел
        Gen4<String, Integer> x = new Gen4<>("Значение равно: ", 99);

        System.out.println(x.getOb());
        System.out.println(x.getOb2());
    }
}
