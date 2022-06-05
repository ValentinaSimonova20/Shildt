package chapter14;

// Простой обобщенный класс.
// Здесь Т обозначает параметр типа,
// который будет заменен реальным типом
// при создании объекта типа Gen
class Gen<T> {
    T ob; // объявить объект типа T

    // передать конструктору ссылку на объект типа T
    Gen(T ob) {
        this.ob = ob;
    }

    T getOb() {
        return this.ob;
    }

    // показать типа T
    void showType() {
        System.out.println("Типом T является " +
                ob.getClass().getName());
    }
}

// продемонстрировать применение обобщенного класса
public class GenDemo {
    public static void main(String[] args) {
        // Создать ссылку типа Gen для целых чисел
        Gen<Integer> iOb;

        // Создать объект типа Gen<Integer> и присвоить
        // ссылку на него переменной iOb. Обратите внимание на
        // применение автоупаковки для инкапсуляции значения 88
        // в объекте типа Integer

        iOb = new Gen<>(88);

        // показать тип данных, хранящихся в перемнноц iOb
        iOb.showType();

        int v = iOb.getOb();
        System.out.println("Значение: " + v);
        System.out.println();
        }
}
