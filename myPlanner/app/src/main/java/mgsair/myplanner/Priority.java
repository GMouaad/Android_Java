package mgsair.myplanner;

public enum Priority {
    HIGH(1),
    MEDIUM(2),
    LOW(3);
    private final int prioCode;

    Priority(int prioCode) {
        this.prioCode = prioCode;
    }

    public int getLevelCode() {
        return this.prioCode;
    }
}
