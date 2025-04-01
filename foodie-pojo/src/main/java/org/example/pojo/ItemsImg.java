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
 * 商品图片 
 * </p>
 *
 * @author Arthur
 * @since 2025-03-30
 */
@Getter
@Setter
@ToString
@TableName("items_img")
@Accessors(chain = true)
public class ItemsImg {

    /**
     * 图片主键
     */
    @TableId("id")
    private String id;

    /**
     * 商品外键id 商品外键id
     */
    @TableField("item_id")
    private String itemId;

    /**
     * 图片地址 图片地址
     */
    @TableField("url")
    private String url;

    /**
     * 顺序 图片顺序，从小到大
     */
    @TableField("sort")
    private Integer sort;

    /**
     * 是否主图 是否主图，1：是，0：否
     */
    @TableField("is_main")
    private Integer isMain;

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
