package Exceptions;

public enum ErrorCode {
    Even_Ex("100","EvenException"),
    Odd_Ex("1001","OddException");
    String code;
    String message;

    ErrorCode(String code, String message) {
        this.code = code;
        this.message = message;
    }
}
