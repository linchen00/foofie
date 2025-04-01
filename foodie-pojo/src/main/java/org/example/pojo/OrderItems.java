package org.example.pojo;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.Accessors;

/**
 * <p>
 * 订单商品关联表 
 * </p>
 *
 * @author Arthur
 * @since 2025-03-30
 */
@Getter
@Setter
@ToString
@Accessors(chain = true)
@TableName("order_items")
public class OrderItems {

    /**
     * 主键id
     */
    @TableId("id")
    private String id;

    /**
     * 归属订单id
     */
    @TableField("order_id")
    private String orderId;

    /**
     * 商品id
     */
    @TableField("item_id")
    private String itemId;

    /**
     * 商品图片
     */
    @TableField("item_img")
    private String itemImg;

    /**
     * 商品名称
     */
    @TableField("item_name")
    private String itemName;

    /**
     * 规格id
     */
    @TableField("item_spec_id")
    private String itemSpecId;

    /**
     * 规格名称
     */
    @TableField("item_spec_name")
    private String itemSpecName;

    /**
     * 成交价格
     */
    @TableField("price")
    private Integer price;

    /**
     * 购买数量
     */
    @TableField("buy_counts")
    private Integer buyCounts;
}
