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
 * 商品参数 
 * </p>
 *
 * @author Arthur
 * @since 2025-03-30
 */
@Getter
@Setter
@ToString
@Accessors(chain = true)
@TableName("items_param")
public class ItemsParam {

    /**
     * 商品参数id
     */
    @TableId("id")
    private String id;

    /**
     * 商品外键id
     */
    @TableField("item_id")
    private String itemId;

    /**
     * 产地 产地，例：中国江苏
     */
    @TableField("produc_place")
    private String producPlace;

    /**
     * 保质期 保质期，例：180天
     */
    @TableField("foot_period")
    private String footPeriod;

    /**
     * 品牌名 品牌名，例：三只大灰狼
     */
    @TableField("brand")
    private String brand;

    /**
     * 生产厂名 生产厂名，例：大灰狼工厂
     */
    @TableField("factory_name")
    private String factoryName;

    /**
     * 生产厂址 生产厂址，例：大灰狼生产基地
     */
    @TableField("factory_address")
    private String factoryAddress;

    /**
     * 包装方式 包装方式，例：袋装
     */
    @TableField("packaging_method")
    private String packagingMethod;

    /**
     * 规格重量 规格重量，例：35g
     */
    @TableField("weight")
    private String weight;

    /**
     * 存储方法 存储方法，例：常温5~25°
     */
    @TableField("storage_method")
    private String storageMethod;

    /**
     * 食用方式 食用方式，例：开袋即食
     */
    @TableField("eat_method")
    private String eatMethod;

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
