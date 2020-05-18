package bench;

public interface IBenchmark {
    void initialize(Object... params);

    void warmup();

    void run();

    void run(Object... params);

    void clean();

    void cancel();

    String getResult();
}
