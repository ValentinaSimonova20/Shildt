package chapter14;

// ситуация в которой создается мостовой метод
class Gen10<T> {
    T ob; // объявить объект типа T

    // передать конструктору ссылку на объект типа T
    Gen10(T ob) {
        this.ob = ob;
    }

    public T getOb() {
        return ob;
    }
}

class Gen11 extends Gen10<String> {
    Gen11(String o) {
        super(o);
    }

    @Override
    public String getOb() {
        System.out.print("Вызван метод String getob: ");
        return ob;
    }
}



// продемонстрировать ситуацию, когда
// требуется мостовой метод
public class BridgeDemo {
    public static void main(String[] args) {
        // создать объект типа Gen11 для символьных строк
        Gen11 strOb2 = new Gen11("Тест обобщений");

        System.out.println(strOb2.getOb());
    }
}
