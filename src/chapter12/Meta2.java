package chapter12;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

@What(description = "Аннотация тестового класса")
@MyAnno(str = "Meta2", val = 99)
public class Meta2 {

    @What(description = "Аннотация тестового метода")
    @MyAnno(str = "Testing", val = 100)
    public static void myMeth() {
        Meta2 ob = new Meta2();

        try {
            Annotation annos[] = ob.getClass().getAnnotations();

            // вывести все аннотации для класса Meta2
            System.out.println("Все аннотации для класса Meta2: ");
            for(Annotation a :annos) {
                System.out.println(a);
            }
            System.out.println();

            // вывести все аннотации дляметода myMeth()
            Method m = ob.getClass().getMethod("myMeth");
            annos = m.getAnnotations();

            System.out.println("Все аннотации для метода myMeth():");
            for(Annotation a : annos) {
                System.out.println(a);
            }

        } catch (NoSuchMethodException exception) {
            System.out.println("Метод не найден.");
        }
    }

    public static void main(String[] args) {
        myMeth();
    }
}
