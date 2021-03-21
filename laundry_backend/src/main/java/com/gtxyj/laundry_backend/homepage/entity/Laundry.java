package com.gtxyj.laundry_backend.homepage.entity;

import java.math.BigDecimal;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 
 * </p>
 *
 * @author nbdnbb
 * @since 2021-03-01
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("t_laundry")
public class Laundry implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "laun_Id", type = IdType.AUTO)
    private Integer launId;

    @TableField("laun_Name")
    private String launName;

    @TableField("laun_Latitude")
    private BigDecimal launLatitude;

    @TableField("laun_Longitude")
    private BigDecimal launLongitude;

    @TableField("laun_Left")
    private Integer launLeft;


}
