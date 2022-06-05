package chapter12;

// Ошибка, порождаемая ручной распаковкой
public class UnboxingError {
    public static void main(String[] args) {
        Integer iOb = 1000; //автоупаковка значения 1000

        int i = iOb.byteValue(); // ручная распаковка значени как относящегося
        // к типу byte!!

        System.out.println(i); // значение 1000 не выводится!
    }
}
