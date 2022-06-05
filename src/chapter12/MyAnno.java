package chapter12;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Method;

@Retention(RetentionPolicy.RUNTIME)
// Простой тип аннотации
public @interface MyAnno {
    String str() default "Тестирование";
    int val() default 9000;
}

@Retention(RetentionPolicy.RUNTIME)
@interface What {
    String description();
}

class Meta {
    // аннотировать метод
    @MyAnno(str = "Пример аннотации", val = 100)
    public static void myMeth() {
        Meta ob = new Meta();

        // Получить аннотацию из метода
        // и вывести значения ее членов
        try {
            // сначала получить объект типа Class,
            // представляющий данный класс
            Class<?> c = ob.getClass();

            // затем получить объект типа Method
            // представляющий данный метод
            Method m = c.getMethod("myMeth");

            // далее получить аннотацию для данного класса
            MyAnno anno = m.getAnnotation(MyAnno.class);

            System.out.println(anno.str() + " " + anno.val());
        } catch (NoSuchMethodException exception) {
            System.out.println("Метод не найден");
        }
    }

    // у метода myMeth() теперь имеются два аргумента
    @MyAnno(str = "Два параметра", val = 19)
    public static void myMeth(String str, int i) {
        Meta ob = new Meta();

        try{
            Class<?> c = ob.getClass();

            Method m  = c.getMethod("myMeth", String.class, int.class);

            MyAnno anno = m.getAnnotation(MyAnno.class);

            System.out.println(anno.str() + " " + anno.val());
        } catch (NoSuchMethodException exception) {
            System.out.println("Метод не найден");
        }
    }

    public static void main(String[] args) {
        myMeth();
        myMeth("Тест", 10);
    }
}
