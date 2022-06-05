package chapter14;

// Использовать операор instanceof в иерархии
// обобщенных классов
class Gen6<T> {
    T ob;

    Gen6(T ob) {
        this.ob = ob;
    }

    // возвратить объект ob
    public T getOb() {
        return ob;
    }
}

// подкласс произодный от класса Gen6
class Gen7<T> extends Gen6<T> {
    Gen7(T o) {
        super(o);
    }
}

// продемонстрировать последствия динамической
// идентификации типов в иерархии обобщенных классов
public class HierDemo3 {
    public static void main(String[] args) {
        // создать объект типа Gen для целых чисел
        Gen6<Integer> iOb = new Gen6<>(88);

        // создать объект типа Gen2 для целых чисел
        Gen7<Integer> iOb2 = new Gen7<>(99);

        // создать объект типа Gen2 для символьных строк
        Gen7<String> strOb2 = new Gen7<>("Текст");

        // проверить, является ли объект iOb2 какой-нибудь
        // из форм класса Gen
        if(iOb2 instanceof Gen7<?>) {
            System.out.println("Объект iOb2 является экземплчром класса Gen7");
        }

        // проверить является ли объект iOb2 какой-нибудь из форм класса
        // Gen
        if(iOb2 instanceof Gen6<?>) {
            System.out.println("Объект iOb2 является " +
                    "экземпляром класса Gen");
        }
        System.out.println();

        // проверить, является ли объект strOb2 какой-нибудь
        // из форм класса Gen
        if(strOb2 instanceof Gen7<?>) {
            System.out.println("Объект strOb2 является экземплчром класса Gen7");
        }

        // проверить является ли объект strOb2 какой-нибудь из форм класса
        // Gen
        if(strOb2 instanceof Gen6<?>) {
            System.out.println("Объект strOb2 является " +
                    "экземпляром класса Gen");
        }
        System.out.println();

        // проверить, является ли объект iOb экземпляром класса Gen2,
        // что совсем не так
        if(iOb instanceof Gen7<?>) {
            System.out.println("Объект iOb является экземплчром класса Gen6");
        }

        // проверить является ли объект iOb является экземпляром
        // класса Gen что так и есть
        if(iOb instanceof Gen6<?>) {
            System.out.println("Объект iOb является " +
                    "экземпляром класса Gen");
        }
        System.out.println();


    }
}
