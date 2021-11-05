package chapter9;

import chapter9.mypack.Balance;

public class TestBalance {
    public static void main(String[] args) {
        /* Класс Balance объявлен как public, поэтому им можно воспользоваться
        * и вызвать его констурктор*/
        Balance test = new Balance("J.J. Jaspers", 99.88);

        test.show();
    }
}
