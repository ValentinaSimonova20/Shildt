package chapter13;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/*
* в этой версии программы ShowFile
* оператор try с ресурсами применяется для автоматического закрыти файла
* */
public class ShowFileResources {
    public static void main(String[] args) {
        int i;

        if(args.length != 1) {
            System.out.println("Использование: ShowFile имя_файла");
            return;
        }

        // Ниже оператор try с ресурсами применяется
        // сначаладля открытия, а затем для автоматического
        // закрытия файла по завершении блока этого оператора
        try(FileInputStream fin = new FileInputStream(args[0])) {
            do {
                i = fin.read();
                if(i != -1) {
                    System.out.print((char) i);
                }
            } while (i != -1);
        } catch (IOException e) {
            System.out.println("Призошла ошибка ввода-вывода");
        }
    }

}
