package bench;

public class TimerBenchmark implements IBenchmark{
    @Override
    public void initialize(Object... params) { }

    @Override
    public void warmup() {

    }

    @Override
    public void run() { }

    @Override
    public void run(Object... params) {
        try {
            Thread.sleep((Integer) params[0]);
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void clean() { }

    @Override
    public void cancel() { }

    @Override
    public String getResult() {
        return null;
    }
}
