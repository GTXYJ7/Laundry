package com.gtxyj.laundry_backend.my.entity;

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
@TableName("t_aiservice")
public class Aiservice implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "aiservice_Id", type = IdType.AUTO)
    private Integer aiserviceId;

    @TableField("aiservice_Question")
    private String aiserviceQuestion;

    @TableField("aiservice_Answer")
    private String aiserviceAnswer;


}
