package algorithms;

import java.io.IOException;

public class LuminariesException extends IOException {
    public LuminariesException() {
    }

    public LuminariesException(String message) {
        super(message);
    }

    public LuminariesException(String message, Throwable cause) {
        super(message, cause);
    }

    public LuminariesException(Throwable cause) {
        super(cause);
    }
}
