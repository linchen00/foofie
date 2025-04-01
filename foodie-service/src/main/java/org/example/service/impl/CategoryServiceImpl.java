package org.example.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.example.mapper.CategoryMapper;
import org.example.pojo.Category;
import org.example.service.ICategoryService;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 商品分类  服务实现类
 * </p>
 *
 * @author Arthur
 * @since 2025-03-30
 */
@Service
public class CategoryServiceImpl extends ServiceImpl<CategoryMapper, Category> implements ICategoryService {

}
