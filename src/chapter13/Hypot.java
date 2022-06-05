package chapter13;

import static java.lang.Math.sqrt;
import static java.lang.Math.pow;

// Вычислить длину гипотенузы прямоугольного треугольника
public class Hypot {
    public static void main(String[] args) {
        double side1, side2;
        double hypot;
        side1 = 3.0;
        side2 = 4.0;

        // Обратите ванимание на то, что имена методов sqrt()
        // и pow() должны быть уточнены именем их класса Math
        hypot = sqrt(pow(side1, 2) + pow(side2, 2));

        System.out.println("При заданной длине сторон " + side1 +
                " и " + side2 +
                " гипотенуза равна " + hypot);
    }
}
