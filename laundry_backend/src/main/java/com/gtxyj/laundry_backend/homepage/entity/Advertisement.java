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
@TableName("t_advertisement")
public class Advertisement implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "adver_Id", type = IdType.AUTO)
    private Integer adverId;

    @TableField("adver_Url")
    private String adverUrl;


}
