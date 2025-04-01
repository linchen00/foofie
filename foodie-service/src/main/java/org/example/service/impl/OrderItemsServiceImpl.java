package org.example.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.example.mapper.OrderItemsMapper;
import org.example.pojo.OrderItems;
import org.example.service.IOrderItemsService;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 订单商品关联表  服务实现类
 * </p>
 *
 * @author Arthur
 * @since 2025-03-30
 */
@Service
public class OrderItemsServiceImpl extends ServiceImpl<OrderItemsMapper, OrderItems> implements IOrderItemsService {

}
