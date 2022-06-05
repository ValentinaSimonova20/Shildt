package chapter15;

// Продемонстрировать применение ссылки на конструктор

// В функциональном интерфейсе MyFunc определяется
// метод, возвращающий ссылку на класс MyClass
interface MyFunc4 {
    MyClass4 func(int n);
}

class MyClass4 {
    private int val;

    // этот конструктор принимает один аргумент
    public MyClass4(int val) {
        this.val = val;
    }

    // А это конструктор по умолчанию
    MyClass4() {
        val = 0;
    }

    public int getVal() {
        return val;
    }
}

public class ConstructorRefDemo {
    public static void main(String[] args) {

        // Создать ссылку на конструктор класса MyClass.
        // метод func() из интерфейса MyFunc принимает
        // аргумент, поэтому в операции new вызывается параметризированный
        // конструктор класса MyClass,
        // а не к его конструктор по умолчанию
        MyFunc4 myClassCons = MyClass4::new;

        // создать экземпляр класса MyClass
        // по ссылке на его конструктор
        MyClass4 mc = myClassCons.func(100);

        // использовать только что созданный экземпляр класса
        // MyClass
        System.out.println("Значение val в объекте mc равно " +
                mc.getVal());
    }
}
