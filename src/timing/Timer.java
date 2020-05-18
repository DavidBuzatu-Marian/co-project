package timing;

public class Timer implements ITimer{

    private long currentTime, totalTime;
    private boolean stopped;

    @Override
    public void start() {
        currentTime = System.nanoTime();
        totalTime = 0;
        stopped = false;
    }

    @Override
    public long stop() {
        long totalTimeWhenStopped;

        if(!stopped) {
            totalTime += System.nanoTime() - currentTime;
            stopped = true;
        }

        totalTimeWhenStopped = totalTime;
        totalTime = 0;

        return totalTimeWhenStopped;
    }

    @Override
    public long pause() {
        long time = System.nanoTime() - currentTime;

        if(!stopped) {
            totalTime += time;
            stopped = true;
        }

        return time;
    }

    @Override
    public void resume() {
        if(stopped) {
            stopped = false;
            currentTime = System.nanoTime();
        }
    }

}
