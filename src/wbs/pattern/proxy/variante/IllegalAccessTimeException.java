package wbs.pattern.proxy.variante;

public class IllegalAccessTimeException extends RuntimeException {
    public IllegalAccessTimeException() {
    }

    public IllegalAccessTimeException(String message) {
        super(message);
    }

    public IllegalAccessTimeException(String message, Throwable cause) {
        super(message, cause);
    }

    public IllegalAccessTimeException(Throwable cause) {
        super(cause);
    }

    public IllegalAccessTimeException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
