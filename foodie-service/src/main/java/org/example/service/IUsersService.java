package org.example.service;

import com.baomidou.mybatisplus.extension.service.IService;
import org.example.pojo.Users;

/**
 * <p>
 * 用户表  服务类
 * </p>
 *
 * @author Arthur
 * @since 2025-03-30
 */
public interface IUsersService extends IService<Users> {

    boolean queryUsernameIsExist(String username);

}
