package chapter11;

public class DemoJoin {
    public static void main(String[] args) {
        NewThreadMultiThread ob1 = new NewThreadMultiThread("Один");
        NewThreadMultiThread ob2 = new NewThreadMultiThread("Два");
        NewThreadMultiThread ob3 = new NewThreadMultiThread("Три");

        System.out.println("Поток Один запущен: " + ob1.t.isAlive());
        System.out.println("Поток Два запущен: " + ob2.t. isAlive());
        System.out.println("Поток три запущен: " + ob3.t.isAlive());

        // ожидать завершения потоков исполнения
        try {
            System.out.println("Ожидать завершения потоков.");
            ob1.t.join();
            ob2.t.join();
            ob3.t.join();
        } catch (InterruptedException e) {
            System.out.println("Главный поток прерван");
        }

        System.out.println("Поток один запущен: " + ob1.t.isAlive());
        System.out.println("Поток два запущен: " + ob2.t.isAlive());
        System.out.println("Поток три запущен: " + ob3.t.isAlive());
    }
}
