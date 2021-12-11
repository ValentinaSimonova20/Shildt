package chapter11;

// Создать несколько потоков исполнения
public class NewThreadMultiThread implements Runnable{
    String name; // имя потока исполнения
    Thread t;

    public NewThreadMultiThread(String name) {
        this.name = name;
        t = new Thread(this, name);
        System.out.println("Новый поток: " + t);
        t.start(); // запустить поток на исполнение
    }

    // Точка входа в поток исполнения
    @Override
    public void run() {
        try{
            for(int i = 5; i > 0; i--) {
                System.out.println(name + ": " + i);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            System.out.println(name + " прерван");
        }
        System.out.println(name + " завершен.");
    }
}

class MultiThreadDemo {
    public static void main(String[] args) {
        new NewThreadMultiThread("Один");
        new NewThreadMultiThread("Два");
        new NewThreadMultiThread("Три");
        try {
            // ожидать завершения других потокв исполнения
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            System.out.println("Главный поток прерван");
        }
        System.out.println("Главный поток завершен");
    }
}
