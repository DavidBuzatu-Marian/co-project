package logging;

public interface ILogger {
    void write(long param);

    void write(String param);

    void write(Object... params);

    void writeTime(long time, TimeUnit unit);

    void writeTime(String text, long time, TimeUnit unit);

    void close();
}
