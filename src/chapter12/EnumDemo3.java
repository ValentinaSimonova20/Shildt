package chapter12;

/**
 * Использовать конструктор, переменную экземпляра
 * и метод в перечислении
 */
enum Apple2 {
    Jonathan(10), GoldenDel(9), RedDel,
    Winesap(15), Cortland(8);

    private int price; // цена яблок каждого сорта

    Apple2(int price) {
        this.price = price;
    }

    // перегружаемый конструктор
    Apple2() {
        this.price = -1;
    }

    public int getPrice() {
        return price;
    }
}

public class EnumDemo3 {
    public static void main(String[] args) {
        // вывети цену на яблоко сорта Winesap
        System.out.println("Яблоко сорта Winesap стоит " +
                Apple2.Winesap.getPrice());
        System.out.println("Цены на все сорта яблок:");
        for(Apple2 apple2 : Apple2.values()) {
            System.out.println(apple2 + " стоит " + apple2.getPrice() +
                    " центов");
        }
    }
}
