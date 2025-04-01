package org.example.pojo;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.Accessors;

import java.math.BigDecimal;
import java.time.LocalDateTime;
/**
 * <p>
 * 商品规格 每一件商品都有不同的规格，不同的规格又有不同的价格和优惠力度，规格表为此设计
 * </p>
 *
 * @author Arthur
 * @since 2025-03-30
 */
@Getter
@Setter
@ToString
@Accessors(chain = true)
@TableName("items_spec")
public class ItemsSpec {

    /**
     * 商品规格id
     */
    @TableId("id")
    private String id;

    /**
     * 商品外键id
     */
    @TableField("item_id")
    private String itemId;

    /**
     * 规格名称
     */
    @TableField("name")
    private String name;

    /**
     * 库存
     */
    @TableField("stock")
    private Integer stock;

    /**
     * 折扣力度
     */
    @TableField("discounts")
    private BigDecimal discounts;

    /**
     * 优惠价
     */
    @TableField("price_discount")
    private Integer priceDiscount;

    /**
     * 原价
     */
    @TableField("price_normal")
    private Integer priceNormal;

    /**
     * 创建时间
     */
    @TableField("created_time")
    private LocalDateTime createdTime;

    /**
     * 更新时间
     */
    @TableField("updated_time")
    private LocalDateTime updatedTime;
}
