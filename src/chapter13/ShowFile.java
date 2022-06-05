package chapter13;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/* Отображение содержимого текстового файла.
* Чтобы воспользоваться этой программой, укажите имя файла, который
* требуется просмотреть. Например, чтобы просмотреть Test.txt,
* введите в командой строке java ShowFile Test.txt */
public class ShowFile {
    public static void main(String[] args) {
        int i;
        FileInputStream fin;

        // сначала убедиться, что имя файла указано
        if(args.length != 1) {
            System.out.println("Использование: ShowFile имя_файла");
            return;
        }

        // попытка открыть файл
        try {
            fin = new FileInputStream(args[0]);
        } catch (FileNotFoundException e) {
            System.out.println("Невозможно открыть файл");
            return;
        }

        // теперь файл открыт и готов к чтению
        // Далее из него читаются символы до тех пор,
        // пока не встретится признак конца файла
        try {
            do {
                i = fin.read();
                if(i != -1) {
                    System.out.println((char) i);
                }
            } while (i != -1);
        } catch (IOException e) {
            System.out.println("Ошибка чтения из файла");
        } finally {
            // закрыть файл при выходе их блока оператора try
            try {
                fin.close();
            } catch (IOException e) {
                System.out.println("Ошибка закрытия файла");
            }
        }

    }
}
