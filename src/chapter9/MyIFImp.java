package chapter9;

public class MyIFImp implements MyIF{

    // В этом классе должен быть реализован только
    // метод getNumber, определенный в интерфейсе MyIf
    @Override
    public int getNumber() {
        return 100;
    }
}
