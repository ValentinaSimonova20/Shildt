package chapter7;


class Test5{
    int a; // доступ, определяемый по умолчанию
    public int b; // открытый доступ
    private int c; // закрытый доступ

    // методы доступа к члену данного класса
    public int getC() {
        return c;
    }

    public void setC(int c) {
        this.c = c;
    }
}

public class AccessTest {
    public static void main(String[] args) {
        Test5 ob = new Test5();

        ob.a = 10;
        ob.b = 20;

        ob.setC(100);

        System.out.println("a, b, и c: "+ob.a+" "+
                ob.b+" "+ob.getC());
    }
}
