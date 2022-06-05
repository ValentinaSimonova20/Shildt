package chapter13;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/*
Копирование файла.
Чтобы воспользоваться этой программой, укажите имена исходного
и целевого файлов. например, чтобы скопировать файл first.txt
  в файл second.txt, введите в командой строке
  следующую команду
  java CopyFile FIRST.TXT SECOND.TXT
 */
public class CopyFile {
    public static void main(String[] args) {
        int i;
        FileInputStream fin = null;
        FileOutputStream fout = null;

        // сначала убедиться, что указаны имена обоих файлов
        if(args.length != 2) {
            System.out.println("Использование: COpyFile откуда куда");
            return;
        }

        // копировать файл
        try {
            // попытаться открыть файл
            fin = new FileInputStream(args[0]);
            fout = new FileOutputStream(args[1]);

            do {
                i = fin.read();
                if(i != -1) {
                    fout.write(i);
                }
            } while (i != -1);
        } catch (IOException e) {
            System.out.println("Ошибка ввода-вывода: " + e);
        } finally {
            try {
                if(fin != null) {
                    fin.close();
                }
            } catch (IOException e2) {
                System.out.println("Ошибка закрытия файла ввода");
            }

            try {
                if(fout != null) {
                    fout.close();
                }
            } catch (IOException e2) {
                System.out.println("Ошибка закрытия файла вывода");
            }
        }
    }
}