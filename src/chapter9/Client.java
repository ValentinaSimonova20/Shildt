package chapter9;

public class Client implements Callback {
    // реализовать интерфейс callback
    @Override
    public void callback(int param) {
        System.out.println("Метод callback(), вызываемый "+param);
    }

    void nonIfaceMeth() {
        System.out.println("В классах, реализующих интерфейсы, могут определяться и другие члены");
    }
}
