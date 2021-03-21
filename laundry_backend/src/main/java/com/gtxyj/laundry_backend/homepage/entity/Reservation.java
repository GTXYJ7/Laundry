package com.gtxyj.laundry_backend.homepage.entity;

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
@TableName("t_reservation")
public class Reservation implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "reserv_Id", type = IdType.AUTO)
    private Integer reservId;

    @TableField("laun_Name")
    private String launName;

    @TableField("laun_m_Name")
    private String launMName;

    @TableField("reserv_Time")
    private LocalDateTime reservTime;

    @TableField("reserv_Mode")
    private String reservMode;

    @TableField("reserv_Tempe")
    private Integer reservTempe;

    @TableField("reserv_Money")
    private Double reservMoney;

    @TableField("reserv_user_Id")
    private Integer reservUserId;

    @TableField("reserv_user_Nname")
    private String reservUserNname;

    @TableField("reserv_State")
    private String reservState;

    @TableField("reserv_Number")
    private String reservNumber;


}
