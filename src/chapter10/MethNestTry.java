package chapter10;

/* Операторы try могут быть неявно вложены в вызовы методов*/
public class MethNestTry {
    static void nesttry(int a) {
        try { // вложенный блок оператора try
            if(a == 1) {
                a = a / (a-a);
            }

            if(a == 2) {
                int[] c = {1};
                c[42] = 99;
            }

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Индекс за пределами массива");
        }
    }

    public static void main(String[] args) {
        try {
            int a = args.length;

            int b = 42/a;
            System.out.println("a = " + a);
            nesttry(a);
        } catch (ArithmeticException e) {
            System.out.println("Деление на нуль: " + e);
        }
    }
}
