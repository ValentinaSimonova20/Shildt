package chapter9;

// Реализация интерфейса IntStackдля стека
// фиксированного размера
public class FixedStack implements IntStack {

    private int stck[];
    private int tos;
    // выделить память и инициализировать стек
    FixedStack(int size) {
        stck = new int[size];
        tos = -1;
    }

    // разместить элемент в стеке
    @Override
    public void push(int item) {
        if(tos == stck.length-1) { // использовать поле длины стека
            System.out.println("Стек заполнен");
        }
        else {
            stck[++tos] = item;
        }
    }

    // извлечь элемент из стека
    @Override
    public int pop() {
        if(tos < 0) {
            System.out.println("Стек не загружен.");
            return 0;
        } else {
            return stck[tos--];
        }
    }
}

class IFTest {
    public static void main(String[] args) {
        FixedStack mystack1 = new FixedStack(5);
        FixedStack mystack2 = new FixedStack(8);

        // разместить числа в стеке
        for(int i = 0; i < 5; i++) mystack1.push(i);
        for(int i = 0; i < 8; i++) mystack2.push(i);

        // извлечь эти числа из стека
        System.out.println("Стек в mystack1:");
        for(int i = 0; i < 5; i++){
            System.out.println(mystack1.pop());
        }

        System.out.println("Стек в mystack2:");
        for(int i = 0; i < 8; i++) {
            System.out.println(mystack2.pop());
        }
    }
}
