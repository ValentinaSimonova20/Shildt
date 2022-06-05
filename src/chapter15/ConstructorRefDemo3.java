package chapter15;

// Реализовать простую фабрику классов,
// используя ссылку на конструктор

interface MyFunc6<R, T> {
    R func(T n);
}

// Простой обобщенный класс
class MyClass6<T> {
    private T val;

    // конструктор принимающий один параметр
    public MyClass6(T val) {
        this.val = val;
    }

    // конструктор по умолчанию. Этот конструктор в данной
    // программе НЕ используется
    MyClass6() {
        this.val = null;
    }

    T getVal() {
        return val;
    }
}

// Простой необобщенный класс
class MyClass7 {
    String str;

    // конструктор принимающий один аргумент
    public MyClass7(String str) {
        this.str = str;
    }

    // конструктор по умолчанию. Этот конструктор в данной
    // программе не используется
    MyClass7() {
        str = "";
    }

    public String getStr() {
        return str;
    }
}


public class ConstructorRefDemo3 {

    // Фабричный метод для объектов разных классов.
    // У каждого класса должен быть свой конструктор,
    // принимающий один параметр типа T. А параметр R
    // обозначает тип создаваемого объекта
    static <R, T> R myClassFactory(MyFunc6<R, T> cons, T v) {
        return cons.func(v);
    }

    public static void main(String[] args) {
        // Создать ссылку на конструктор класса MyClass.
        // Здесь в операции new вызывается конструктор,
        // принимающий аргумент
        MyFunc6<MyClass6<Double>, Double> myClassCons =
                MyClass6::new;

        // создать экземпляр типа класса MyClass,
        // используя фабричный метод
        MyClass6<Double> mc = myClassFactory(myClassCons, 100.1);

        // использовать только что созданный экземпляр
        // класса MyClass
        System.out.println("Значение val в объекте " +
                "mc равно " + mc.getVal());

        // А теперь создать экземпляр другого класса, используя метод
        // myClassFactory
        MyFunc6<MyClass7, String> myClassCons2 = MyClass7::new;

        // создать экземпляр класса MyClass2,
        // используя фабричный метод
        MyClass7 mc2 = myClassFactory(myClassCons2, "Лямбда");

        System.out.println("Значение str в объекте " + "mc2 равно " + mc2.getStr());
    }
}
