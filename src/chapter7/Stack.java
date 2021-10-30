package chapter7;

// В этом классе определяется целочисленный стек,
// который может содержать 10 значений
public class Stack {
    /* Теперь переменные stck и tos являются закрытыми
     */
    private int stck[];
    private int tos;

    // инициализировать вершину стека
    Stack(){
        stck = new int[10];
        tos = -1;
    }

    Stack(int size){
        stck = new int[size];
        tos = -1;
    }

    // разместить элемент в стеке
    void push(int item){
        if(tos == stck.length-1){
            System.out.println("Стек заполнен.");
        }else {
            stck[++tos] = item;
        }
    }

    // извлечь элемент из стека
    int pop(){
        if(tos<0){
            System.out.println("Стек не загружен.");
            return 0;
        }else {
            return stck[tos--];
        }
    }
}

class TestStack{
    public static void main(String[] args) {
        Stack myStack1 = new Stack();
        Stack myStack2 = new Stack();

        // разместить числа в строке
        for(int i =0; i<10; i++)myStack1.push(i);
        for(int i=10; i<20; i++) myStack2.push(i);

        // извлечь эти числа из стека
        System.out.println("Стек в mystack1:");
        for(int i =0;i<10; i++){
            System.out.println(myStack1.pop());
        }

        System.out.println("Стек в mystack2:");
        for(int i=0; i<10; i++){
            System.out.println(myStack2.pop());
        }

        Stack mystck1 = new Stack(5);

        for(int i = 0; i<5; i++){
            mystck1.push(i);
        }

        System.out.println("Стек в mystack1:");
        for(int i =0; i<5; i++){
            System.out.println(mystck1.pop());
        }

    }
}
