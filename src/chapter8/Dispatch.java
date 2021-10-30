package chapter8;

// Динамиечская диспетчеризация методов
class A4{
    void callme(){
        System.out.println("В методе callme() из класса A");
    }
}

class B4 extends A4{
    // переопределить метод callme()
    void callme(){
        System.out.println("В методе callme() из класса B");
    }
}

class C4 extends A4{
    // переопределить метод callme()
    void callme(){
        System.out.println("В методе callme() из класса C");
    }
}

public class Dispatch {
    public static void main(String[] args) {
        A4 a = new A4(); // объект класса A
        B4 b = new B4(); // объект класса B
        C4 c = new C4(); // объект класса C

        A4 r; // получить ссылку на объект типа A

        r = a; // переменная r ссылается на объект типа A
        r.callme(); // вызвать вариант метода callme()
                    // определенный в классе A

        r = b; // переменная r ссылается на объект типа B
        r.callme(); // вызвать вариант метода callme(),
                    // определенный в классе B

        r = c; // переменная r ссылается на объект типа C
        r.callme(); // вызвать вариант метода callme(),
                    // определенный в классе C


    }
}
