package com.gtxyj.laundry_backend.my.service;

import com.gtxyj.laundry_backend.my.entity.Userinfo;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author nbdnbb
 * @since 2021-03-01
 */
public interface IUserinfoService extends IService<Userinfo> {

    Userinfo SignIn(String openid, String nickname);
}
