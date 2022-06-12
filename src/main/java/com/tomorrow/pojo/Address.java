package com.tomorrow.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import java.util.Date;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.TableLogic;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 
 * </p>
 *
 * @author yinqiming
 * @since 2022-06-12
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class Address implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 地址表主键
     */
    @TableId(value = "address_id", type = IdType.AUTO)
    private Integer addressId;

    /**
     * 省份
     */
    private String province;

    /**
     * 城市
     */
    private String city;

    /**
     * 县/区
     */
    private String district;

    /**
     * 详细地址
     */
    private String detail;

    /**
     * 状态
     */
    @TableField(fill = FieldFill.INSERT)
    private Integer status;

    /**
     * 创建时间
     */
    @TableField(fill = FieldFill.INSERT)
    private Date createTime;

    /**
     * 修改时间
     */
    @TableField(fill = FieldFill.INSERT_UPDATE)
    private Date updateTime;

    /**
     * 是否删除
     */
    @TableField(fill = FieldFill.INSERT)
    @TableLogic
    private Integer isDeleted;


}
