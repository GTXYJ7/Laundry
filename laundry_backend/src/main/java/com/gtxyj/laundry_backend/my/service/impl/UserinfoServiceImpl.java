package com.gtxyj.laundry_backend.my.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.gtxyj.laundry_backend.my.entity.Userinfo;
import com.gtxyj.laundry_backend.my.mapper.UserinfoMapper;
import com.gtxyj.laundry_backend.my.service.IUserinfoService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author nbdnbb
 * @since 2021-03-01
 */
@Service
public class UserinfoServiceImpl extends ServiceImpl<UserinfoMapper, Userinfo> implements IUserinfoService {
    @Override
    public Userinfo SignIn(String openid, String nickname) {
        QueryWrapper<Userinfo> user = new QueryWrapper<>();
        user.eq("user_Openid",openid);
        if(getOne(user) == null){
            Userinfo newuser = new Userinfo();
            newuser.setUserNickname(nickname);
            newuser.setUserOpenid(openid);
            newuser.setUserScore(100);
            save(newuser);
            return newuser;
        }else {
            return null;
        }
    }
}
