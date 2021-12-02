package chapter10;

// Продемонстрировать многократный перехват
public class MultiCatch {
    public static void main(String[] args) {
        int a = 10, b = 0;
        int[] vals = {1,2,3};

        try {
            int result = a / b; // сгенерировать исключение типа Arithmetic Exc
            vals[10] = 19; // исключение indexOutOfBounds
        } catch (ArithmeticException | ArrayIndexOutOfBoundsException exception) {
            System.out.println("Искобчение перехвачено");
        }
        System.out.println("После мнгократного перехвата");
    }
}
