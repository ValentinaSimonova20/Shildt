package chapter12;

// Продемонстрировать применение нескольких типовых аннотаций

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

// Аннотация, которую можно применить к типу данных
@Target(ElementType.TYPE_USE)
@interface TypeAnno {}

// еще одна аннотация-маркер, которую можно применить
// к типу данных
@Target(ElementType.TYPE_USE)
@interface NotZeroLen {

}

//  и еще одна аннотация-маркер, которую можно
// применить к типу данных
@Target(ElementType.TYPE_USE)
@interface Unique {}

// Параметризированная аннотация, которую можно применить к типу
// данных
@Target({ElementType.TYPE_USE})
@interface MaxLen {
    int value();
}

// аннотация, которую можно применить к параметру типа
@Target(ElementType.TYPE_PARAMETER)
@interface What2 {
    String description();
}

// аннотация, которую можно применить в объявлении поля
@Target(ElementType.FIELD)
@interface EmptyOK{}

// аннотация которую можно определить в объявлении метода
@Target(ElementType.METHOD)
@interface Recommended {}

// применить аннотацию в параметре типа
public class TypeAnnoDemo<@What2(description = "Данные обобщенного типа") T> {
    // применить типовую аннотацию в конструкторе
    public @Unique TypeAnnoDemo() {}

    // аннотировать тип (в данном случае - String), но не поле
    @TypeAnno String str;

    // аннотировать поле test
    @EmptyOK String test;

    // применить типовую аннотацию для аннотирования
    // ссылки this на объект (получатель)
    public int f(@TypeAnno TypeAnnoDemo<T> this, int x) {
        return 10;
    }

    // аннотировать возвращаемый тип
    public @TypeAnno Integer f2(int j, int k) {
        return j + k;
    }

    // аннотировать объявление метода
    public @Recommended Integer f3(String str) {
        return str.length() / 2;
    }

    // применить типовую аннотацию в операторе throws
    public void f4() throws @TypeAnno NullPointerException {
    }

    // аннотировать уровни доступа к массиву
    String @MaxLen(10) [] @NotZeroLen [] w;

    // аннотировать тип элемента массива
    @TypeAnno Integer[] vec;

    public static void myMeth(int i){

        // применить типовую аннотацию в аргументе типа
        TypeAnnoDemo<@TypeAnno Integer> ob =
                new TypeAnnoDemo<>();

        // применить типовую аннотацию в операторе new
        @Unique TypeAnnoDemo<Integer> ob2 =
                new @Unique TypeAnnoDemo<>();

        Object x = new Integer(10);
        Integer y;

        // применить типовую аннотацию в приведении типов
        y = (@TypeAnno Integer) x;
    }

    public static void main(String[] args) {
        myMeth(10);
    }

    // применить типовую аннотацию в выражении наслежлвания
    class SomeClass extends @TypeAnno TypeAnnoDemo<Boolean> {}
}
