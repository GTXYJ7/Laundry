package com.gtxyj.laundry_backend.my.controller;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.gtxyj.laundry_backend.homepage.entity.Reservation;
import com.gtxyj.laundry_backend.homepage.service.IReservationService;
import com.gtxyj.laundry_backend.my.entity.Score;
import com.gtxyj.laundry_backend.my.entity.Userinfo;
import com.gtxyj.laundry_backend.my.service.IScoreService;
import com.gtxyj.laundry_backend.my.service.IUserinfoService;
import net.sf.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
<<<<<<< HEAD
 *
=======
 *
>>>>>>> NQR
 * @author nbdnbb
 * @since 2021-03-01
 */
@RestController
@RequestMapping("/my/aiservice")
public class MyController {
    @Autowired
    private IUserinfoService iUserinfoService;

    @Autowired
    private IScoreService iScoreService;

    @Autowired
    private IReservationService iReservationService;

    @RequestMapping(value = "/register",method = RequestMethod.POST)
    public JSONObject register(String openid, String nickname){
        JSONObject jsonObject = new JSONObject();
        try{
            if(openid == null || openid.equals("")){
                jsonObject.put("errcode","10001");
                jsonObject.put("errmsg","数据传输错误，账号为空");
                return jsonObject;
            }
            if(nickname == null || nickname.equals("")){
                jsonObject.put("errcode","10002");
                jsonObject.put("errmsg","数据传输错误，昵称为空");
                return jsonObject;
            }
            System.out.println("1");

            Userinfo user = iUserinfoService.SignIn(openid,nickname);
            System.out.println("2");
            if(user == null){
                jsonObject.put("errcode","10005");
                jsonObject.put("errmsg","用户已注册");
                return jsonObject;
            }else{
                jsonObject.put("errcode","0");
                jsonObject.put("data",user);
                System.out.println(jsonObject);
                return jsonObject;
            }
        }catch (Exception ex){
            System.out.println(ex);
            jsonObject.put("errcode","10004");
            jsonObject.put("errmsg","请求失败，发生未知错误");

        }
        return jsonObject;
    }

    @RequestMapping(value = "/login",method = RequestMethod.POST)
    public JSONObject login(String openid){
        JSONObject jsonObject = new JSONObject();
        try{
            if(openid == null || openid.equals("")){
                jsonObject.put("errcode","10001");
                jsonObject.put("errmsg","数据传输错误，账号为空");
                return jsonObject;
            }
            QueryWrapper<Userinfo> user = new QueryWrapper<>();
            user.eq("user_Openid",openid);
            Userinfo newuser =iUserinfoService.getOne(user);
            if (newuser == null){
                jsonObject.put("errcode","10006");
                jsonObject.put("errmsg","登陆失败，该用户尚未注册");
                return jsonObject;
            }
            jsonObject.put("errcode","0");
            jsonObject.put("data",newuser);
        }catch (Exception ex){
            jsonObject.put("errcode","10004");
            jsonObject.put("errmsg","登录失败，发生未知错误");
        }
        return jsonObject;
    }

    @RequestMapping(value = "/getscore",method = RequestMethod.POST)
    public JSONObject getscore(String user_id) {
        JSONObject jsonObject = new JSONObject();
        try {
            List<Score> scoreList = iScoreService.getscorelist(user_id);
            jsonObject.put("errcode","0");
            jsonObject.put("data",scoreList);
        }catch (Exception ex){
            jsonObject.put("errcode","10004");
            jsonObject.put("errmsg","获取积分列表失败，发生未知错误");
        }
        return jsonObject;
    }

    @RequestMapping(value = "/getreservation",method = RequestMethod.POST)
    public JSONObject getreservation(String user_id) {
        JSONObject jsonObject = new JSONObject();
        try {
            List<Reservation> reservationListList = iReservationService.getresvlist(user_id);
            jsonObject.put("errcode","0");
            jsonObject.put("data",reservationListList);
        }catch (Exception ex){
            jsonObject.put("errcode","10004");
            jsonObject.put("errmsg","获取预约记录失败，发生未知错误");
        }
        return jsonObject;
    }


}
