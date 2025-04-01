package org.example.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.example.mapper.UsersMapper;
import org.example.pojo.Users;
import org.example.service.IUsersService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 * <p>
 * 用户表  服务实现类
 * </p>
 *
 * @author Arthur
 * @since 2025-03-30
 */
@Service
public class UsersServiceImpl extends ServiceImpl<UsersMapper, Users> implements IUsersService {

    private final UsersMapper usersMapper;

    public UsersServiceImpl(UsersMapper usersMapper) {
        this.usersMapper = usersMapper;
    }

    @Transactional(propagation = Propagation.SUPPORTS)
    @Override
    public boolean queryUsernameIsExist(String username) {
        return usersMapper.exists(new QueryWrapper<Users>().eq("username", username));
    }
}
