package chapter12;


// Автоупаковка/распаковка значений
// из классов Boolean и Character
public class AutoBox5 {
    public static void main(String[] args) {

        // Автаупаковка/распаковка логического
        // значения типа boolean
        Boolean b = true;

        // объкт b автоматически распаковывается,
        // когда он употреблется в условном операторе if
        if(b) {
            System.out.println("b равно true");
        }

        // Автоупаковка/распаковка значения типа char
        Character ch = 'x'; // упаковать значение типа char
        char ch2 = ch; // распаковать значение типа char
        System.out.println("ch2 равно " + ch2);
    }
}
