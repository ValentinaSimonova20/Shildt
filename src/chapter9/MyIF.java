package chapter9;

public interface MyIF {

    // Это объявление обычного метода в интерфейсе.
    // Он не предоставляет реализацию по умолчанию
    int getNumber();

    // А это объявление метода с реализацией по умолчанию
    // Обратите внимание на его релаизацию по умолчанию
    default String getString() {
        return "Объект типа String по умолчанию";
    }

    static int getDefaultNumber() {
        return 0;
    }
}
