package chapter7;


class Box{
    double width;
    double height;
    double depth;

    Box(Box ob){
        width = ob.width;
        height = ob.height;
        depth = ob.depth;
    }

    // конструктор, используемый, когда
    // указываются все размеры
    Box(double w, double h, double d){
        width = w;
        height = h;
        depth = d;
    }

    // конструктор, используемый, когда
    // ни один из размеров не указан
    Box(){
        width = -1;
        height = -1;
        depth = -1;
    }

    // конструктор, используемый при создании куба
    Box(double len){
        width = height = depth = len;
    }

    // рассчитать и возвратить объем
    double volume(){
        return width * height * depth;
    }
}


public class OverloadCons {
    public static void main(String[] args) {
        // создать параллелепипеды, используя разные
        // конструкторы
        Box mybox1 = new Box(10, 20, 15);
        Box mybox2 = new Box();
        Box mycube = new Box(7);

        double vol;

        // Получить объем левого параллелепипеда
        vol = mybox1.volume();
        System.out.println("Объем mybox1 равен "+vol);

        // Получить объем второго параллелепипеда
        vol = mybox2.volume();
        System.out.println("Объем mybox2 равен "+vol);

        vol = mycube.volume();
        System.out.println("Объем mycube равен "+vol);
    }
}
