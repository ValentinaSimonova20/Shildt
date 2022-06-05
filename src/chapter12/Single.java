package chapter12;


import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Method;

// одноченная аннотация
@Retention(RetentionPolicy.RUNTIME)
@interface MySingle {
    int value(); // эта переменная должна иметь имя value
}

public class Single {

    // аннотировать метод одночленной аннотацией
    @MySingle(100)
    public static void myMeth() {
        Single ob = new Single();

        try {
            Method m = ob.getClass().getMethod("myMeth");

            MySingle anno = m.getAnnotation(MySingle.class);
            System.out.println(anno.value());
        } catch (NoSuchMethodException exception) {
            System.out.println("Метод не найден");
        }
    }

    public static void main(String[] args) {
        myMeth();
    }
}
