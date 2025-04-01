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
 * 订单表;
 * </p>
 *
 * @author Arthur
 * @since 2025-03-30
 */
@Getter
@Setter
@ToString
@TableName("orders")
@Accessors(chain = true)
public class Orders {

    /**
     * 订单主键;同时也是订单编号
     */
    @TableId("id")
    private String id;

    /**
     * 用户id
     */
    @TableField("user_id")
    private String userId;

    /**
     * 收货人快照
     */
    @TableField("receiver_name")
    private String receiverName;

    /**
     * 收货人手机号快照
     */
    @TableField("receiver_mobile")
    private String receiverMobile;

    /**
     * 收货地址快照
     */
    @TableField("receiver_address")
    private String receiverAddress;

    /**
     * 订单总价格
     */
    @TableField("total_amount")
    private Integer totalAmount;

    /**
     * 实际支付总价格
     */
    @TableField("real_pay_amount")
    private Integer realPayAmount;

    /**
     * 邮费;默认可以为零，代表包邮
     */
    @TableField("post_amount")
    private Integer postAmount;

    /**
     * 支付方式
     */
    @TableField("pay_method")
    private Integer payMethod;

    /**
     * 买家留言
     */
    @TableField("left_msg")
    private String leftMsg;

    /**
     * 扩展字段
     */
    @TableField("extand")
    private String extand;

    /**
     * 买家是否评价;1：已评价，0：未评价
     */
    @TableField("is_comment")
    private Integer isComment;

    /**
     * 逻辑删除状态;1: 删除 0:未删除
     */
    @TableField("is_delete")
    private Integer isDelete;

    /**
     * 创建时间（成交时间）
     */
    @TableField("created_time")
    private LocalDateTime createdTime;

    /**
     * 更新时间
     */
    @TableField("updated_time")
    private LocalDateTime updatedTime;
}
