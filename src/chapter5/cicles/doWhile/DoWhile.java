package chapter5.cicles.doWhile;

// Продемонстрировать применение оператора цикла do-while
public class DoWhile {
    public static void main(String[] args) {
        int n = 10;

        do{
            System.out.println("такт "+n);
        }while (--n > 0);
    }
}
