package chapter13;

public class MyClass {
    int a;
    int b;

    // инициализировать поля a и b по отдельности
    MyClass(int i, int j) {
        a = i;
        b = j;
    }

    // инициализировать поля a и b одним и тем же значением
    MyClass(int i) {
        this(i, i);
    }

    // присвоить полям a и b нулевое значение по умолчанию
    MyClass() {
       this(0);
    }
}
