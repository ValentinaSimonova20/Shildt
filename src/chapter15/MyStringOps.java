package chapter15;

// Продемонстрировать ссылку на статический метод

// В этом классе определяется статический
// метод strReverse()
public class MyStringOps {
    // статический метод, изменяющий порядок
    // следования символов в строке
    String strReverse(String str) {
        String result = "";
        int i;

        for(i = str.length() - 1; i >= 0; i--) {
            result += str.charAt(i);
        }
        return result;
    }
}

class MethodRefDemo {

    // В этом методе функциональный интерфейс
    // указывается в качестве типа первого его
    // параметра. Следовательно, ему может быть передан
    // любой экземпляр данного интерфейса,
    // включая и ссылку на метод
    static String stringOp(StringFunc sf, String s) {
        return sf.func(s);
    }

    public static void main(String[] args) {
        String inString = "Лямбда-выражения повышают эффективность Java";

        String outStr;

        // Здесь ссылка на метод strReverse() передается
        // методу stringOp()
       // outStr = stringOp(MyStringOps::strReverse, inString);

        System.out.println("Исходная строка: " + inString);
        //System.out.println("Обращенная строка: " + outStr);
    }
}
