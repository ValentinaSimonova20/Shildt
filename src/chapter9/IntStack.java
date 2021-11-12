package chapter9;

// Определить интерфейс для целочисленного стека
public interface IntStack {
    void push(int item); // сохранить элемент в стеке
    int pop(); // извлечь элемент из стека


    // Метод с реализацией по умолчанию, возвращающий массив из
    // из n элементов, начиная с веришны стека
    default int[] popNElements(int n) {
        return getElements(n);
    }

    // Метод с реализацией по умолчанию, возвращающий из стека
    // массив из n элементов, следующих после указанного
    // количества пропускаемых жлементов
    default int[] skipAndPopNElements(int skip, int n) {
        // пропустить указанное количество элементов в стеке
        getElements(skip);
        // возвращать запрашиваемые элементы из стека
        return getElements(n);
    }


    //
    default void clear() {
        System.out.println("Метод clear() не реализован");
    }

    private int[] getElements(int n) {
        int[] elements = new int[n];
        for ( int i = 0; i < n; i++) {
            elements[i] = pop();
        }

        return elements;
    }
}
