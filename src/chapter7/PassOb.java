package chapter7;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

// Объекты допускается передавать методам
// в качестве параметров
class Test{
    int a, b;

    Test(int i, int j){
        a = i;
        b = j;
    }

    // возвратить логическое значение true, если в
    // качестве параметра о указан вызывающий объект
    boolean equalTo(Test o){
        if(o.a == a && o.b == b) return true;
        else return false;
    }
}


public class PassOb {
    public static void main(String[] args) {
        Test ob2 = new Test(100, 22);
        Test ob1 = new Test(100, 22);
        Test ob3 = new Test(-1, -1);

        System.out.println("ob1 == ob2: "+ob1.equalTo(ob2));
        System.out.println("ob1 == ob3: "+ob1.equalTo(ob3));
    }



}
