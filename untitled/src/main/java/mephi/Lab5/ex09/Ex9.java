package mephi.Lab5.ex09;

import java.io.Closeable;
import java.io.IOException;
import java.util.Scanner;

public class Ex9 {
    Scanner scanner = new Scanner(System.in);

   /* public void close() { -- Метод из сканнера
        if (closed) -- Проверяется на закрытость
            return;
        if (source instanceof Closeable) { --если // The input source private Readable source;

            try {
                ((Closeable)source).close(); -- пробуем закрыть, иначе ловим
            } catch (IOException ioe) {
                lastException = ioe; --перехватывает выброшенное исключение и сохраняет ссылку на него.
            }
        }
        sourceClosed = true;
        source = null;
        closed = true;
    }*/
}
