package chapter6;

// В этом классе определяется целочисленный стек, где
// можно хранить до 10 целочисленных элементов
public class Stack {
    int[] stack = new int[10];
    int tos;

    // инициализировать вершину стека
    Stack(){
        tos = -1;
    }

    // разместить элемент в стеке
    void push(int item){
        if(tos == 9){
            System.out.println("Стек заполнен.");
        }
        else {
            stack[++tos] = item;
        }
    }

    // извлечь элемент из стека
    int pop(){
        if(tos < 0){
            System.out.println("Стек не загружен.");
            return 0;
        }
        else {
            return stack[tos--];
        }
    }
}
