package chapter14;


// Двумерные координаты
class TwoD {
    int x, y;

    TwoD(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

// Трехмерные координаты
class ThreeD extends TwoD {
    int z;

    ThreeD(int x, int y, int z) {
        super(x, y);
        this.z = z;
    }
}

// Четырехмерные координаты
class FourD extends ThreeD {
    int t;

    FourD(int x, int y, int z, int t) {
        super(x, y, z);
        this.t = t;
    }
}

// Этот класс хранит массив координатных объектов
class Coords<T extends TwoD> {
    T[] coords;

    Coords(T[] coords) {
        this.coords = coords;
    }


}


// Продемонстрировать применение ограниченных
// метасимволов подстановки
public class BoundedWildcard {


    public static void main(String[] args) {
        TwoD[] td = {
                new TwoD(0, 0),
                new TwoD(7, 9),
                new TwoD(18, 4),
                new TwoD(-1, -2)

        };

        Coords<TwoD> tdlocs = new Coords<>(td);
        System.out.println("Содержимое объекта dlocs");
        showXY(tdlocs); // Верно, это тип TwoD
        // showXYZ(tdlocs); // Ошибка, это не тип ThreeD
        // showAll(tdlocs); // Ошибка, это не тип FourD

        // а теперь создать несколько объектов типа FourD
        FourD[] fd = {
                new FourD(1,2,3,4),
                new FourD(6, 8, 14, 8),
                new FourD(22, 9, 4, 9),
                new FourD(3, -2, -23, 17)
        };

        Coords<FourD> fdlocs = new Coords<>(fd);

        System.out.println("Содержимое объекта fdlocs.");
        // Здесь все верно
        showXY(fdlocs);
        showXYZ(fdlocs);
        showAll(fdlocs);
    }


    static void showXY(Coords<?> c) {
        System.out.println("Координаты X Y: ");
        for(int i = 0; i < c.coords.length; i++) {
            System.out.println(c.coords[i].x + " " +
                    c.coords[i].y);
        }
        System.out.println();
    }

    static void showXYZ(Coords<? extends ThreeD> c) {
        System.out.println("X Y Z Coordinates:");
        for (int i = 0; i < c.coords.length; i++) {
            System.out.println(c.coords[i].x + " " + c.coords[i].y +
                    " " + c.coords[i].z);
        }
        System.out.println();
    }

    static void showAll(Coords<? extends FourD> c) {
        System.out.println("Координаты X Y Z T:");
        for(int i = 0; i < c.coords.length; i++) {
            System.out.println(c.coords[i].x + " " +
                    c.coords[i].y + " " +
                    c.coords[i].z + " " +
                    c.coords[i].t
            );
        }
        System.out.println();
    }
}
