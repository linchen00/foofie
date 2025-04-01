package org.example.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.example.mapper.OrdersMapper;
import org.example.pojo.Orders;
import org.example.service.IOrdersService;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 订单表; 服务实现类
 * </p>
 *
 * @author Arthur
 * @since 2025-03-30
 */
@Service
public class OrdersServiceImpl extends ServiceImpl<OrdersMapper, Orders> implements IOrdersService {

}
