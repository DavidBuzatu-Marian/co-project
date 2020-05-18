package testbench;

import bench.IBenchmark;
import bench.SieveOfAtkinBenchmark;
import logging.ConsoleLogger;
import logging.ILogger;
import logging.TimeUnit;
import timing.ITimer;
import timing.Timer;

public class TestSieveOfAtkinBenchmark {

    public static double getResult() {
        ITimer timer = new Timer();
        IBenchmark bench = new SieveOfAtkinBenchmark();

        double score = 0.0;

        bench.warmup();

        for(int i = 31; i >= 27; i--) {
            double sc;

            bench.initialize((int)(1L << i - 2));

            timer.start();

            bench.run();

            long time = timer.stop();

            sc = (Math.log(1L << i - 2) / (Math.log(TimeUnit.convertTime(time, TimeUnit.SEC)) + 1));

            score += sc;
        }

        return score / 5;
    }

    public static void main(String[] args) {
        ILogger log = new ConsoleLogger();

        log.write("Score ", TestSieveOfAtkinBenchmark.getResult());

        log.close();
    }
}
