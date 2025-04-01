package org.example.controller;

import org.apache.commons.lang3.StringUtils;
import org.example.result.JsonResult;
import org.example.result.ResponseStatusEnum;
import org.example.service.IUsersService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/passport")
public class PassportController {

    private final IUsersService usersService;

    PassportController(IUsersService usersService) {
        this.usersService = usersService;
    }

    @GetMapping("/usernameIsExist")
    public JsonResult usernameIsExist(@RequestParam String username) {

        if (StringUtils.isBlank(username)) {
            return JsonResult.failed(ResponseStatusEnum.USERNAME_NOT_BLANK);
        }

        boolean isExist = usersService.queryUsernameIsExist(username);
        if (isExist) {
            return JsonResult.failed(ResponseStatusEnum.USERNAME_EXIST);
        }
        return JsonResult.ok();
    }
}
