package com.gtxyj.laundry_backend.my.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.time.LocalDateTime;
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
@TableName("t_liquiddosage")
public class Liquiddosage implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "liquid_Id", type = IdType.AUTO)
    private Integer liquidId;

    @TableField("liquid_user_Id")
    private Integer liquidUserId;

    @TableField("liquid_Time")
    private LocalDateTime liquidTime;

    @TableField("liquid_Dosage")
    private Integer liquidDosage;

    @TableField("liquid_luan_Id")
    private Integer liquidLuanId;

    @TableField("liquid_laun_Name")
    private String liquidLaunName;

    @TableField("liquid_Cost")
    private Double liquidCost;


}
