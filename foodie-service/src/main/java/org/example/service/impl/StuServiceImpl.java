package org.example.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.example.mapper.StuMapper;
import org.example.pojo.Stu;
import org.example.service.IStuService;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author Arthur
 * @since 2025-03-30
 */
@Service
public class StuServiceImpl extends ServiceImpl<StuMapper, Stu> implements IStuService {

}
