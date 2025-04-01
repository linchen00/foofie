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
 * 用户地址表 
 * </p>
 *
 * @author Arthur
 * @since 2025-03-30
 */
@Getter
@Setter
@ToString
@Accessors(chain = true)
@TableName("user_address")
public class UserAddress {

    /**
     * 地址主键id
     */
    @TableId("id")
    private String id;

    /**
     * 关联用户id
     */
    @TableField("user_id")
    private String userId;

    /**
     * 收件人姓名
     */
    @TableField("receiver")
    private String receiver;

    /**
     * 收件人手机号
     */
    @TableField("mobile")
    private String mobile;

    /**
     * 省份
     */
    @TableField("province")
    private String province;

    /**
     * 城市
     */
    @TableField("city")
    private String city;

    /**
     * 区县
     */
    @TableField("district")
    private String district;

    /**
     * 详细地址
     */
    @TableField("detail")
    private String detail;

    /**
     * 扩展字段
     */
    @TableField("extand")
    private String extand;

    /**
     * 是否默认地址
     */
    @TableField("is_default")
    private Integer isDefault;

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
