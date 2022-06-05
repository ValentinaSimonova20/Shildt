package chapter12;

// Продемонстрировать оболочку числового типа
public class Wrap {
    public static void main(String[] args) {
        Integer iOb = new Integer(100);

        int i = iOb.intValue();

        System.out.println(i + " " + iOb);

        Integer iOb2 = 100; // автоупаковка значения типа int

        int i2 = iOb2; // автораспаковка
    }

    // Аннотирование метода
    @MyAnno(str = "Пример аннотации", val = 100)
    public static void myMeth() {

    }
}
