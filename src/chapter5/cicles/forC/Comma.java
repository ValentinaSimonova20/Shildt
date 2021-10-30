package chapter5.cicles.forC;

import java.util.HashMap;
import java.util.Map;

// Использование запятой в операторе цикла for
public class Comma {
    public static void main(String[] args) {
        int a, b;

        for(a = 1, b = 4; a<b; a++, b--){
            System.out.println("a = " + a);
            System.out.println("b = " + b);
        }

        Map<Integer, Integer> map = new HashMap<>();
        int k =5;
        System.out.println(map.get(7));
    }
}
