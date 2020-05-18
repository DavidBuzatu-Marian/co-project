package logging;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;

public class FileLogger implements ILogger {

    private PrintStream file;

    public FileLogger(String fileName) throws FileNotFoundException {
        file = new PrintStream(new FileOutputStream(fileName));
    }
    @Override
    public void write(long param) {
        file.println(param);

    }

    @Override
    public void write(String param) {
        file.println(param);
    }

    @Override
    public void write(Object... objects) {
        for(Object o : objects)
            file.println(o);

        file.println();
    }

    @Override
    public void writeTime(long time, TimeUnit unit) {
        write(TimeUnit.convertTime(time, unit));
    }

    @Override
    public void writeTime(String text, long time, TimeUnit unit) {
        write(text, TimeUnit.convertTime(time, unit));
    }

    @Override
    public void close() {
        file.close();
    }

}
