package quiz_mid01.quiz05;

public enum HttpStatus {
    OK(200, "OK"),
    BAD_REQUEST(400, "Bad Request"),
    NOT_FOUND(404, "Not Found"),
    INTERNAL_SERVER_ERROR(500, "Internal Server Error"),
    ;

    private final int code;
    private final String message;

    HttpStatus(int code, String message) {
        this.code = code;
        this.message = message;
    }

    public int getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }

    public static HttpStatus findByCode(int code) {
        for (HttpStatus s : HttpStatus.values()) {
            if (s.code == code) {
                return s;
            }
        }
        return null;
    }

    public boolean isSuccess() {
        return this.code > 199 && this.code < 300;
    }
}
