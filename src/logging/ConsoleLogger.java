package logging;

public class ConsoleLogger implements ILogger{

    @Override
    public void write(long param) {
        System.out.println(param);
    }

    @Override
    public void write(String param) {
        System.out.println(param);
    }

    @Override
    public void write(Object... values) {
        for(Object o : values)
            System.out.print(o + "	");

        System.out.println();
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
    public void close() {}

}
