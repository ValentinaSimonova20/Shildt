package chapter8;

// В этой программе наследование применяется
// для расширения класса Box
class Box{
    private double width;
    private double height;
    private double depth;

    // Сконструировать клон объекта
    Box(Box ob){ // передать объект в конструктор
        width = ob.width;
        height = ob.height;
        depth = ob.depth;
    }

    // конструктор применяемый при указании всех размеров
    Box(double w, double h, double d){
        width = w;
        height = h;
        depth = d;
    }

    // конструктор применяемый в отсутсnвие размеров
    Box(){
        width = -1;
        height = -1;
        depth = -1;
    }

    // Конструктор применяемый при создании куба
    Box(double len){
        width = height = depth = len;
    }

    // рассчитать и возвратить объем
    double volume(){
        return width * height *depth;
    }
}

// В классе BoxWeight реализованы все конструкторы
// расширить класс Box, включив в него поле веса
class BoxWeight extends Box{
    double weight; // вес параллелепипеда

    // сконструировать клон объекта
    BoxWeight(BoxWeight ob){
        super(ob);
        weight = ob.weight;

    }

    // конструктор BoxWeight применяемый при указании всех параметров
    BoxWeight(double w, double h, double d, double m){
        super(w, h, d);
        weight = m;
    }

    // конструктор применяемый по умолчанию
    BoxWeight(){
        super();
        weight = -1;
    }

    // Конструктор применяемый при создании куба
    BoxWeight(double len, double m){
        super(len);
        weight = m;
    }
}

public class DemoBoxWeight {
    public static void main(String[] args) {
        BoxWeight mybox1 = new BoxWeight(10, 20, 15, 24.3);
        BoxWeight mybox2 = new BoxWeight(2, 3, 4, 0.076);
        double vol;
        vol = mybox1.volume();
        System.out.println("Объем mybox1 равен "+vol);
        System.out.println("Вес mybox1 равен "+mybox1.weight);
        System.out.println();

        vol = mybox2.volume();
        System.out.println("Объем mybox2 равен "+vol);
        System.out.println("Вес mybox2 равен "+mybox2.weight);


    }
}
