package chapter15;

import java.util.ArrayList;
import java.util.Collections;

// Использовать ссылку на метод, чтобы найти
// максимальное значение в коллекции
class MyClass {
    private int val;

    public MyClass(int val) {
        this.val = val;
    }

    public int getVal() {
        return val;
    }
}

public class UseMethodRef {

    // Метод compare(), совместимый с аналогичным
    // методом, определнным в интерфейсе Comparator<T>
    static int compareMC(MyClass a, MyClass b) {
        return a.getVal() - b.getVal();
    }

    public static void main(String[] args) {
        ArrayList<MyClass> a1 = new ArrayList<>();

        a1.add(new MyClass(1));
        a1.add(new MyClass(4));
        a1.add(new MyClass(2));
        a1.add(new MyClass(9));
        a1.add(new MyClass(3));
        a1.add(new MyClass(7));

        MyClass maxValObj = Collections.max(a1, UseMethodRef::compareMC);

        System.out.println("Мааксимальное значение равно: " + maxValObj.getVal());
    }
}
