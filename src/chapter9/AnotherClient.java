package chapter9;

public class AnotherClient implements Callback{
    @Override
    public void callback(int param) {
        System.out.println("Еще один вариант метода callback()");
        System.out.println("p в квадрате равно " + (param*param));
    }
}
