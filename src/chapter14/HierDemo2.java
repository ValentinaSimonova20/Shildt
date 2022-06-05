package chapter14;

// Необобщенный класс может быть суперклассом
// для обобщенного подкласса

// Необобщенный класс
class NonGen2 {
    int num;

    NonGen2(int i) {
        this.num = i;
    }

    int getnum() {
        return num;
    }
}

class Gen5<T> extends NonGen2 {
    T ob; // объявить объект типа T

    // передать консруктору объект типа T
    Gen5(T o, int i) {
        super(i);
        ob = o;
    }

    // возвратить объект ob
    T getOb() {
        return ob;
    }
}

// создать объект типа Gen
public class HierDemo2 {
    public static void main(String[] args) {

        // создать объект типа Gen для символьных строк
        Gen5<String> w = new Gen5<>("Добро пожаловать", 47);
        System.out.println(w.getOb() + " ");
        System.out.println(w.getnum());
    }
}
