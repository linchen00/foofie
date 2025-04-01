package org.example.result;

import lombok.Getter;

@Getter
public class JsonResult {

    private final Integer code;

    private final String message;

    private final Object data;

    public static JsonResult ok() {
        return new JsonResult(ResponseStatusEnum.SUCCESS);
    }

    public static JsonResult ok(Object data) {
        return new JsonResult(ResponseStatusEnum.SUCCESS, data);
    }

    public static JsonResult failed() {
        return new JsonResult(ResponseStatusEnum.FAILED);
    }

    public static JsonResult failed(Object data) {
        return new JsonResult(ResponseStatusEnum.FAILED, data);
    }

    public JsonResult(ResponseStatusEnum responseStatusEnum) {
        this.code = responseStatusEnum.code();
        this.message = responseStatusEnum.message();
        this.data = null;
    }

    public JsonResult(ResponseStatusEnum responseStatusEnum, Object data) {
        this.code = responseStatusEnum.code();
        this.message = responseStatusEnum.message();
        this.data = data;
    }

}
