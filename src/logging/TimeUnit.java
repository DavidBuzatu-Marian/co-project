package logging;

public enum TimeUnit {
    SEC,
    MS,
    US;

    public static double convertTime(long time, TimeUnit unit) {
        double convertedTime = 0;

        if(unit == TimeUnit.SEC)
            convertedTime = time / 1000000000.0;
        if(unit == TimeUnit.MS)
            convertedTime = time / 1000000.0;
        if(unit == TimeUnit.US)
            convertedTime = time / 1000.0;

        return convertedTime;
    }
}
