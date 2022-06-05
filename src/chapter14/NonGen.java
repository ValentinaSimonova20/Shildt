package chapter14;

// Класс NonGen - функциональный эквивалент
// класса Gen без обобщений
public class NonGen {
    Object ob; // объект ob теперь имеет тип Object

    // передать конструктору ссылку на объект типа Object
    public NonGen(Object ob) {
        this.ob = ob;
    }

    // возвращать тип Object
    public Object getOb() {
        return ob;
    }

    // показать тип объекта
    void showType() {
        System.out.println("Объект ob относится к типу " +
                ob.getClass().getName());
    }


}

class NonGenDemo {
    public static void main(String[] args) {
        NonGen iOb;

        // создать объект типа NonGen и сохранить в нем
        // объект типа Integer. Выполняется автоупаковка
        iOb = new NonGen(88);

        // показать тип данных, хранящийся в переменной iOb
        iOb.showType();

        // получить значение переменной iOb,
        // на этот раз требуется приведение типов
        int v = (Integer) iOb.getOb();
        System.out.println("Значение: " + v);

        // создать другой объект типа NonGen и
        // сохранить в нем объект типа String
        NonGen strOb = new NonGen("Тест без обобщений");

        // показать типа данных, хранящихся в переменной strOb
        strOb.showType();

        // получить значение переменной strOb,
        // и в этом случае потребуется приведение типов
        String str = (String) strOb.getOb();
        System.out.println("Значение: " + str);
    }
}
