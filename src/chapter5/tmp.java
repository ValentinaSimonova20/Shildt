package chapter5;

public class tmp {
    public static void main(String[] args) {
        A aB = new B();
        A aC = new C();
        B bB = new B();
        B bC = new C();
        C cC = new C();

        System.out.println(aC.sum(1,1));

        System.out.println(bB.diff(1,2));

        System.out.println(bC.diff(1,2));

    }
}

interface A{
    int sum(int x, int y);
}

class B implements A{
    @Override
    public int sum(int x, int y) {
        return x + y;
    }

    public int diff(int x, int y){
        return x - y;
    }
}

class C extends B{
    public int mult(int x, int y){return x*y;}
    public int diff(int x, int y){return y - x;}
}
