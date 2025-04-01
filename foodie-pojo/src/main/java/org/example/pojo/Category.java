package org.example.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.Accessors;

/**
 * <p>
 * 商品分类 
 * </p>
 *
 * @author Arthur
 * @since 2025-03-30
 */
@Getter
@Setter
@ToString
@TableName("category")
@Accessors(chain = true)
public class Category {

    /**
     * 主键
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 分类名称
     */
    @TableField("name")
    private String name;

    /**
     * 分类类型
     */
    @TableField("type")
    private Integer type;

    /**
     * 父id
     */
    @TableField("father_id")
    private Integer fatherId;

    /**
     * 图标
     */
    @TableField("logo")
    private String logo;

    /**
     * 口号
     */
    @TableField("slogan")
    private String slogan;

    /**
     * 分类图
     */
    @TableField("cat_image")
    private String catImage;

    /**
     * 背景颜色
     */
    @TableField("bg_color")
    private String bgColor;
}
