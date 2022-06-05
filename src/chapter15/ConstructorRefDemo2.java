package chapter15;

// Продемонстрировать применение ссылки на
// конструктор обобщенного класса

// Теперь функциональный интерфейс MyFunc
// объявляется как обобщенный
interface MyFunc5<T> {
    MyClass5<T> func(T n);
}

class MyClass5<T> {
    private T val;

    // Этот конструктор принимает один аргумент
    MyClass5(T val) {
        this.val = val;
    }

    // А это конструктор по умолчанию
    MyClass5() {
        this.val = null;
    }

    public T getVal() {
        return val;
    }
}

public class ConstructorRefDemo2 {
    public static void main(String[] args) {
        // создать ссылку на констурктор обобщенного класса
        // MyClass<T>
        MyFunc5<Integer> myClassCons = MyClass5::new;

        // создать экземпляр класса MyClass<T>
        // по данной ссылке на конструктор
        MyClass5<Integer> mc = myClassCons.func(100);

        // воспользоваться только что созданным экземпляром
        // класса MyClass<T>
        System.out.println("Значение val в объекте " +
                "mc равно " + mc.getVal());
    }
}
