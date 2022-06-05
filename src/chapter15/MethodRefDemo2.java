package chapter15;

public class MethodRefDemo2 {

    // В этом методе функциональный интерфейс
    // указывается в качестве типа первого его
    // параметра. Следовательно, ему может быть
    // передан любой экземпляр этого интерфейса,
    // включая и ссылку на метод
    static String stringOp(StringFunc sf, String s) {
        return sf.func(s);
    }

    public static void main(String[] args) {
        String inString = "Лямбда-выражения повышают эффективность Java";

        String outStr;

        MyStringOps strOps = new MyStringOps();

        // А теперь ссылка на метод экземпляра strReverse()
        // передается методу stringOp()
        outStr = stringOp(strOps::strReverse, inString);

        System.out.println("Исходная строка: " + inString);
        System.out.println("Обращенная строка: " + outStr);
    }
}
