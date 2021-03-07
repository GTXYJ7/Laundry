package com.gtxyj.laundry_backend.my.service;

import com.gtxyj.laundry_backend.my.entity.Score;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author nbdnbb
 * @since 2021-03-01
 */
public interface IScoreService extends IService<Score> {

     List<Score> getscorelist(String user_id);
}
