package chapter11;

// Создать второй поток исполнения
public class NewThread implements Runnable{
    Thread t;

    NewThread() {
        // создать новый, второй поток исполнения
        t = new Thread(this, "Демонстрационный поток");
        System.out.println("Дочерний поток создан: " + t);
        t.start();
    }

    // Точка входа по второй поток исполнения
    @Override
    public void run() {
        try {
            for(int i = 5; i > 0; i--){
                System.out.println("Дочерний поток: " + i);
                Thread.sleep(500);
            }
        } catch (InterruptedException e) {
            System.out.println("Дочерний поток прерван.");
        }
        System.out.println("Дочерний поток завершен.");
    }
}

class ThreadDemo {
    public static void main(String[] args) {
        new NewThread(); // создатьновый поток
        try {
            for(int i = 5; i > 0; i--) {
                System.out.println("Главный поток: " + i);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            System.out.println("Главный поток прерван.");
        }

        System.out.println("Главный поток завершен");
    }
}
