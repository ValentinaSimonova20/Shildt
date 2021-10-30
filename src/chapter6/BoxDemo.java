package chapter6;


class Box{
    double width;
    double height;
    double depth;

    double volume(){
        return width * height * depth;
    }

    Box(){
        System.out.println("Конструирование объекта Box");
        width = 10;
        height = 10;
        depth = 10;
    }

    Box(double w, double h, double d){
        width = w;
        height = h;
        depth = d;
    }

    void setDim(double w, double h, double d){
        width = w;
        height = h;
        depth = d;
    }
}

class BoxDemo7{
    public static void main(String[] args) {
        Box mybox1 = new Box(10, 20, 15);
        Box mybox2 = new Box(3, 6, 9);

        double vol;

        vol = mybox1.volume();

        System.out.println("Объем равен "+vol);

        vol = mybox2.volume();
        System.out.println("Объем равен "+vol);
    }
}

class BoxDemo6{
    public static void main(String[] args) {
        Box mybox1 = new Box();
        Box mybox2 = new Box();

        double vol;

        vol = mybox1.volume();
        System.out.println("Объем равен "+ vol);

        vol = mybox2.volume();
        System.out.println("Объем равен "+vol);
    }
}

class BoxDemo5 {
    public static void main(String[] args) {
        Box mybox1 = new Box();
        Box mybox2 = new Box();
        double vol;

        mybox1.setDim(10, 20, 15);
        mybox2.setDim(3, 6,9);
        vol = mybox1.volume();
        System.out.println("Объем равен "+vol);

        vol = mybox2.volume();
        System.out.println("Объем равен "+vol);
    }
}

class BoxDemo4{
    public static void main(String[] args) {
        Box myBox1 = new Box();
        Box myBox2 = new Box();

        myBox1.width = 10;
        myBox1.height = 20;
        myBox1.depth = 15;

        myBox2.width = 3;
        myBox2.height = 6;
        myBox2.depth = 9;

        double vol;

        vol = myBox1.volume();
        System.out.println("Объем равен "+vol);

        // получить объем второго параллелепипеда
        vol = myBox2.volume();
        System.out.println("Объем равен "+vol);
    }
}

class BoxDemo3{
    public static void main(String[] args) {
        Box myBox1 = new Box();
        Box myBox2 = new Box();

        myBox1.width = 10;
        myBox1.height = 20;
        myBox1.depth = 15;

        myBox2.width = 3;
        myBox2.height = 6;
        myBox2.depth = 9;

        myBox1.volume();
        myBox2.volume();
    }
}
/* программа, использующая класс Box
* */
public class BoxDemo {
    public static void main(String[] args) {
        Box myBox = new Box();
        double vol;

        // присвоить значение переменным экземпляра mybox
        myBox.width = 10;
        myBox.height = 20;
        myBox.depth = 15;

        vol = myBox.depth*myBox.width*myBox.height;

        System.out.println("Объем равен "+vol);
    }
}

class BoxDemo2{
    public static void main(String[] args) {
        Box mybox1 = new Box();
        Box mybox2 = new Box();
        double vol;

        mybox1.width = 10;
        mybox1.height = 20;
        mybox1.depth = 15;

        mybox2.width = 3;
        mybox2.height = 6;
        mybox2.depth = 9;

        vol = mybox1.width*mybox1.height*mybox1.depth;
        System.out.println("Объем равен: "+vol);

        vol = mybox2.width*mybox2.height*mybox2.depth;
        System.out.println("Объем равен: "+vol);

        Box b1 = new Box();
        Box b2 = b1;
        b1 = null;
        System.out.println(b1==null);
    }
}
