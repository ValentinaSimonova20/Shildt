package chapter8;

abstract class AbstractA {
    abstract void callme();

    // абстрактные классы все же могут
    // содержать конкретные методы
    void callmetoo(){
        System.out.println("Это конкретный метод");
    }
}

class AbstractB extends AbstractA {
    void callme(){
        System.out.println("Реализация метода callme() в классе B");
    }
}


public class AbstractDemo {
    public static void main(String[] args) {
        AbstractB abstractB = new AbstractB();

        abstractB.callme();
        abstractB.callmetoo();
    }
}
