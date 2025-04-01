package org.example.result;

public enum ResponseStatusEnum {
    SUCCESS(200, "success"),
    USERNAME_NOT_BLANK(10001, "用户名不能为空"),
    USERNAME_EXIST(10002, "用户名已存在"),
    USERNAME_NOT_EXIST(10003, "用户名不存在"),
    FAILED(500, "failure");


    private final Integer code;
    private final String message;

    ResponseStatusEnum(Integer code, String message) {
        this.message = message;
        this.code = code;
    }

    public Integer code() {
        return code;
    }

    public String message() {
        return message;
    }

}
