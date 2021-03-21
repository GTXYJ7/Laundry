package com.gtxyj.laundry_backend.homepage.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.gtxyj.laundry_backend.homepage.entity.Reservation;
import com.gtxyj.laundry_backend.homepage.mapper.ReservationMapper;
import com.gtxyj.laundry_backend.homepage.service.IReservationService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.gtxyj.laundry_backend.my.entity.Score;
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
public class ReservationServiceImpl extends ServiceImpl<ReservationMapper, Reservation> implements IReservationService {

    @Override
    public List<Reservation> getresvlist(String user_id) {
        QueryWrapper<Reservation> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("reserv_user_Id",user_id);
        List<Reservation> reservationListList = list(queryWrapper);
        return reservationListList;


    }
}
