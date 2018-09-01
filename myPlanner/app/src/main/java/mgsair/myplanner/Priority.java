/**
 * @author Mouaad Gssair
 * @version 1.0
 * @modified by MouaadGssair on 01.09.18.
 * @since August 2018
 */

package mgsair.myplanner;

public enum Priority {
    HIGH(1),
    MEDIUM(2),
    LOW(3);
    private final int prioCode;

    Priority(int prioCode) {
        this.prioCode = prioCode;
    }

    public int getPrioCode() {
        return this.prioCode;
    }
}
