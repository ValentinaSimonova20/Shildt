package chapter10;

// продемонстрировать цепочки исключений
public class ChainExcDemo {
    static void demoproc() {

        NullPointerException e =
                new NullPointerException("верхний уровень");
        e.initCause(new ArithmeticException("причина"));
        throw e;
    }

    public static void main(String[] args) {
        try {
            demoproc();
        } catch (NullPointerException e) {
            // вывести исключение верхнего уровня
            System.out.println("Пеехвачно исключение: " + e);

            // вывести исключение, послеживашее причиной
            // для исключения верхнего уровня
            System.out.println("Первопричина: " + e.getCause());
        }
    }
}
