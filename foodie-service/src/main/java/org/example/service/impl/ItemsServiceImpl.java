package org.example.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.example.mapper.ItemsMapper;
import org.example.pojo.Items;
import org.example.service.IItemsService;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 商品表 商品信息相关表：分类表，商品图片表，商品规格表，商品参数表 服务实现类
 * </p>
 *
 * @author Arthur
 * @since 2025-03-30
 */
@Service
public class ItemsServiceImpl extends ServiceImpl<ItemsMapper, Items> implements IItemsService {

}
