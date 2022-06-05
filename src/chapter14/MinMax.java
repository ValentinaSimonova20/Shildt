package chapter14;

// Пример обобщенного интерфейса

// Обобщенный интерфейс MinMax для определения
// минимального и максимального значений
public interface MinMax<T extends Comparable<T>> {
    T min();
    T max();
}

// реализовать обобщенный интерфейс MinMax
class MyClass<T extends Comparable<T>> implements MinMax<T> {
    T[] vals;

    public MyClass(T[] vals) {
        this.vals = vals;
    }

    // возвратить минимальное значение из массива vals
    @Override
    public T min() {
        T v = vals[0];

        for(int i = 1; i < vals.length; i++) {
            if(vals[i].compareTo(v) < 0) {
                v  = vals[i];
            }
        }
        return v;
    }

    // возвратить максимальное значение из массива vals
    @Override
    public T max() {
        T v = vals[0];

        for(int i = 1; i < vals.length; i++) {
            if(vals[i].compareTo(v) > 0) {
                v  = vals[i];
            }
        }
        return v;
    }
}

class GenIFDemo {
    public static void main(String[] args) {
        Integer[] inums = {3, 6, 2, 8, 6};

        Character[] chrs = {'b', 'r', 'p', 'w'};

        MyClass<Integer> iob = new MyClass<>(inums);
        MyClass<Character> cob = new MyClass<>(chrs);

        System.out.println("Максимальное значение в массиве inums: " + iob.max());
        System.out.println("Минимальное значение в массиве inums: " + iob.min());

        System.out.println("Максимальное значение в массиве chs: " + cob.max());
        System.out.println("Минимальное значние в массиве chs: " + cob.min());
    }
}