package chapter7;

// Продемонстрировать перегрузку методов
public class OverloadDemo {
    void test(){
        System.out.println("Параметры отсутсвуют");
    }



    // Перегруженный метод, проверяющий наличие
    // двух целочисленных параметров
    void test(int a, int b){
        System.out.println("a и b: "+a+" "+b);
    }

    // Перегружаемый метод, проверяющий наличие
    // параметра типа double
    void test(double a){
        System.out.println("Внутреннее преобразование при вызове"+a);
    }

}

class Overload{
    public static void main(String[] args) {
        OverloadDemo ob = new OverloadDemo();
        int i = 88;

        // вызвать все варианты метода test()
        ob.test();
        ob.test(i); // здесь вызывается вариант метода test(double)
        ob.test(123.2); // и здесь
        ob.test(10, 20);

    }
}
