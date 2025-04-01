package org.example.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.example.mapper.ItemsCommentsMapper;
import org.example.pojo.ItemsComments;
import org.example.service.IItemsCommentsService;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 商品评价表  服务实现类
 * </p>
 *
 * @author Arthur
 * @since 2025-03-30
 */
@Service
public class ItemsCommentsServiceImpl extends ServiceImpl<ItemsCommentsMapper, ItemsComments> implements IItemsCommentsService {

}
