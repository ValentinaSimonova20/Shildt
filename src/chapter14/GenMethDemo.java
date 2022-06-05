package chapter14;

// Продемонстрировать простой обобщенный метод
public class GenMethDemo {

    static <T extends Comparable<T>, V extends T> boolean isIn(T x, V[] y) {
        for (V v : y) {
            if (x.equals(v)) return true;
        }
        return false;
    }

    public static void main(String[] args) {
        // применить метод iSIn() для целых чисел
        Integer[] nums = {1, 2, 3, 4, 5};

        if (isIn(2, nums)) {
            System.out.println("Число 2 содержится в массиве nums");
        }
        if (!isIn(7, nums)) {
            System.out.println("Число 7 отсутсвует в массиве nums");
        }
        System.out.println();

        // применить метод isIn() для символьных строк
        String[] strs = {"один", "два", "три", "четыре", "пять"};

        if (isIn("два", strs)) {
            System.out.println("два содержиться в массиве strs");
        }
        if (!isIn("семь", strs)) {
            System.out.println("семь отсутсвует в массиве strs");
        }

        // не скомпилируется! типы должны быть совместимы
        // if(!isIn("два", nums))
        // sout("два содержиться в массиве nums")

    }
}
