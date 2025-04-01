package org.example.pojo;

import com.baomidou.mybatisplus.annotation.FieldFill;
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
 * 轮播图 
 * </p>
 *
 * @author Arthur
 * @since 2025-03-30
 */
@Getter
@Setter
@ToString
@TableName("carousel")
@Accessors(chain = true)
public class Carousel {

    /**
     * 主键
     */
    @TableId("id")
    private String id;

    /**
     * 图片 图片地址
     */
    @TableField("image_url")
    private String imageUrl;

    /**
     * 背景色
     */
    @TableField("background_color")
    private String backgroundColor;

    /**
     * 商品id 商品id
     */
    @TableField("item_id")
    private String itemId;

    /**
     * 商品分类id 商品分类id
     */
    @TableField("cat_id")
    private String catId;

    /**
     * 轮播图类型 轮播图类型，用于判断，可以根据商品id或者分类进行页面跳转，1：商品 2：分类
     */
    @TableField("type")
    private Integer type;

    /**
     * 轮播图展示顺序
     */
    @TableField("sort")
    private Integer sort;

    /**
     * 是否展示
     */
    @TableField("is_show")
    private Integer isShow;

    /**
     * 创建时间 创建时间
     */
    @TableField(value = "create_time", fill = FieldFill.INSERT)
    private LocalDateTime createTime;

    /**
     * 更新时间 更新
     */
    @TableField(value = "update_time", fill = FieldFill.INSERT_UPDATE)
    private LocalDateTime updateTime;
}
