package chapter14;

// Простой обобщенный класс с двумя параметрами типа: T и V
public class TwoGen<T, V> {
    T ob1;
    V ob2;

    // передать конструктору ссылки на объекты типа T и V
    public TwoGen(T ob1, V ob2) {
        this.ob1 = ob1;
        this.ob2 = ob2;
    }

    // показать типы T и V
    void showTypes() {
        System.out.println("Тип T: " + ob1.getClass().getName());
        System.out.println("Тип V: " + ob2.getClass().getName());
    }

    public T getOb1() {
        return ob1;
    }

    public V getOb2() {
        return ob2;
    }
}

// продемонстрировать применение класса TwoGen
class SimpGen {
    public static void main(String[] args) {
        TwoGen<Integer, String> tgObj =
                new TwoGen<>(88, "Обобщения");

        tgObj.showTypes();

        int v = tgObj.getOb1();
        System.out.println("Значение: " + v);

        String str = tgObj.getOb2();
        System.out.println("Значние: " + str);
    }

}
