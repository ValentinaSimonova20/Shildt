package chapter15;


// Использовать сылку на метод экземпляра
// вместе с разными объектами

// Функциональный интерфейс с методом,
// принимающим два ссылочных аргумента и
// возвращающим логическое значения
interface MyFunc2<T> {
    boolean func(T v1, T v2);
}

// Класс для хранения максимальной температуры за день
class HighTemp {
    private int hTemp;

    public HighTemp(int hTemp) {
        this.hTemp = hTemp;
    }

    // возвратить логическое true, если вызывающий
    // объект типа HighTemp содержит такую
    // же температуру, как и у объекта ht2
    boolean sameTemp(HighTemp ht2) {
        return hTemp == ht2.hTemp;
    }

    // возвратить логическое значение true, если вызывающий
    // объект типа HighTemp содержит
    // температуру ниже, чем у объекта ht2
    boolean lessThanTemp(HighTemp ht2) {
        return hTemp < ht2.hTemp;
    }
}

public class InstanceMethWithObjectRefDemo {

    // Метод, возвращающий количество экземпляров объекта,
    // найденных по критериям, задаваемым параметром
    // функционального интрфейса MyFunc
    static <T> int counter(T[] vals, MyFunc2<T> f, T v) {
        int count = 0;

        for(int i = 0; i < vals.length; i++) {
            if(f.func(vals[i], v)) count++;
        }
        return count;
    }

    public static void main(String[] args) {
        int count;

        // создать массив объектов типа HighTemp
        HighTemp[] weekDayHight = {
           new HighTemp(89), new HighTemp(82),
           new HighTemp(90), new HighTemp(89),
           new HighTemp(89), new HighTemp(91),
           new HighTemp(84), new HighTemp(83),
        };

        // использовать метод counter() вместе с массивами
        // объектов типа HighTemp. Обратите внимание на то, что ссылка
        // на метод экземпляра sameTemp()
        // передается в качестве второго параметра
        count = counter(weekDayHight, HighTemp::sameTemp, new HighTemp(89));

        System.out.println("Дней, когда максимальная температура была 89: " + count);

        // А теперь воспользоваться методом lessThanTemp(),
        // чтобы выяснить, сколько дней температура была
        // меньше заданной
        count = counter(weekDayHight, HighTemp::lessThanTemp, new HighTemp(90));

        System.out.println("Дней, когда максимальная темпераура была меньше 19: " + count);

    }
}
