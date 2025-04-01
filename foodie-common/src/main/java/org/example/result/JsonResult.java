package org.example.result;

import lombok.Getter;

@Getter
public class JsonResult {

    private final Integer code;

    private final String message;

    private final Object data;

    public JsonResult(Integer code, String message, Object data) {
        this.code = code;
        this.message = message;
        this.data = data;
    }

    public static JsonResult ok() {
        return new JsonResult(ResponseStatusEnum.SUCCESS.code(), ResponseStatusEnum.SUCCESS.message(), null);
    }

    public static JsonResult ok(Object data) {
        return new JsonResult(ResponseStatusEnum.SUCCESS.code(), ResponseStatusEnum.SUCCESS.message(), data);
    }

    public static JsonResult failed(Object data) {
        return new JsonResult(ResponseStatusEnum.FAILED.code(), ResponseStatusEnum.FAILED.message(), data);
    }

    public static JsonResult failed(ResponseStatusEnum responseStatusEnum) {
        return new JsonResult(responseStatusEnum.code(), responseStatusEnum.message(), null);
    }

    public static JsonResult custom(ResponseStatusEnum responseStatusEnum) {
        return new JsonResult(responseStatusEnum.code(), responseStatusEnum.message(), null);
    }

    public static JsonResult custom(ResponseStatusEnum responseStatusEnum, Object data) {
        return new JsonResult(responseStatusEnum.code(), responseStatusEnum.message(), data);
    }

}
