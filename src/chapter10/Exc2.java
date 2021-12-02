package chapter10;

public class Exc2 {
    public static void main(String[] args) {
        int d, a;

        try { // проконтролировать блок кода
            d = 0;
            a = 42 / d;
            System.out.println("Это не будет выведено");
        } catch (ArithmeticException e) {
            // перехватить ошибку делания на нуль
            System.out.println("Деление на нуль");
        }
        System.out.println("После оператора catch.");
    }
}
