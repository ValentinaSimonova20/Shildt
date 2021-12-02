package chapter11;

// Создать второй поток иполнения, расширив класс Thread
public class NewThreadExt extends Thread{
    NewThreadExt() {
        // создать новый поток исполнения
        super("Демонстрационный поток");
        System.out.println("Дочерний поток: " + this);
        start(); // запустить поток на исполнение
    }

    // Точка входа во второй поток исполнения
    @Override
    public void run() {
        try{
            for(int i = 5; i > 0; i--) {
                System.out.println("Дочерний поток: " + i);
                Thread.sleep(500);
            }
        } catch (InterruptedException e) {
            System.out.println("Дочерний поток прерван.");
        }
        System.out.println("Дочерний поток завершен.");
    }
}

class ExtendThreadDemo {
    public static void main(String[] args) {
        new NewThreadExt(); // создать новый поток исполнения

        try {
            for(int i = 5; i > 0; i--) {
                System.out.println("Главныый поток: " + i);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            System.out.println("Главный поток прерван.");
        }
    }
}
