package chapter15;
// Блочное выражение, изменяющее на обратный
// порядок следования символов в строке

interface StringFunc {
    String func(String n);
}

public class BlockLambdaDemo2 {
    public static void main(String[] args) {

        StringFunc reverse = (str) -> {
            String result = "";
            int i;

            for(i = str.length() - 1; i>= 0; i--) {
                result += str.charAt(i);
            }

            return result;
        };

        System.out.println("Лямба обращается на " + reverse.func("Лямбда"));
        System.out.println("Выражение обращается на " + reverse.func("Выражение"));
    }
}
