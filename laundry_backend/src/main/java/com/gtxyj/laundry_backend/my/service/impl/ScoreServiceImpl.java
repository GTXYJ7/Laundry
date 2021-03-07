package com.gtxyj.laundry_backend.my.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.gtxyj.laundry_backend.my.entity.Score;
import com.gtxyj.laundry_backend.my.mapper.ScoreMapper;
import com.gtxyj.laundry_backend.my.service.IScoreService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author nbdnbb
 * @since 2021-03-01
 */
@Service
public class ScoreServiceImpl extends ServiceImpl<ScoreMapper, Score> implements IScoreService {

    @Override
    public List<Score> getscorelist(String user_id) {
        QueryWrapper<Score> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("score_user_Id",user_id);
        List<Score> scoreList = list(queryWrapper);
        return scoreList;
    }
}
