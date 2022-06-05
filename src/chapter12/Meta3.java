package chapter12;

import java.lang.reflect.Method;

public class Meta3 {

    // аннотировать метод, используя значения по умолчанию
    @MyAnno()
    public static void myMeth() {
        Meta3 ob = new Meta3();

        // получить аннотацию для данного метода
        // и вывести значения ее членов

        try {
            Class<?> c = ob.getClass();

            Method m = c.getMethod("myMeth");

            MyAnno anno = m.getAnnotation(MyAnno.class);

            System.out.println(anno.str() + " " + anno.val());
        } catch (NoSuchMethodException exception) {
            System.out.println("Метод не найден");
        }
    }

    public static void main(String[] args) {
        myMeth();
    }
}
