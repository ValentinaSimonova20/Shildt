package chapter8;

/**
 * В иерархии классов закрытые члены остаются
 * закрытыми в пределах своего класса.
 *
 */
// создать суперкласс
class C{
    int i;
    private int j; // закрыт в классе A

    void setij(int x, int y){
        i = x;
        j = y;
    }
}

class D extends C{
    int total;

    void sum(){
        //total = i+j; член j - недоступен
    }
}

public class Access {
    public static void main(String[] args) {
        D subOb = new D();
        subOb.setij(10, 12);
        subOb.sum();
    }
}
