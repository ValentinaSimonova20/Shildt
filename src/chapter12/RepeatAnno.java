package chapter12;


import java.lang.annotation.Annotation;
import java.lang.annotation.Repeatable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Method;

// сделать анноацию MyAnno3 повторяющейся
@Retention(RetentionPolicy.RUNTIME)
@Repeatable(MyRepeatedAnnos.class)
@interface MyAnno3 {
    String str() default "Тестирование";
    int val() default 9000;
}

// это контейнерная аннотация
@Retention(RetentionPolicy.RUNTIME)
@interface MyRepeatedAnnos {
    MyAnno3[] value();
}

public class RepeatAnno {

    @MyAnno3(str = "Первая аннотация", val = -1)
    @MyAnno3(str = "Вторая аннотация" , val = 100)
    public static void myMeth(String str, int i) {
        RepeatAnno ob = new RepeatAnno();

        try {
            Class<?> c = ob.getClass();


            // получить аннотации для метода myMeth()
            Method m = c.getMethod("myMeth", String.class, int.class);

            Annotation anno = m.getAnnotation(MyRepeatedAnnos.class);

            System.out.println(anno);

            Annotation[] annos = m.getAnnotationsByType(MyAnno3.class);
            for(Annotation a : annos) {
                System.out.println(a);
            }
        } catch (NoSuchMethodException exc) {
            System.out.println("Метод не найден");
        }
    }

    public static void main(String[] args) {
        myMeth("тест", 10);
    }
}
