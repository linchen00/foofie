package org.example.pojo;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.Accessors;

import java.time.LocalDateTime;
/**
 * <p>
 * 订单状态表;订单的每个状态更改都需要进行记录
10：待付款  20：已付款，待发货  30：已发货，待收货（7天自动确认）  40：交易成功（此时可以评价）50：交易关闭（待付款时，用户取消 或 长时间未付款，系统识别后自动关闭）
退货/退货，此分支流程不做，所以不加入
 * </p>
 *
 * @author Arthur
 * @since 2025-03-30
 */
@Getter
@Setter
@ToString
@Accessors(chain = true)
@TableName("order_status")
public class OrderStatus {

    /**
     * 订单ID;对应订单表的主键id
     */
    @TableId("order_id")
    private String orderId;

    /**
     * 订单状态
     */
    @TableField("order_status")
    private Integer orderStatus;

    /**
     * 订单创建时间;对应[10:待付款]状态
     */
    @TableField("created_time")
    private LocalDateTime createdTime;

    /**
     * 支付成功时间;对应[20:已付款，待发货]状态
     */
    @TableField("pay_time")
    private LocalDateTime payTime;

    /**
     * 发货时间;对应[30：已发货，待收货]状态
     */
    @TableField("deliver_time")
    private LocalDateTime deliverTime;

    /**
     * 交易成功时间;对应[40：交易成功]状态
     */
    @TableField("success_time")
    private LocalDateTime successTime;

    /**
     * 交易关闭时间;对应[50：交易关闭]状态
     */
    @TableField("close_time")
    private LocalDateTime closeTime;

    /**
     * 留言时间;用户在交易成功后的留言时间
     */
    @TableField("comment_time")
    private LocalDateTime commentTime;
}
