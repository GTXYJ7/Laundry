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
@TableName("t_score")
public class Score implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "socre_Id", type = IdType.AUTO)
    private Integer socreId;

    @TableField("score_user_Id")
    private Integer scoreUserId;

    @TableField("score_Time")
    private LocalDateTime scoreTime;

    @TableField("score_Change")
    private Integer scoreChange;

    @TableField("score_laun_Id")
    private Integer scoreLaunId;

    @TableField("score_laun_Name")
    private String scoreLaunName;

    @TableField("score_laun_m_Id")
    private Integer scoreLaunMId;

    @TableField("socre_laun_m_Name")
    private String socreLaunMName;

    @TableField("score_Reason")
    private Integer scoreReason;


}
