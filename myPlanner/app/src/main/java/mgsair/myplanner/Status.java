/**
 * @author Mouaad Gssair
 * @version 1.0
 * @modified by MouaadGssair on 01.09.18.
 * @since August 2018
 */

package mgsair.myplanner;

public enum Status {
    Done(1),
    Assigned(2),
    inProcess(3),
    NotStarted(4);
    private final int mStatusCode;

    Status(int statusCode) {
        this.mStatusCode = statusCode;
    }

    public int getStatusCode() {
        return this.mStatusCode;
    }
}
