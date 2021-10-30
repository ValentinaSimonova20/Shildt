package chapter7;

// Определить внутренний класс в цикле for
class OuterC{
    int outer_x = 100;

    void test(){
        for(int i = 0; i<10; i++){
            class Inner{
                void display(){
                    System.out.println("вывод: outer_x = "+outer_x);
                }
            }
            Inner inner = new Inner();
            inner.display();
        }

    }
}

public class InnerWithCicleDemo {
    public static void main(String[] args) {
        OuterC outer = new OuterC();
        outer.test();
    }
}
