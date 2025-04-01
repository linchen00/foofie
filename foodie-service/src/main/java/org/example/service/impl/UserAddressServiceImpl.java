package org.example.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.example.mapper.UserAddressMapper;
import org.example.pojo.UserAddress;
import org.example.service.IUserAddressService;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 用户地址表  服务实现类
 * </p>
 *
 * @author Arthur
 * @since 2025-03-30
 */
@Service
public class UserAddressServiceImpl extends ServiceImpl<UserAddressMapper, UserAddress> implements IUserAddressService {

}
