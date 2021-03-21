package com.gtxyj.laundry_backend.homepage.entity;

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
@TableName("t_laundry_m")
public class LaundryM implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "laun_m_Id", type = IdType.AUTO)
    private Integer launMId;

    @TableField("laun_Id")
    private Integer launId;

    @TableField("laun_Name")
    private String launName;

    @TableField("laun_m_Name")
    private String launMName;


}
