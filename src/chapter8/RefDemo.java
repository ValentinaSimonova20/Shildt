package chapter8;

public class RefDemo {
    public static void main(String[] args) {
        BoxWeight weightbox = new BoxWeight(3,5, 7,  8.37);
        Box plainbox = new Box();
        double vol;

        vol = weightbox.volume();
        System.out.println("Объем weightbox равен "+vol);
        System.out.println("Вес weightbox равен "+weightbox.weight);
        System.out.println();

        // присвоить переменной ссылки на объект типа BoxWeight
        // ссылку на объект типа Box
        plainbox = weightbox;
        vol = plainbox.volume();

        System.out.println("Объем plainbox равен "+vol);
    }
}
