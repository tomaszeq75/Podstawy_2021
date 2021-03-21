package marzec;

public enum Runner_16 {
    BEGINNER(100,150),
    INTERMEDIATE(80,100),
    ADVANCED(50,75),
    UNKNOWN(0,0);

    private final int minTime, maxTime;

    Runner_16(int minTime, int maxTime) {
        this.minTime = minTime;
        this.maxTime = maxTime;
    }

    public static Runner_16 getFitnessLevel(int time) {
        if (time >= BEGINNER.minTime && time <= BEGINNER.maxTime) {
            return Runner_16.BEGINNER;
        } else if (time >= INTERMEDIATE.minTime && time <= INTERMEDIATE.maxTime) {
            return Runner_16.INTERMEDIATE;
        } else if (time >= ADVANCED.minTime && time <= ADVANCED.maxTime) {
            return Runner_16.ADVANCED;
        } else return Runner_16.UNKNOWN;
    }
}
