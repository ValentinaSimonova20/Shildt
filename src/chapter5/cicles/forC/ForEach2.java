package chapter5.cicles.forC;

// Применение оператора break в цикле for в стиле for each
public class ForEach2 {
    public static void main(String[] args) {
        int sum = 0;
        int[] nums = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        for(int x : nums){
            System.out.println("Значение равно: "+x);
            sum += x;
            if(x == 5) break; // прервать цикл после полуения 5 значений
        }
        System.out.println("Сумма пяти первых элементов равна: "+sum);
    }
}
