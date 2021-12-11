package chapter11;

import jdk.nashorn.internal.codegen.CompilerConstants;

class Callme {
    synchronized void call(String msg) {
        System.out.print("[" + msg);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            System.out.println("Прервано");
        }
        System.out.println("]");
    }
}

class Caller implements Runnable {

    String msg;
    Callme target;
    Thread t;

    public Caller(String msg, Callme target) {
        this.msg = msg;
        this.target = target;
        this.t = new Thread(this);
        t.start();
    }

    @Override
    public void run() {

            target.call(msg);

    }
}

public class Synch {
    public static void main(String[] args) {
        Callme target = new Callme();
        Caller ob1 = new Caller("Добро пожаловать", target);
        Caller ob2 = new Caller("в синхронизированный", target);
        Caller ob3 = new Caller(" мир!", target);

        // ожидать завершения потока исполнения
        try {
            ob1.t.join();
            ob2.t.join();
            ob3.t.join();
        } catch (InterruptedException e) {
            System.out.println("Прервано");
        }

    }
}
