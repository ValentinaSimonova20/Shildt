package chapter8;


class A2{
    A2(){
        System.out.println("В конструкторе A.");
    }
}

class B2 extends A2{
    B2(){
        System.out.println("В конструкторе B.");
    }
}

class C2 extends B2{
    C2(){
        System.out.println("В конструкторе C");
    }
}

public class CallingCons {
    public static void main(String[] args) {
        C2 c = new C2();
    }
}
